package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet({ "/HomeServlet", "/Home", "/Welcome" })
public class HomeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String email = request.getParameter("txtEmail");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // PrintWriter API shall help to write back the response
		
		//out.print("Welcome Home, "+email);
		
		// Read the Cookies from Client's Machine
		/*Cookie[] ckArr = request.getCookies(); 
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		
		/*String name = request.getParameter("name");
		String age = request.getParameter("age");
		String address = request.getParameter("address");*/
		
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("keyName");
		String age = (String)session.getAttribute("keyAge");
		String address = (String)session.getAttribute("keyAddress");
		
		//session.invalidate();
		
		out.print("Welcome Home, "+name+"<br/>");
		out.print("Your age is: "+age+" and your address is: "+address+"<br/>");
	}

}
