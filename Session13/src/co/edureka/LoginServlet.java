package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

@WebServlet({ "/LoginServlet", "/Login" }) // URL Mappings
public class LoginServlet extends HttpServlet {

	// Acting as Constructor | For any initialization
	public void init(ServletConfig config) throws ServletException {
		System.out.println("--init executed--");
	}

	// Acting as Destructor | For any release of memory resources
	public void destroy() {
		System.out.println("--destroy executed--");
	}

	// any method request is handled by service method
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--service executed--");
		
		// request is to read the data from client
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		System.out.println(email+ " - "+ password);
		
		// response is to send back data to the client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // PrintWriter API shall help to write back the response
		
		out.print("<h3>Login Process...</h3><br/>");
		if(email.equals("admin@example.com") && password.equals("password123")){
			// Printing back the response
			out.print("<h4>Login is Success for Admin</h4>"); // Res from LoginServelt shall not be given back to the client if forward happens
			
			// from LoginServlet we are forwarding req and res to HomeServlet
			// response shall be shared back to the client from HomeServlet and not LoginServlet
			//RequestDispatcher rd = request.getRequestDispatcher("Welcome");
			//rd.forward(request, response);
			
			// Make a DB Operation and fetch some useful details of Admin
			// Using hard coded values for making you understand the concept
			// Values below are not a part of request and shall be shared into other servelts
			String name = "Geroge Watson";
			int age = 30;
			String address = "Redwood Shores";
			
			// Session Tracking (Storing the data somehow so that other resources may use it somewhere)
			// 1. Cookies
			/*Cookie c1 = new Cookie("keyName", name);
			Cookie c2 = new Cookie("keyAge", String.valueOf(age));
			Cookie c3 = new Cookie("keyAddress", address);
			
			//c1.setMaxAge(); // For Cookie's LifeLine
			
			// Cookie are stored in the browser (Client's Machine)
			response.addCookie(c1);
			response.addCookie(c2);
			response.addCookie(c3);*/
			
			//out.print("<a href='Welcome'>Enter Home Here</a>");
			
			// 2. URL Rewriting | QueryString
			//out.print("<a href='Welcome?name="+name+"&age="+age+"&address="+address+"'>Enter Home Here</a>");
			
			// 3. Hidden From Field
			/*out.print("<form action='Welcome' method='post'>");
			out.print("<input type='hidden' name='name' value='"+name+"'>");
			out.print("<input type='hidden' name='age' value='"+age+"'>");
			out.print("<input type='hidden' name='address' value='"+address+"'>");
			out.print("<input type='submit' value='Enter Home'>");
			out.print("</form>");*/
			
			//4. HttpSession API
			HttpSession session = request.getSession();
			session.setAttribute("keyName", name);
			session.setAttribute("keyAge", String.valueOf(age));
			session.setAttribute("keyAddress", address);
			
			out.print("<a href='Welcome'>Enter Home Here</a>");
			
		}else{
			out.print("<h4>Login is Failure for Admin</h4>"); // Response shall be now included
			//RequestDispatcher rd = request.getRequestDispatcher("index.html");
			//rd.include(request, response);
			
			// Redirection to other resource
			//response.sendRedirect("https://www.google.co.in");
		}
	}

}
