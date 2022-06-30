<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/29/2022
  Time: 1:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>wed san pham</title>
</head>
<body>
<h2>Product</h2>
<h1>Create new customer</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/product">Back to customer list</a>
</p>
<form method="post">
<table border="1px">
    <tr>
        <td>productName</td>
        <td>productPrice</td>
        <td>productDescriptionOfThe</td>
        <td>productProducer</td>
        <td>edit</td>
        <td>delete</td>
        <c:forEach items="${productList}" var="product">
    <tr>
        <td><a href="/product?action=view&id=${product.productId}">${product.productName}</a></td>
        <td>${product.productPrice}</td>
        <td>${product.productDescriptionOfThe}</td>
        <td>${product.productProducer}</td>
        <td><a href="/product?action=edit&id =${product.productId}">edit</a></td>
        <td><a href="/product?action=delete&id =${product.productId}">delete</a></td>
    </tr>
    </c:forEach>
    </tr>
</table>
</form>
</body>
</html>
