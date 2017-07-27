package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		PrintWriter out = response.getWriter();
		
		// Code above chain.doFilter shall be pre processed
		String t1 = new Date().toString();
		out.print("Pre Processing TimeStamp1 is: "+t1+"<br/>");
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		if(!email.isEmpty() && !password.isEmpty()){
			// pass the request along the filter chain
			chain.doFilter(request, response); // will forward the request to linked Servlet
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("existinguser.html");
			rd.include(request, response);
		}
		
		// Code below chain.doFilter shall be post processed
		// Below Code shall be executed when response from LoginServlet shall be sent
		String t2 = new Date().toString();
		out.println("Post Processing TimeStamp2 is: "+t2+"<br/>");
	}


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
