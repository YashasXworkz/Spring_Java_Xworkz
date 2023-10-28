<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find By Fields</title>
<%@ include file="styles.jsp"%>
</head>
<body class="bg-info-subtle" data-bs-theme="dark">
  <%@ include file="navbar.jsp"%>
  <div class="container mt-3 w-75">
    <div class="row">
      <div class="col">
        <form action="findByName">
          <div class="mb-3">
            <label class="form-label">Name</label> <input type="text" class="form-control" placeholder="Search name" name="name" required>
          </div>
          <input type="submit" class="btn btn-info mb-3 fw-medium w-100" value="Search">
        </form>
      </div>
      <div class="col">
        <form action="findByEmail">
          <div class="mb-3">
            <label class="form-label">Email</label> <input type="email" class="form-control" placeholder="Search email" name="email" required>
          </div>
          <input type="submit" class="btn btn-info mb-3 fw-medium w-100" value="Search">
        </form>
      </div>
    </div>
    <c:if test="${d != null}">
      <table class="table table-bordered border-light table-sm align-middle text-center">
        <thead>
          <tr class="table-dark align-middle table-bordered border-light">
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Email</th>
            <th scope="col">Phone</th>
            <th scope="col" colspan="3">Actions</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>${d.id}</td>
            <td>${d.name}</td>
            <td>${d.email}</td>
            <td>${d.phoneNo}</td>
            <td><a href="showId?id=${d.id}" class="btn btn-sm btn-primary">Update by Id</a></td>
            <td><a href="delete?id=${d.id}" class="btn btn-sm btn-danger">Delete by Id</a></td>
            <td><a href="showEmail?email=${d.email}" class="btn btn-sm btn-primary">Update by Email</a></td>
          </tr>
        </tbody>
      </table>
    </c:if>
  </div>
  <h2 class="text-center text-success">${succ}</h2>
  <c:forEach items="${err}" var="e">
    <li class="text-center text-danger">${e}</li>
  </c:forEach>
</body>
</html>