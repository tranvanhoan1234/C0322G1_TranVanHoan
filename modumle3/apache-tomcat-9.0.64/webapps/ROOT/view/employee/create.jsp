<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/7/2022
  Time: 8:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Create Employee</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <form method="post" action="/employee?action=create">
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Name</label>
            <input name="employeeName" type="text" class="form-control" id="exampleInputEmail1" >
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">ngay sinh</label>
            <input name="dateOfDay" type="text" class="form-control">
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">cmnd</label>
            <input name="employeeIdCar" type="text" class="form-control">
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">lương</label>
            <input name="employeeSalary" type="text" class="form-control">
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">sdt</label>
            <input name="employeePhoneNumber" type="text" class="form-control">
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">email</label>
            <input name="employeeEmail" type="text" class="form-control">
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">địa chỉ</label>
            <input name="employeeAddress" type="text" class="form-control">
        </div>
        <div class="mb-3">
            <select class="form-select" name="positionId" aria-label="Default select example">
                <option selected>Open select position</option>
                <option value="1"> Lễ tân</option>
                <option value="2">phục vụ</option>
                <option value="3">chuyên viên</option>
                <option value="4">giám sát</option>
                <option value="5">quản lý</option>
                <option value="6">giám đốc</option>
            </select>
        </div>

        <div class="mb-3">
            <select class="form-select" name="educationId" aria-label="Default select example">
                <option selected>Open select education</option>
                <option value="1"> Trung cấp</option>
                <option value="2">Cao đẳng</option>
                <option value="3">Đại học</option>
                <option value="4">sau đại học</option>
            </select>
        </div>

        <div class="mb-3">
            <select class="form-select" name="divisionId" aria-label="Default select example">
                <option selected>Open this select division</option>
                <option value="1">  Sale – Marketing</option>
                <option value="2">Hành Chính</option>
                <option value="3">Phục vụ</option>
                <option value="4">Quản lý</option>
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
