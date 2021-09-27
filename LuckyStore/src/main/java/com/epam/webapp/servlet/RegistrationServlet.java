package com.epam.webapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.webapp.connection.DBconnection;
import com.epam.webapp.dao.UserDao;
import com.epam.webapp.entities.User;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("registration.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = new User();
		user.setName(request.getParameter("registr-name"));
		user.setSurname(request.getParameter("registr-surname"));
		user.setEmail(request.getParameter("registr-email"));
		user.setPassword(request.getParameter("registr-password"));
		user.setRole("user");
		
		UserDao udao = new UserDao(DBconnection.getConnection());
		Boolean userRegistered = udao.saveUser(user);
		if (userRegistered.equals(true)) {
			 request.getRequestDispatcher("/index.jsp").forward(request, response);
		} else {
            request.getRequestDispatcher("/registration.jsp").forward(request, response);
		}
		request.getRequestDispatcher("registration.jsp").forward(request, response);
	}

}
