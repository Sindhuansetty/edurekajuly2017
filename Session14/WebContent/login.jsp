<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="printdate.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<br/>
	Email is: ${param.txtEmail}
	<br/>
	<%
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		if(email.equals("admin@example.com") && password.equals("password123")){
			
			String name = "John Watson";
			int age = 30;
			String address = "Redwood Shores";
			
			/*Cookie c1 = new Cookie("keyName",name);
			Cookie c2 = new Cookie("keyAge",String.valueOf(age));
			Cookie c3 = new Cookie("keyAddress",address);
			
			response.addCookie(c1);
			response.addCookie(c2);
			response.addCookie(c3);*/
			
			session.setAttribute("keyName", name);
			session.setAttribute("keyAge",String.valueOf(age));
			session.setAttribute("keyAddress",address);
			
			pageContext.setAttribute("keyName", name, PageContext.SESSION_SCOPE);
			
	%>
			<h4><i>Login is Success....</i></h4>
			<br/>
			<h4><i><a href="home.jsp">Enter Home</a></i></h4>
	<% 		
		}else{
	%>
		<h4><i>Login is Failure....</i></h4>
	<% 	
		response.sendRedirect("https://www.google.co.in");
		
		}
	%>

</body>
</html>