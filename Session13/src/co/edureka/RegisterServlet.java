package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/RegisterServlet", "/Register", "/Awesome" })
public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// request is to read the data from client
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		String name = request.getParameter("txtName");
		System.out.println(email+ " - "+ password+" - "+name);
		
		// response is to send back data to the client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // PrintWriter API shall help to write back the response
		
		out.print("Registering User...");
	}

}
