<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Rto Login Page</title>
<%@ include file="styles.jsp"%>
<style>
@media ( min-width : 768px) {
 .custom-width {
  width: 30%;
 }
}
</style>
</head>
<body class="d-flex flex-column vh-100 bg-secondary-subtle">
 <%@ include file="navbar.jsp"%>
 <div class="container border p-3 fw-medium border border-dark my-3 bg-light rounded custom-width">
  <p class="bg-success-subtle p-2 rounded fw-bold text-center border-success border fs-4">
   Rto Login
   <i class="bi bi-person-badge-fill"></i>
  </p>
  <c:if test="${not empty err}">
   <li style="list-style-type: none" class="text-danger">
    <i class="bi bi-x-circle-fill me-2"></i>${err}</li>
  </c:if>
  <hr>
  <form action="rtologin" method="post">
   <div class="row g-3">
    <div class="col-md-12">
     <div class="mb-2">
      <label class="form-label">Email</label>
      <input type="email" class="form-control" placeholder="Email Address" name="email" required>
     </div>
    </div>
    <div class="col-md-12">
     <div class="mb-0">
      <label class="form-label">Password</label>
      <input type="password" class="form-control" placeholder="Password" name="password" required>
     </div>
    </div>
    <div class="mb-2">
     <a href="forgotpassword.jsp" class="text-primary float-end">Forgot your Password?</a>
    </div>
    <div class="d-flex flex-row gap-3 justify-content-center">
     <input type="submit" class="btn btn-primary fw-medium flex-fill" value="Login">
     <a href="index.jsp" class="btn btn-dark fw-medium flex-fill">Cancel</a>
    </div>
   </div>
  </form>
 </div>
 <%@ include file="footer.jsp"%>
</body>
</html>