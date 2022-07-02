<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/7/2022
  Time: 8:37 PM
  To change this template use File | Settings | File Templates.
--%>
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
                <td>${name}</td>
            </tr>
            <tr>
                <td>gia: </td>
                <td>${gia}</td>
            </tr>
            <tr>
                <td>mo ta: </td>
                <td>${moTa}</td>
            </tr>
            <tr>
                <td>hang: </td>
                <td>${hang}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete"></td>
                <td><a href="/products">back product list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>