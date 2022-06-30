<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/6/2022
  Time: 1:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<h1>Update Product</h1>
<form method="post">
    <legend>Update Form</legend>
    <fieldset>
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="text" name="price"></td>
            </tr>
            <tr>
                <td>Desc:</td>
                <td><input type="text" name="getDescriptionOfThe"></td>
            </tr>
            <tr>
                <td>Brand:</td>
                <td><input type="text" name="getProducer"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Update"></td>
                <td><a href="/products">Back to list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
