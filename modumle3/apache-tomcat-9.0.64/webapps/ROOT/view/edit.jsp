<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/7/2022
  Time: 12:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form action="" method="post" class="form-control">
        <input class="form-control" type="hidden" name="id" value="${customer.id}">

        <label for="name" class="form-label">name</label>
        <input class="form-control" type="text" name="name" id="name" value="${customer.name}">

        <label for="dateOfBirth" class="form-label">ngay sinh</label>
        <input class="form-control" type="text" name="dateOfBirth" id="dateOfBirth" value="${customer.dateOfBirth}">

        <label for="gender" class="form-label">Số lượng</label>
        <input class="form-control" type="text" name="gender" id="gender" value="${customer.gender}">

        <label for="idCar" class="form-label">smnd</label>
        <input class="form-control" type="text" name="idCar" id="idCar" value="${customer.idCar}">

        <label for="phoneNumber" class="form-label">sdt</label>
        <input class="form-control" type="text" name="phoneNumber" id="phoneNumber" value="${customer.phoneNumber}">

        <label for="email" class="form-label">email</label>
        <input class="form-control" type="text" name="email" id="email" value="${customer.email}">

        <label for="address" class="form-label">địa chỉ</label>
        <input class="form-control" type="text" name="address" id="address" value="${customer.address}">

        <label for="type_id" class="form-label">loai khach</label>
        <select class="form-select" name="type_id" id="type_id" value="${customer.type_id}">
            <c:forEach items="${customerType}" var="customerType">
                <c:choose>
                    <c:when test="${customerType.idType == customer.type_id}">
                        <option class= " form-option" value="${customerType.idType}" selected>${customerType.name} </option>
        </c:when>
        <c:otherwise>
            <option class="form-option" value="${customerType.idType}">${customerType.name}</option>
        </c:otherwise>
        </c:choose>
        </c:forEach>
        </select>
        <hr>
        <button type="submit" class="btn btn-outline-success">
            <a href="/furama" class="btn btn-outline-secondary"></a>
            Lưu thay đổi</button>
        <a href="/furama" class="btn btn-outline-secondary">Huỷ</a>
    </form>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
