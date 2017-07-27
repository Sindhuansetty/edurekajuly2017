<%@page import="co.edureka.Student"%>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h4>This is HTML Code</h4>
	
	<br/>
	<h4>Scriptlet Demo</h4>
	
	<% 
		for(int i=1;i<=10;i++){
			out.print("5 "+i+"'s are "+(5*i)+"<br/>");
		}
	
		int a = 10;
		int b = 20;
		int c = a+b;
		out.print("<br/>Sum is: "+c+"<br/>");
		
		int age = 9;
		if(age>18){
	%>
		<b><i> You Can Vote. </i></b>
	<%		
		}else{
			
	%>
		<b><i> You Cannot Vote. </i></b>
	<%			
		}
	%>
	
	<br/>
	<h4>Declarative Demo</h4>
	<br/>

	<%!
		int num = 100;
		int squareOfNum(int n){
			return n*n;
		}
	%>
	
	<b>Square of 5 is: <% out.print(squareOfNum(5)); %></b>
	<br/>
	<b>Square of 10 is: <%= squareOfNum(10) %></b>
	
	<br/>
	<%
		int[] arr = {10,20,30,40,50};
		out.print("arr[0] is: "+arr[0]); // Exception
		
		/*try{
			out.print("arr[10] is: "+arr[10]); // Exception
		}catch(Exception e){
			out.print("Some Exception "+e);
		}*/
	%>
	<%-- <br/>
	<h4>Today is: <%= new Date() %></h4> --%>
	
	<h4>
		<jsp:include page="printdate.jsp"/>
	</h4>
	<br/>
	<%-- <jsp:forward page="printdate.jsp"/> --%>
	
	<%
		Student sRef = new Student();
		sRef.setRoll(101);
		sRef.setSname("John Watson");
		
		out.print("Student Details: "+sRef.getRoll()+" - "+sRef.getSname());
	%>
	
	<br/>
	
	<jsp:useBean id="sRef1" class="co.edureka.Student"></jsp:useBean>
	<jsp:setProperty property="roll" name="sRef1" value="102"/>
	<jsp:setProperty property="sname" name="sRef1" value="Jennie Watson"/>
	
	Roll is: <jsp:getProperty property="roll" name="sRef1"/>
	<br/>
	Name is: <jsp:getProperty property="sname" name="sRef1"/>

</body>
</html>