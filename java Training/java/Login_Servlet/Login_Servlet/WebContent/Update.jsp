<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UpdateServlet">
		<input type="hidden" name="userId" value="${param.userId}"> <br>
		<input type="hidden" name="name" value="${param.name}"><br>
		<input type="hidden" name="username" value="${param.username}"><br>
		<input type="hidden" name="address" value="${param.address}"><br>
		<input type="hidden" name="password" value="${param.password}"><br>
		
		<input type="checkbox" name="chkname" value="name"> Update Name <input type = "text" name = "inputname"><br>
		<input type="checkbox" name="chkpassword" value="password"> Update password<input type = "text" name = "inputpassword"><br>
		<input type="checkbox" name="chkusername" value="username">Update Username<input type = "text" name = "inputusername"><br>
		<input type="checkbox" name="chkaddress" value="address"> Update address<input type = "text" name = "inputaddress"><br> 
		<input type="submit" value="Submit">
		
		
		
		
		
	</form>
</body>
</html>