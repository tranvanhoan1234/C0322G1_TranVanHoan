<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/7/2022
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../style/bootstrap/normalize.css">
    <link rel="stylesheet" href="../style/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../style/datatables/css/dataTables.bootstrap4.min.css"/>
</head>
<body>
<div class="container">

    <nav class="navbar navbar-light bg-light">
        <div class="container">
            <a class="navbar-brand" href="/index.jsp">
                <img src="https://cdn-icons-png.flaticon.com/128/7258/7258187.png" alt="" width="30" height="24">
            </a>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </nav>
</div>
<div class="container">
    <img width="100%" height="400px"
         src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1fiRbFoYquCy-cS5xE7yC74U11f4FeJp-tw&usqp=CAU"
         alt="icon">
</div>

<div class="container">
    <form action="/employee" method="get">
        <table class="table " id="myTable">
            <thead>
            <tr>
                <th scope="col">id</th>
                <th scope="col">name</th>
                <th scope="col">id Car</th>
                <th scope="col">salary</th>
                <th scope="col">phone number</th>
                <th scope="col">email</th>
                <th scope="col">address</th>
                <th scope="col">position name</th>
                <th scope="col">education name</th>
                <th scope="col">division name</th>
                <th scope="col">delete</th>
                <th scope="col">Thêm Mới</th>
                <th scope="col">Sửa</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${employeeList}" var="employee">
                <tr>
                    <td>${employee.employeeId}</td>
                    <td>${employee.employeeName}</td>
                    <td>${employee.employeeIdCar}</td>
                    <td>${employee.employeeSalary}</td>
                    <td>${employee.employeePhoneNumber}</td>
                    <td>${employee.employeeEmail}</td>
                    <td>${employee.employeeAddress}</td>
                    <c:forEach items="${positionList}" var="position">
                        <c:if test="${position.positionId==employee.positionId}">
                            <td>${position.positionName}</td>
                        </c:if>
                    </c:forEach>

                    <c:forEach items="${educationDegreesList}" var="educationdegrees">
                        <c:if test="${educationdegrees.educationDegreeId == employee.educationId}">
                            <td>${educationdegrees.educationDegreeName}</td>
                        </c:if>
                    </c:forEach>

                    <c:forEach items="${divisionList}" var="division">
                        <c:if test="${division.divisionId==employee.divisionId}">
                            <td>${division.divisionName}</td>
                        </c:if>
                    </c:forEach>

                    <!-- Button trigger modal -->
                    <td>
                        <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal"
                                data-bs-target="#staticBackdrop${employee.employeeId}">
                            Xoá
                        </button>
                        <!-- Modal -->
                        <div class="modal fade" id="staticBackdrop${employee.employeeId}" data-bs-backdrop="static"
                             data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel"
                             aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="staticBackdropLabel">Xác nhận xoá</h5>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal"
                                                aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        Bạn có xác nhận xoá sản phẩm ${employee.employeeName} có id
                                        là ${employee.employeeId}
                                    </div>
                                    <div class="modal-footer">
                                        <a href="<c:url value="/employee?action=delete&idDelete=${employee.employeeId}"/>"
                                           class="btn btn-outline-primary">Chấp nhận</a>
                                        <button type="button" class="btn btn-outline-secondary"
                                                data-bs-dismiss="modal">Huỷ
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </td>
                    <td><a href="<c:url value="/employee?action=create"/>" class="btn btn-outline-primary">thêm mới </a> </td>
                    <td><a href="<c:url value="/employee?action=edit&idEdit=${employee.employeeId}"/>"
                           class="btn btn-outline-warning">Sửa</a></td>
                </tr>

            </c:forEach>
            </tbody>
        </table>
    </form>
</div>
</div>
</body>
<script src="../style/jquery/jquery-3.5.1.min.js"></script>
<script src="../style/datatables/js/jquery.dataTables.min.js"></script>
<script src="../style/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="../style/bootstrap/bootstrap.bundle.min.js"></script>
<script>
    $("#btnClick").click(function () {
        let img = `<img src="https://iaslinks.org/wp-content/uploads/2021/03/fbi-warning-la-gi.jpg" style="width: 100%" alt="">`;
        $("#bodyTable").html(img);
    })
</script>
<script>
    $(document).ready(function () {
        $('#myTable').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
</html>
