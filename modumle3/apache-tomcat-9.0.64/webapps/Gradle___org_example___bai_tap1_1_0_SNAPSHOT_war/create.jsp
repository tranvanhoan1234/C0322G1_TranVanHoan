<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/29/2022
  Time: 1:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new customer</title>
    <style>
        .message{
            color:green;
        }
    </style>
</head>
<body>
<h1>Create new Product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/product">Back to customer list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
<%--                private Integer productId;--%>
<%--                private String productName;--%>
<%--                private Double productPrice;--%>
<%--                private String productDescriptionOfThe;--%>
<%--                private String productProducer;--%>
                <td>productName: </td>
                <td><input type="text" name="productName" id="productName"></td>
            </tr>
            <tr>
                <td>productPrice: </td>
                <td><input type="text" name="productPrice" id="productPrice"></td>
            </tr>
            <tr>
                <td>productDescriptionOfThe: </td>
                <td><input type="text" name="productDescriptionOfThe" id="productDescriptionOfThe"></td>
            </tr><tr>
                <td>productProducer: </td>
                <td><input type="text" name="productProducer" id="productProducer"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>