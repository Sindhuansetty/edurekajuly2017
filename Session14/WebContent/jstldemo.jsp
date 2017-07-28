<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isThreadSafe="true" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	For Loop Demo 
	<br/>
	<br/>
	<c:forEach var="i" begin="1" end="10">
		<b><i>i is: <c:out value="${i}"/></i></b><br/>
	</c:forEach>
	
	<c:set var="age" value="${20}" scope="session"/>
	<br/>
	<br/>
	<c:if test="${age>18}">
		<h4>You are <c:out value="${age}"/> years, and can Vote</h4>
	</c:if>	
	
	<c:redirect url="https://www.google.co.in"/>
	
	
</body>
</html>