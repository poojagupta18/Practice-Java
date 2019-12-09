<%@page import="com.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% User user = (User)session.getAttribute("user");
out.println("Name : " + user.getFirstName()+ "<br>");
out.println("User id : " + user.getUserid() + "<br>");
out.println("Username : " + user.getUsername() + "<br>");
out.println("password : " + user.getPassword() + "<br>");
out.println("Address : " + user.getAddress() + "<br>");
%> 

</body>
</html>