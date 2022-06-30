<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/6/2022
  Time: 11:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> tạo mới product</h1>
<form method="post" >
    <fieldset>
        <legend>thông tin sản phẩm</legend>
 <table>
     <tr>
         <td>Name:</td>
         <td><input type="text" name="name" id="name"></td>
     </tr>
     <tr>
         <td>giá:</td>
         <td><input type="number" name="price" id="price"></td>
     </tr>
     <tr>
         <td>mô tả sản phẩm:</td>
         <td> <input type="text" name="descriptionOfThe" id="descriptionOfThe"></td>
     </tr>
     <tr>
         <td> nhà sản xuất : </td>
         <td><input type="text" name="producer" id="producer">   </td>
     </tr>
     <tr>
         <td></td>
         <td><input type="submit" value="create"></td>
     </tr>
 </table>
    </fieldset>

</form>
</body>
</html>
