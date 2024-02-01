<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Reset Password Page</title>
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
  <p class="bg-primary-subtle p-2 rounded fw-bold text-center border-primary border fs-4">Change Password</p>
  <c:if test="${not empty err}">
   <li style="list-style-type: none" class="text-danger">
    <i class="bi bi-x-circle-fill me-2"></i>${err}</li>
  </c:if>
  <c:if test="${not empty succ}">
   <li style="list-style-type: none" class="text-success">
    <i class="bi bi-check-circle-fill me-2"></i>${succ}</li>
  </c:if>
  <hr>
  <form action="updatepassword" method="post">
   <input type="hidden" value="${email}" name="email">
   <div class="row g-3">
    <div class="col-md-12">
     <div class="mb-2">
      <label class="form-label">Enter New Password</label>
      <input oninput="handlePass()" id="password" type="password" class="form-control" placeholder="Password" name="newPassword" required>
      <span id="pamsg"></span>
     </div>
    </div>
    <div class="col-md-12">
     <div class="mb-2">
      <label class="form-label">Enter Confirm Password</label>
      <input oninput="handleConfPass()" id="confirmPassword" type="password" class="form-control" placeholder="Confirm Password" name="confirmPassword" required>
      <span id="cpamsg"></span>
     </div>
    </div>
    <div class="col-md-12">
     <input type="submit" class="btn btn-dark fw-semibold" value="Update" id="submit" disabled>
    </div>
   </div>
  </form>
 </div>
 <script type="text/javascript" src="<c:url value="static/js/signupvalidation.js"/>"></script>
 <%@ include file="footer.jsp"%>
</body>
</html>