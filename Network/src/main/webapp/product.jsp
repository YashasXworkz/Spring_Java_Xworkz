<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
<style>
table {
  border-collapse: collapse; margin: 10px 0px 10px 0px;
}

th {
  background-color: grey;
}

td,th {
  border: 1px solid black; text-align: center; padding: 10px;
}
</style>
</head>
<body>
  <h3>Product form</h3>
  <form action="onProdSave" method="post">
    Product Name: <input type="text" name="prodName" placeholder="Enter prod Name" required><br> <br> Ratings: <input type="number" name="ratings" placeholder="Enter ratings" required><br> <br> Product Price: <input type="number" name="prodPrice" placeholder="Enter product price" required><br> <br> Quantity <input type="number" name="quantity" placeholder="Enter Quantity" required><br> <br> Reviews <input type="text"
      name="reviews" placeholder="Enter Reviews" required><br> <br> <input type="submit" value="sumbit product details">
  </form>
  <hr>
  <table>
    <tr>
      <th>Product Name</th>
      <th>Ratings</th>
      <th>Product Price</th>
      <th>Quantity</th>
      <th>Reviews</th>
      <th>Total Price</th>
    </tr>
    <c:forEach items="${prod}" var="pd">
      <tr>
        <td style="color: green; font-weight: bold;">${pd.prodName}</td>
        <td>&#10031; ${pd.ratings}</td>
        <td>&#8377;${pd.prodPrice}</td>
        <td>${pd.quantity}</td>
        <td style="font-style: italic; color: blue; font-weight: bold;">"${pd.reviews}"</td>
        <td>&#8377;${pd.totalPrice}/-</td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>