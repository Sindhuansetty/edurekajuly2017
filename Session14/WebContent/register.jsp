<%@page import="co.edureka.JDBCHelper"%>
<%@page import="co.edureka.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		User user = new User();
		user.setUid(1000);
		user.setEmail(email);
		user.setPassword(password);
		
		// JDBC Code
		JDBCHelper helper = new JDBCHelper(); // Driver Loads Here
		helper.openConnection(); // Connection Created
		helper.insertUser(user);
		helper.closeConnection();
		
		
		out.print("You have beeen Registered Successfully...!!");
		
	%>
	
</body>
</html>