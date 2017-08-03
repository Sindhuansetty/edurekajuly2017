package co.edureka.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.dao.UserDAO;
import co.edureka.dao.UserDAOImpl;
import co.edureka.model.User;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet({ "/RegisterUser", "/RegisterController" })
public class RegisterUser extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("txtEmail");
		String pass = request.getParameter("txtPass");
		String city = request.getParameter("txtCity");
		
		User user = new User();
		user.setEmail(email);
		user.setPassword(pass);
		user.setCity(city);
		
		UserDAO dao = new UserDAOImpl();
		dao.registerUser(user);
	}

}
