<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/7/2022
  Time: 7:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form action="" method="post" class="form-control">
        <input class="form-control" type="hidden" name="idProduct" value="${product.idProduct}">
        <label for="tenProduct" class="form-label">Tên</label>
        <input class="form-control" type="text" name="tenProduct" id="tenProduct" value="${product.tenProduct}">
        <label for="giaProduct" class="form-label">Giá</label>
        <input class="form-control" type="text" name="giaProduct" id="giaProduct" value="${product.giaProduct}">
        <label for="soLuongProduct" class="form-label">Số lượng</label>
        <input class="form-control" type="text" name="soLuongProduct" id="soLuongProduct" value="${product.soLuongProduct}">
        <label for="mauSacProduct" class="form-label">Màu Sắc</label>
        <input class="form-control" type="text" name="mauSacProduct" id="mauSacProduct" value="${product.mauSacProduct}">
        <label for="moTaProduct" class="form-label">Mô Tả</label>
        <input class="form-control" type="text" name="moTaProduct" id="moTaProduct" value="${product.moTaProduct}">
        <label for="idCategory" class="form-label">Danh Mục</label>
        <select class="form-select" name="idCategory" id="idCategory">
            <c:forEach items="${categoryList}" var="category">
                <c:choose>
                    <c:when test="${category.idCategory == product.idCategory}">
                        <option class="form-option" value="${category.idCategory}" selected>${category.tenCategory}</option>
                    </c:when>
                    <c:otherwise>
                        <option class="form-option" value="${category.idCategory}">${category.tenCategory}</option>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </select>
        <hr>
        <button type="submit" class="btn btn-outline-success">Lưu thay đổi</button>
        <a href="/product" class="btn btn-outline-secondary">Huỷ</a>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>
