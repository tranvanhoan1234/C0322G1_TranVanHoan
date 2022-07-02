<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/7/2022
  Time: 10:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> tao mới</h2>
<a href="/products?action=create">tạo mới</a>
<table border="1px" >
    <tr>
    <th>id</th>
    <th>ten</th>
    <th>gia</th>
    <th>mota</th>
    <th> hang</th>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.id}</td>
            <td> ${product.name}</td>
            <td> ${product.gia}</td>
            <td>${product.moTa}</td>
            <td>${product.hang}</td>
            <td>
                <a href="/products?action=delete">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
