package com.epam.webapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.epam.webapp.connection.DBconnection;
import com.epam.webapp.dao.UserDao;
import com.epam.webapp.entities.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/user-login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {

	}

	/*
	 * protected void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * response.setContentType("text/html; charset=UTF-8");
	 * 
	 * try (PrintWriter out = response.getWriter()) { String email =
	 * request.getParameter("login-email"); String password =
	 * request.getParameter("login-password");
	 * 
	 * UserDao udao = new UserDao(DBconnection.getConnection()); User user =
	 * udao.userLogin(email, password); if (user != null) {
	 * 
	 * out.print("some user+++++");
	 * 
	 * } else { out.print(" no user-----"); } } }
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("login-email");
		String password = request.getParameter("login-password");

		User user = new User();

		user.setEmail(email);
		user.setPassword(password);

		UserDao udao = new UserDao(DBconnection.getConnection());

		try {
			String userValidate = udao.authenticateUser(user);

			if (userValidate.equals("Admin_Role")) {

				HttpSession session = request.getSession(); // Creating a session
				session.setAttribute("admin", email); // setting session attribute
				request.setAttribute("email", email);

				request.getRequestDispatcher("admin.jsp").forward(request, response);

			} else if (userValidate.equals("User_Role")) {

				HttpSession session = request.getSession();
				session.setMaxInactiveInterval(10 * 60);
				session.setAttribute("user", email);
				request.setAttribute("email", email);

				request.getRequestDispatcher("index.jsp").forward(request, response);

			} else {

				System.out.println("Error message = " + userValidate);
				request.setAttribute("errMessage", userValidate);
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}

		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
