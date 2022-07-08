<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/7/2022
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <form method="post" action="/customer?action=create">

        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">name</label>
            <input name="name" type="text" class="form-control" id="exampleInputEmail1" >
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">ngay sinh</label>
            <input name="dateOfBirth" type="text" class="form-control">
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">giới tính </label>
            <input name="gender" type="text" class="form-control">
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">cmnd</label>
            <input name="idCar" type="text" class="form-control">
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">sdt</label>
            <input name="phoneNumber" type="text" class="form-control">
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">email</label>
            <input name="email" type="text" class="form-control">
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">address</label>
            <input name="address" type="text" class="form-control">
        </div>
        <div class="mb-3">
            <select class="form-select" name="type_id" aria-label="Default select example">
                <option selected>Open this select menu</option>
                <option value="1">Diamond</option>
                <option value="2">Platinium</option>
                <option value="3">Gold</option>
                <option value="4">Silver</option>
                <option value="5">Member</option>
            </select>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
