<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body style="margin: 30px;">
  <form action="click" method="get">
    <h2 style="color: red;">${message}</h2>
    <input type="submit">
  </form>
  <form action="show" method="get">
    <h2>Trainee Names</h2>
    <ul>
      <c:forEach items="${detailsName}" var="d">
        <li>${d}</li>
      </c:forEach>
    </ul>
    <input type="submit">
  </form>
  <form action="dtosList" method="get">
    <h2>DTO in List</h2>
    <ul>
      <c:forEach items="${dtol}" var="dl">
        <li>${dl}</li>
        <br>
      </c:forEach>
    </ul>
    <input type="submit">
  </form>
  <form action="dtosSet" method="get">
    <h2>DTO in Set</h2>
    <ul>
      <c:forEach items="${dtos}" var="ds">
        <li>${ds}</li>
        <br>
      </c:forEach>
    </ul>
    <input type="submit">
  </form>
</body>
</html>