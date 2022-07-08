<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/7/2022
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../style/bootstrap/normalize.css">
    <link rel="stylesheet" href="../style/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../style/datatables/css/dataTables.bootstrap4.min.css"/>
</head>
<body>
<div class="container" id="">
    <div class="container ">
        <nav class="navbar navbar-light bg-light justify-content-between">
            <a class="navbar-brand" ><i><img
                    src="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIAHsAmgMBIgACEQEDEQH/xAAbAAEAAgMBAQAAAAAAAAAAAAAAAQUCBAYDB//EADYQAAEDAwIFAQQJBAMAAAAAAAEAAgMEBRESIQYTMUFRYRQiQoEHMnGCkaGx0fAjUmJyFRYk/8QAGQEBAAIDAAAAAAAAAAAAAAAAAAEFAgME/8QAHxEBAAICAQUBAAAAAAAAAAAAAAECAxEhBBITMlEx/9oADAMBAAIRAxEAPwD7iiIgIiICIiAiIgIiICIiAiIgIiICIiAiIgIiICIiAiIgIoyoL2jOSNuvogyRYRSslY18bg5jhqa4dCFmgIiICIiAiIgIiICIiAiIgIiIC8qiZtPE6WTIY0ZcQCcD7AvVV99idNbZWsDi4bjEzosepc3fA64USi0zEcNWo4gt+ZYRPIX50NMLC9xOkOy0AHoCN8Y3XC3WurW1rzzny8yLlPdJEYnyR5yGvHc9dx5KsrRY6mOTmnUeZgiIvcwyA7jJG46dPTdXzbMwsbDINcr2CSR0m+Tqbsc9gAR81pnuvDitGTNHPD24WrjVQOZPWGaoADjHyOUIx4aCMkeu6vloW63tt5kbDI50Djlkbt+X5APjpssJX3KSobGyGCGDOTMJNbsDtpIABPnJ7rdXeuXXjiYrESskWpBXRyTugMc7JWnDg6I49DqHu7/atoFSzSiIgIiICIiAiIgIiICIiAoc0OBa4Ag7EHupXnPMyCJ0jz7oHZBq3Wop6WnDpS0Pc9rYm5wXP7AfzyuNv3G8TGuiooxBVaxHL7SzUGMB94adsk7jqOuVZ8UCrprdNduS2epaWNihwXCNrnAHAHU4O5/ZUPHHBtTe7PFdrYzTdGQtc6Hpz24+r/sOx79D5G7D4u7WRz9RGbW8UtPiOrq7fTR3O1VU7rbPjDo5XAwuPwuweng/Lr15t/H17pz/AE7jNt2cQ79QtLgzimaz1D7deqSae0VfuVMT4nHk52LgMfiPn1G/hx7wnUWCtZNRF9Xaasa6WpZ72Ad9LiO+Dse4+asItX0tET8lXz09/eszH2HTW76SbvyJPb5Y6hksZa0aBG5hPcOb+mPmrS3/AEiTBtLQ0VO2eVwDWjDi5zz2AC+RtNUQyOOnmcdg0CMnJX2z6OeBn2ajFwurR/yk7dmnf2Zh+Ef5Hufl5zjm8FK70zw16i1vbh1dmuz6ic0Ve5ra0N14YMMcO4acnUW9/wBldLiOGY6u8srDXt5UlPM008jYTGWbZyMnf+BdVTVZEb21Ra2aHaQj6pH932foquVpH43URESIiICIiAiIgIiIIPQ5XENvt/4mMj+GG0lvtIeWMuta0yOqCNsxRjA05+Jx38LtyAQQehVCLEILDQWphYKaiLGgnvEzYfex+eUFWOELrM0G58b3qV/xezcqnaT6Brcj8UHAMYOW8UcT6vJujz+R2W2bbNG6cNqYSx8tNK6J7nYjcyVpbg43ywNbny0eVmLXUOrH1za0BgrBOYQ5xaJBmN2/jRgacY1ZKDR/6jcY2k0fG95ac4BmEMwB8bs3WUNv4yo2tA4ktNe3OP8A1W7lEnxlj8fkt4W9wtDLeKpgc2sicw5yWNZIx+jVjcgNwCR4znqvJlqkiEwknppmVPPY0Sk4HNkc9rht1IOCPQYKDBtbxfDnnWWx1XvYBguT4zt6OiO/zWwy+3jYP4Zmc47/ANKugfked3BRDaC5klM6ZlRE90j9ReWvfmPluBIG2+dwc9FlaaKWluXtFRUxT6oY6cuxhxex0hJOGgZ98bjAO5xuAgk365lmRw1WAdMvqqdo/HWterj4gvQ9jqo6K00U20umfn1EsfxNGzWsyNs5d1XrR26YzQyB9PNHG6pfyXOOh7Z5C5rj7vVoGn7zvn5UVvko6bltr4ZIyInmocMva1jAwgZB2yMg5GCT9pDpmPa7IaQcHBwc4Pqs1TWe3vgmhke6EOp6YUr+TnEpGDqOemMHA3+sd1coCIiAiIgIiICIiAnVEQY6R4U4ClEGOlvgJpHhZIgjSM5wo0jx3yskQQGgdAmkeFKIIAA6KURAREQFClEBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQf/2Q=="
                    alt="no internet"></i></a>
            <form class="form-inline flex-column" action="/customer" method="get">
                <input class="form-control mr-sm-2" name="nameCustomer" value="${searchName}" type="search" placeholder="Search" aria-label="Search">
                <input type="text" name="action" value="search" hidden>
                <button class="btn btn-outline-success my-2 my-sm-0"  type="submit">Search</button>
            </form>
        </nav>
    </div>
    <div class="container">
        <ul class="nav nav-tabs">
            <li class="nav-item">
                <a class="nav-link active" href="/index.jsp">Home</a>
            </li>
            <li class="nav-item dropdown">
                <div class="dropdown">
                    <button class="btn  dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false">
                        Dropdown button
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                        <a class="dropdown-item" href="#">customer</a>
                        <a class="dropdown-item" href="#">employee</a>
                        <a class="dropdown-item" href="#">Something else here</a>
                    </div>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="#">Disabled</a>
            </li>
        </ul>
        <div class="container">
            <!-- Carousel -->
            <div id="demo" class="carousel slide" data-bs-ride="carousel">

                <!-- Indicators/dots -->
                <div class="carousel-indicators">
                    <button type="button" data-bs-target="#demo" data-bs-slide-to="0" class="active"></button>
                    <button type="button" data-bs-target="#demo" data-bs-slide-to="1"></button>
                    <button type="button" data-bs-target="#demo" data-bs-slide-to="2"></button>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#demo" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon"></span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#demo" data-bs-slide="next">
                    <span class="carousel-control-next-icon"></span>
                </button>
            </div>
            <div class="container">
                <form>
                <table class="table table-hover" id="myTable">
                    <thead>
                    <tr>
                        <td>ID</td>
                        <td>NAME</td>
                        <td>DATE OF BIRTH</td>
                        <td>GENDER</td>
                        <td>ID CAR</td>
                        <td>PHONE NUMBER</td>
                        <td>EMAIL</td>
                        <td>ADDRESS</td>
                        <td>CUSTOMER TYPE ID</td>
                        <td>Xoá</td>
                        <td>Sửa</td>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${customerList}" var="customer">
                        <tr>
                            <td>${customer.id}</td>
                            <td>${customer.name}</td>
                            <td>${customer.dateOfBirth}</td>
                            <c:if test="${customer.gender == 1}">
                                <td>nam</td>
                            </c:if> <c:if test="${customer.gender == 0}">
                            <td>nữ</td>
                        </c:if>
                            <td>${customer.idCar}</td>
                            <td>${customer.phoneNumber}</td>
                            <td>${customer.email}</td>
                            <td>${customer.address}</td>
                            <c:forEach items="${customerTypeList}" var="cTypeList">
                                <c:if test="${cTypeList.idType == customer.type_id}">
                                    <td>${cTypeList.getName()}</td>
                                </c:if>
                            </c:forEach>
                            <td>
                                <!-- Button trigger modal -->
                                <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal"
                                        data-bs-target="#staticBackdrop${customer.id}">
                                    Xoá
                                </button>

                                <!-- Modal -->
                                <div class="modal fade" id="staticBackdrop${customer.id}" data-bs-backdrop="static"
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
                                                Bạn có xác nhận xoá sản phẩm ${customer.name} có id là ${customer.id}
                                            </div>
                                            <div class="modal-footer">
                                                <a href="<c:url value="/customer?action=delete&idDelete=${customer.id}"/>"
                                                   class="btn btn-outline-primary">Chấp nhận</a>
                                                <button type="button" class="btn btn-outline-secondary"
                                                        data-bs-dismiss="modal">Huỷ
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </td>
                            <td><a href="<c:url value="/customer?action=edit&idEdit=${customer.id}"/>"
                                   class="btn btn-outline-warning">Sửa</a></td>

                        </tr>
                    </c:forEach>
                    <div class="accordion-button"> <a href="<c:url value="/customer?action=create"/>">them</a></div>
                    </tbody>
                </table>
                </form>
            </div>
        </div>
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
