<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
  <h3>Register form</h3>
  <form action="onSave" method="post">
    User Name: <input type="text" name="uname" placeholder="Enter name" required><br>
    <br> Email: <input type="email" name="uemail" placeholder="Enter email" required><br>
    <br> Contact Number: <input type="tel" name="uphone" placeholder="Enter phone" required><br>
    <br> Place: <input type="text" name="uplace" placeholder="Enter place" required><br>
    <br> <input type="submit" value="register">
  </form>
  <hr>
  <c:forEach items="${user}" var="us">
    <li>${us}</li>
    <br>
  </c:forEach>
  <h1 style="color: red;">${err}</h1>
</body>
</html>