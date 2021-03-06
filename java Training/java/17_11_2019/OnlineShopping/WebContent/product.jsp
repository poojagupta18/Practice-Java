<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ProductController" method="post">

<c:if test="${param.action eq 'edit'}">
<input type = "hidden" name = "action" value = "update">
</c:if>

<c:if test="${param.action eq null} ">
<input type = "hidden" name = "action" value = "save">

</c:if>
<table border = 2>
<tr>
<td>Id</td>
<td><input type = "text" name = "id" id = "id" value = "${product.id}"></td>
</tr>

<tr>
<td>code</td>
<td><input type = "text" name = "code" id = "id" value = "${product.code}"></td>
</tr>

<tr>
<td>Description</td>
<td><input type = "text" name = "description" id = "id" value = "${product.description}"></td>
</tr>

<tr>
<td>Price</td>
<td><input type = "text" name = "price" id = "id" value = "${product.price}"></td>
</tr>

<tr>
<td>Manufacturing Date</td>
<fmt:formatDate value="${product.manifDate}" pattern = "dd/mm/yyyy" />
<td><input type = "text" name = "manDate" id = "manfDate" value = "${manifDate} "></td>
</tr>
<tr>
<td><input type = "submit" value = "submit"></td>
<td><input type = "reset" value = "Reset"></td>
</tr>
</table> 
</form>
</body>
</html>