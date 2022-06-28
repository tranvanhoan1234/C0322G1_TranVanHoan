<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/27/2022
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  </head>
  <body>
  <form action="/discount" method="post">
  <select class="form-select" aria-label="Default select example" name="sanPham">
    <option >chọn sản phẩm</option>
    <option value="Keo Cay">kẹo cay</option>
    <option value="Sua Chua">sữa chua</option>
    <option value="Dau Tay">dâu tây</option>
  </select>
    <div class="mb-3">
      <label for="price" class="form-label">List Price</label>
      <input type="text" class="form-control" id="price" name="price" placeholder="Giá niêm yết của sản phẩm">
    </div>

    <div class="mb-3">
      <label for="percent" class="form-label">Discount Percent</label>
      <input type="text" class="form-control" id="percent" name="percent" placeholder="Tỷ lệ chiết khấu (phần trăm)">
    </div>
    <button type="submit" id="CalculateDiscount" class="btn btn-secondary btn-lg">Calculate Discount</button>
    </form>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  </body>
</html>
