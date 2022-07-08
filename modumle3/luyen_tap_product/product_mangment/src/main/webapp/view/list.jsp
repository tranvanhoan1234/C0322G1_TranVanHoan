<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/7/2022
  Time: 5:46 PM
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
<div class="container" id="bodyTable">
    <div class="container">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Home</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="btn btn-outline-info" aria-current="page" href="#">Create Product</a>
                        </li>
                        <li class="nav-item">
                            <a class="btn btn-outline-danger" aria-current="page" id="btnClick" href="#">Don't click me!</a>
                        </li>
                    </ul>
                    <form class="d-flex" action="/product" method="get">
                        <input class="form-control me-2" name="nameProduct" type="search" value="${searchName}" placeholder="Search" aria-label="Search">
                        <input type="text" name="action" value="search" hidden>
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>
            </div>
        </nav>
    </div>
    <div class="container">
        <!-- Carousel -->
        <div id="demo" class="carousel slide" data-bs-ride="carousel">

            <!-- Indicators/dots -->
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#demo" data-bs-slide-to="0" class="active"></button>
                <button type="button" data-bs-target="#demo" data-bs-slide-to="1"></button>
                <button type="button" data-bs-target="#demo" data-bs-slide-to="2"></button>
            </div>

            <!-- The slideshow/carousel -->
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="https://img3.thuthuatphanmem.vn/uploads/2019/06/08/hinh-nen-hotgirl-xinh-xan_125439031.jpg" alt="Los Angeles" class="d-block" style="width:100%">
                </div>
                <div class="carousel-item">
                    <img src="https://img3.thuthuatphanmem.vn/uploads/2019/06/08/anh-nen-hotgirl-full-hd_125434125.jpg" alt="Chicago" class="d-block" style="width:100%">
                </div>
                <div class="carousel-item">
                    <img src="https://img3.thuthuatphanmem.vn/uploads/2019/06/08/hinh-nen-hotgirl-duyen-dang_125438813.jpg" alt="New York" class="d-block" style="width:100%">
                </div>
            </div>

            <!-- Left and right controls/icons -->
            <button class="carousel-control-prev" type="button" data-bs-target="#demo" data-bs-slide="prev">
                <span class="carousel-control-prev-icon"></span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#demo" data-bs-slide="next">
                <span class="carousel-control-next-icon"></span>
            </button>
        </div>
    </div>
    <div class="container">
        <table class="table table-hover" id="myTable">
            <thead>
            <tr>
                <td>Id</td>
                <td>Tên Sản Phẩm</td>
                <td>Giá</td>
                <td>Số lượng</td>
                <td>Màu sắc</td>
                <td>Mô tả</td>
                <td>Danh mục</td>
                <td>Xoá</td>
                <td>Sửa</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${productList}" var="product">
                <tr>
                    <td>${product.idProduct}</td>
                    <td>${product.tenProduct}</td>
                    <td>${product.giaProduct}</td>
                    <td>${product.soLuongProduct}</td>
                    <td>${product.mauSacProduct}</td>
                    <td>${product.moTaProduct}</td>
                    <td>
                        <c:forEach items="${categoryList}" var="category">
                            <c:if test="${category.idCategory == product.idCategory}">
                                ${category.tenCategory}
                            </c:if>
                        </c:forEach>
                    </td>
                    <td>
                        <!-- Button trigger modal -->
                        <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#staticBackdrop${pro.idProduct}">
                            Xoá
                        </button>

                        <!-- Modal -->
                        <div class="modal fade" id="staticBackdrop${product.idProduct}" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="staticBackdropLabel">Xác nhận xoá</h5>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        Bạn có xác nhận xoá sản phẩm ${product.tenProduct} có id là ${product.idProduct}
                                    </div>
                                    <div class="modal-footer">
                                        <a href="/product?action=delete&idDelete=${product.idProduct}" class="btn btn-outline-primary">Chấp nhận</a>
                                        <button type="button" class="btn btn-outline-secondary" data-bs-dismiss="modal">Huỷ</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </td>
                    <td><a href="/product?action=edit&idEdit=${product.idProduct}" class="btn btn-outline-warning">Sửa</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
        <div class="container">
            <footer class="py-3 my-4">
                <ul class="nav justify-content-center border-bottom pb-3 mb-3">
                    <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Home</a></li>
                    <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Features</a></li>
                    <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Pricing</a></li>
                    <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">FAQs</a></li>
                    <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">About</a></li>
                </ul>
                <p class="text-center text-muted">&copy; Copyright by Tran Van Hoan, 2022</p>
            </footer>
        </div>

</div>
</body>
<script src="../style/jquery/jquery-3.5.1.min.js"></script>
<script src="../style/datatables/js/jquery.dataTables.min.js"></script>
<script src="../style/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="../style/bootstrap/bootstrap.bundle.min.js"></script>
<%--<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>--%>
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
