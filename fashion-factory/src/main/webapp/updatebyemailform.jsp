<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update By Email Form</title>
<%@ include file="styles.jsp"%>
</head>
<body class="bg-info-subtle" data-bs-theme="dark">
  <%@ include file="navbar.jsp"%>
  <div class="container mt-3 p-3 border bg-dark-subtle w-50 shadow-lg">
    <h3>Update By Email</h3>
    <form action="updateByEmail" method="post">
      <div class="mb-3">
        <label class="form-label">Your Existing Email (Note: This field cannot be modified)</label> <input type="email" class="form-control" name="email" value="${d.email}" readonly>
      </div>
      <hr>
      <div class="mb-3">
        <label class="form-label">Name</label> <input type="text" class="form-control" name="name" value="${d.name}" required>
      </div>
      <div class="mb-3">
        <label class="form-label">Phone</label> <input type="tel" class="form-control" name="phoneNo" value="${d.phoneNo}" required>
      </div>
      <input type="submit" class="btn btn-info w-100 fw-medium" value="Update">
    </form>
  </div>
</body>
</html>