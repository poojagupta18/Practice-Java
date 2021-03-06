<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="2">
		<tr>
			<th>Id</th>
			<th>Code</th>
			<th>Description</th>
			<th>Price</th>
			<th>Manufacturing Date</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${productList}" var="product">
			<tr>
				<td>${product.id}</td>
				<td>${product.code}</td>
				<td>${product.description}</td>
				<td>${product.price}</td>
				<td><fmt:formatDate value="${product.manifDate}"
						pattern="dd/MM/yyyy" /></td>
				<td><a href="ProductController?action=edit&id=${product.id}">Edit</a>|<a href="ProductController?action=delete&id=${product.id}">Delete</a></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>