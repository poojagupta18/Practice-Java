<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateServlet">
		<input type="hidden" name="userId" value="${param.userId}"> <br>
		<input type="hidden" name="userId" value="${param.userId}"> <br>
		
		<input type = "submit" name = "username" value = " Update Username"><br>
		<input type = "submit" name = "password" value = " Update Password"><br>
		<input type = "submit" name = "name" value = " Update Name"><br>
		<input type = "submit" name = "address" value = " Update ">
		<input type = "submit" name = "name" value = "Username">
		<br>
		<input type = "text" name = "">
	</form>
</body>
</html>