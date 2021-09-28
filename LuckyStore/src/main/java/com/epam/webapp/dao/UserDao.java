package com.epam.webapp.dao;

import java.sql.*;

import com.epam.webapp.connection.DBconnection;
import com.epam.webapp.entities.*;

public class UserDao {
	private Connection con;
	// private String query;
	private PreparedStatement pst;
	private ResultSet rs;

	public UserDao(Connection con) {
		this.con = con;
	}
	
	public boolean saveUser(User user){
        boolean set = false;
        try{
            //Insert register data to database
            String query = "insert into user(name,surname,email,password,role) values(?,?,?,?,?)";
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1, user.getName());
           pt.setString(2, user.getSurname());
           pt.setString(3, user.getEmail());
           pt.setString(4, user.getPassword());
           pt.setString(5, user.getRole());
           
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
	
	public String authenticateUser(User user) {
		String email = user.getEmail();
		String password = user.getPassword();

		String emailDB = "";
		String passwordDB = "";
		String roleDB = "";

		try {
			con = DBconnection.getConnection();
			pst = con.prepareStatement("select email,password,role from user");
			rs = pst.executeQuery();

			while (rs.next()) {
				emailDB = rs.getString("email");
				passwordDB = rs.getString("password");
				roleDB = rs.getString("role");

				if (email.equals(emailDB) && password.equals(passwordDB) && roleDB.equals("admin"))
					return "Admin_Role";
				else if (email.equals(emailDB) && password.equals(passwordDB) && roleDB.equals("user"))
					return "User_Role";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Invalid user credentials";
	}

}
