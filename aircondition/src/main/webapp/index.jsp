<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AirCondition</title>
<style>
table {
  border-collapse: collapse; margin: 10px 0px 10px 0px;
}

th {
  background-color: grey;
}

td,th {
  border: 1px solid black; text-align: left; padding: 10px;
}
</style>
</head>
<body>
  <form action="message" method="get">
    <h2>${msg}</h2>
    <input type="submit">
  </form>
  <form action="getInfo" method="get">
    <table>
      <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Brand</th>
        <th>Color</th>
      </tr>
      <c:forEach items="${dto}" var="d">
        <tr>
          <td>${d.name}</td>
          <td>${d.price}</td>
          <td>${d.brand}</td>
          <td>${d.color}</td>
        </tr>
      </c:forEach>
    </table>
    <input type="submit">
  </form>
</body>
</html>