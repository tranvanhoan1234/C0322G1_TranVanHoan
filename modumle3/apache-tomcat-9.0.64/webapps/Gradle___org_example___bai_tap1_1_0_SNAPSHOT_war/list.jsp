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
<p>
    <a href="/product?action=create"></a>

</p>
<table border="1px">
    <tr>
        <td>productName</td>
        <td>productPrice</td>
        <td>productDescriptionOfThe</td>
        <td>productProducer</td>
        <td>edit</td>
        <td>delete</td>
        <c:forEach items='${requestScope["product"]}' var="product">
    <tr>
        <td><a href="/Products?action=view&id =${product.getId()}">${product.getProductName}</a></td>
        <td>${product.getProductPrice}</td>
        <td>${product.getProductDescriptionOfThe}</td>
        <td>${product.getProductProducer}</td>
        <td>${product.getProductProducer}</td>
        <td><a href="/Products?action=edit&id =${product.getId()}">edit</a></td>
        <td><a href="/Products?action=delete&id =${product.getId()}">delete</a></td>
    </tr>
    </c:forEach>
    </tr>
</table>
</body>
</html>
