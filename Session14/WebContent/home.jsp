<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4><i>Welcome Home Dear Admin</i></h4>
	<br/>
	Session Data:
	<br/>
	<%
		/*
		Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		
		String name = (String)session.getAttribute("keyName");
		String age = (String)session.getAttribute("keyAge");
		String address = (String)session.getAttribute("keyAddress");
		
		//pageContext.getAttribute("keyName");
		
		out.print(name+" - "+age+" - "+address);
	%>
</body>
</html>