<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/6/2022
  Time: 1:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
<h1>Delete Product</h1>
<form method="post">
    <legend>Product</legend>
    <fieldset>
        <table>
            <tr>
                <td>Name: </td>
                <td>${requestScope["products"].getName()}</td>
            </tr>
            <tr>
                <td>Price: </td>
                <td>${requestScope["products"].getPrice()}</td>
            </tr>
            <tr>
                <td>Desc: </td>
                <td>${requestScope["products"].getDescriptionOfThe()}</td>
            </tr>
            <tr>
                <td>Brand: </td>
                <td>${requestScope["products"].getProducer()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="detail"></td>
                <td><a href="/products">back product list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>