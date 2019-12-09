<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equi="Content-Type" content = "text\html" charset="ISO-8859-1">
<title>JSP List Users</title>
</head>
<body bgcolor = violet>
	<sql:setDataSource
		var = "myDS"
		driver = "com.mysql.cj.jdbc.Driver"
		url = "jdbc:mysql://localhost:3306/Allianz?serverTimezone=UTC"
		user = "root" password = ""		
	/>
	
	<sql:query var = "ListUsers" dataSource="${myDS}" >
		SELECT * from user;
	</sql:query>
	
	<div align="center">
		<table border = "1" cellpadding="5" bgcolor="yellow">
			<tr>
				<th>Userid</th>
				<th>Name</th>
				<th>UserName</th>
				<th>Password</th>
				<th>Address</th>
				<th>Update</th>
			</tr>
			<c:forEach var = "user" items = "${ListUsers.rows}">
			<tr>
				<td><font color="gray"><c:out value="${user.id}"/></font></td>	
				<td><font color="gray"><c:out value="${user.name}"/></font></td>
				<td><font color="brown"><c:out value="${user.username}"/></font></td>
				<td><font color="gray"><c:out value="${user.password}"/></font></td>
				<td><font color="gray"><c:out value="${user.address}"/></font></td>
				<td><a href="Update.jsp?userId=${user.id}&name=${user.name}&username=${user.username}&password=${user.password}&address=${user.address}"> update</a>/<a href="DeleteServlet?userId=${user.id}">delete </a></td>
				
			</c:forEach>
		</table>
	</div>
</body>
</html>