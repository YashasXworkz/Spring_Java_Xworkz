<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Data</title>
<%@ include file="styles.jsp"%>
</head>
<body class="bg-info-subtle" data-bs-theme="dark">
  <%@ include file="navbar.jsp"%>
  <div class="container mt-3 w-50">
    <form action="readAll">
      <input type="submit" class="btn btn-primary mb-3 fw-medium" value="View All">
    </form>
    <table class="table table-bordered border-light table-striped table-sm align-middle text-center">
      <thead>
        <tr class="table-dark align-middle table-bordered border-light">
          <th scope="col">Id</th>
          <th scope="col">Name</th>
          <th scope="col">Email</th>
          <th scope="col">Phone</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${dtos}" var="d">
          <tr>
            <td>${d.id}</td>
            <td>${d.name}</td>
            <td>${d.email}</td>
            <td>${d.phoneNo}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</body>
</html>