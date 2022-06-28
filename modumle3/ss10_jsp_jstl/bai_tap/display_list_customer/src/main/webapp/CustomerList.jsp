<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/28/2022
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<table class="table" style="border: solid 1px">
    <h2  style=text-align:center>Danh Sách Khách Hàng</h2>
    <tr style="border: solid 1px;text-align:center;">
        <th style="text-align: center;"><span style="padding:40px">ID</span></th>
        <th style="text-align: center; "><span style=" padding: 40px">Tên</span></th>
        <th style="text-align: center;"><span style="padding: 40px">Ngày Sinh</span></th>
        <th style="text-align: center;"><span style="padding: 40px">địa chỉ</span></th>
        <th style="text-align: center;"><span style="padding: 40px">ảnh</span></th>
    </tr>
        <c:forEach items="${custumer}" var="item">
    <tr style="border: solid 1px">
            <td style="text-align: center;padding: 40px;vertical-align: middle;">${item.customerId} </td>
            <td style="text-align: center;padding: 40px;vertical-align: middle">${item.customerName} </td>
            <td style="text-align: center;padding: 40px;vertical-align: middle">${item.customerDateOfBirth} </td>
            <td style="text-align: center;padding: 40px;vertical-align: middle">${item.address} </td>
            <td style="text-align: center;padding: 40px;vertical-align: middle"><img style="height: 80px;width: 80px;" src="${item.customerImg}"> </td>


            </tr>
        </c:forEach>


</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>
