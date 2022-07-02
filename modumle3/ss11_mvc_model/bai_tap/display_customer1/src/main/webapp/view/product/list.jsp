<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/6/2022
  Time: 12:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<h1>Danh sách sản phẩm</h1>
<h3>Search</h3>
<form method="post"  action="/products?action=search">
    <input type="text" name="search">
    <input type="submit" value="press me">
</form>
<a href="/products?action=create">tạo mới product</a>

<table border="1" >
    <tr>
        <th>ID</th>
        <th>Tên</th>
        <th>Giá</th>
        <th>mo tả</th>
        <th>Hãng</th>
    </tr>
    <c:forEach var="item" items="${products}">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.price}</td>
            <td>${item.descriptionOfThe}</td>
            <td>${item.getProducer()}</td>

            <td><a href="/products?action=update&id=${item.getId()}">update</a></td>
            <td><a href="/products?action=delete&id=${item.getId()}">delete</a></td>
            <td><a href="/products?action=detail&id=${item.getId()}">detail</a></td>
        </tr>
    </c:forEach>
</table>
<body>
<html>

