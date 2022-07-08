<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/7/2022
  Time: 11:20 PM
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
<div class="container-fluid" style="width: 500px; height: 700px">
    <form action="" method="post" class="form-control">
        <input class="form-control" type="hidden" name="employeeId" value="${employeeList.employeeId}">

        <label for="employeeName" class="form-label">name</label>
        <input class="form-control" type="text" name="employeeName" id="employeeName"
               value="${employeeList.employeeName}">

        <label for="dateOfDay" class="form-label">ngay sinh</label>
        <input class="form-control" type="text" name="dateOfDay" id="dateOfDay" value="${employeeList.dateOfDay}">

        <label for="employeeIdCar" class="form-label">cmnd</label>
        <input class="form-control" type="text" name="employeeIdCar" id="employeeIdCar"
               value="${employeeList.employeeIdCar}">

        <label for="employeeSalary" class="form-label">cmnd</label>
        <input class="form-control" type="text" name="employeeSalary" id="employeeSalary"
               value="${employeeList.employeeSalary}">

        <label for="employeePhoneNumber" class="form-label">sdt</label>
        <input class="form-control" type="text" name="employeePhoneNumber" id="employeePhoneNumber"
               value="${employeeList.employeePhoneNumber}">

        <label for="employeeEmail" class="form-label">sdt</label>
        <input class="form-control" type="text" name="employeeEmail" id="employeeEmail"
               value="${employeeList.employeeEmail}">

        <label for="employeeAddress" class="form-label">email</label>
        <input class="form-control" type="text" name="employeeAddress" id="employeeAddress"
               value="${employeeList.employeeAddress}">
        <label for="positionId" class="form-label">position</label>
        <select class="form-select" name="positionId" id="positionId" value="${employeeList.positionId}">
        <c:forEach items="${positionList}" var="positionList">
            <c:choose>
                <c:when test="${positionList.positionId == employeeList.positionId}">
                    <option class=" form-option" value="${positionList.positionId}"
                            selected>${positionList.positionName} </option>
                </c:when>
                <c:otherwise>
                    <option class="form-option" value="${positionList.positionId}">${positionList.positionName}</option>
                </c:otherwise>
            </c:choose>
        </c:forEach>
        </select>
        <label for="educationId" class="form-label">education</label>
        <select class="form-select" name="educationId" id="educationId" value="${employeeList.educationId}">
            <c:forEach items="${educationDegreeList}" var="educationDegreeList">
        <c:choose>
            <c:when test="${educationDegreeList.educationDegreeId == employeeList.educationId}">
                <option class=" form-option" value="${educationDegreeList.educationDegreeId}"
                        selected>${educationDegreeList.educationDegreeName} </option>
            </c:when>
            <c:otherwise>
                <option class="form-option"
                        value="${educationDegreeList.educationDegreeId}">${educationDegreeList.educationDegreeName}</option>
            </c:otherwise>
        </c:choose>
    </c:forEach>
        </select>
        <label for="divisionId" class="form-label">divisionId</label>
        <select class="form-select" name="divisionId" id="divisionId" value="${employeeList.divisionId}">

        <c:forEach items="${divisionList}" var="divisionList">
            <c:choose>
                <c:when test="${divisionList.divisionId == employeeList.divisionId}">
                    <option class=" form-option" value="${divisionList.divisionId}"
                            selected>${divisionList.divisionName} </option>
                </c:when>
                <c:otherwise>
                    <option class="form-option" value="${divisionList.divisionId}">${divisionList.divisionName}</option>
                </c:otherwise>
            </c:choose>
        </c:forEach>
        </select>
        <hr>
        <button type="submit" class="btn btn-outline-success">
            <a href="/furama" class="btn btn-outline-secondary"></a>
            Lưu thay đổi
        </button>
        <a href="/furama" class="btn btn-outline-secondary">Huỷ</a>
    </form>
</div>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
