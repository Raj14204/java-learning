<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
 int age=18;
%>
<%
//it is used as servalte area 
String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
out.println("<h1>Registration Done</h1>");
%>
</body>
</html>