<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<%@ include file="styles.jsp"%>
</head>
<body class="bg-info-subtle" data-bs-theme="dark">
  <%@ include file="navbar.jsp"%>
  <div class="container mt-3 p-3 border bg-dark-subtle w-50 shadow-lg">
    <h3>Register</h3>
    <h2 class="text-center text-success">${succ}</h2>
    <c:forEach items="${err}" var="e">
      <p class="text-center text-danger">${e}</p>
    </c:forEach>
    <form action="save" method="post">
      <div class="mb-3">
        <label class="form-label">Name</label> <input type="text" class="form-control" placeholder="Enter name" name="name" required>
      </div>
      <div class="mb-3">
        <label class="form-label">Email</label> <input type="email" class="form-control" placeholder="Enter email" name="email" required>
      </div>
      <div class="mb-3">
        <label class="form-label">Phone</label> <input type="tel" class="form-control" placeholder="Enter +91" name="phoneNo" required>
      </div>
      <input type="submit" class="btn btn-success w-100 fw-medium" value="Save">
    </form>
  </div>
</body>
</html>