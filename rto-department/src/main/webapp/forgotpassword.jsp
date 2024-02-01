<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Forgot Password Page</title>
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
  <p class="bg-danger-subtle p-2 rounded fw-bold text-center border-danger border fs-4">Forgot Password?</p>
  <c:if test="${not empty err}">
   <li style="list-style-type: none" class="text-danger">
    <i class="bi bi-x-circle-fill me-2"></i>${err}</li>
  </c:if>
  <c:if test="${not empty succ}">
   <li style="list-style-type: none" class="text-success">
    <i class="bi bi-check-circle-fill me-2"></i>${succ}</li>
  </c:if>
  <hr>
  <form action="forgotpassword" method="post">
   <div class="row g-3">
    <div class="col-md-12">
     <div class="mb-2">
      <label class="form-label">Enter the email associated with your account</label>
      <input type="email" class="form-control" value="${email}" placeholder="Email" name="email" required>
     </div>
    </div>
    <c:if test="${empty succ}">
     <div class="col-md-12">
      <input type="submit" class="btn btn-primary fw-semibold w-50" value="Send" name="action">
     </div>
    </c:if>
    <c:if test="${not empty succ}">
     <div class="col-md-12">
      <div class="mb-2">
       <label class="form-label">Enter the OTP we just sent you on your email</label>
       <input type="text" class="form-control" placeholder="OTP" name="otp">
      </div>
     </div>
     <div class="col-md-12">
      <input type="submit" class="btn btn-dark fw-semibold w-50" value="Verify" name="action">
     </div>
    </c:if>
   </div>
  </form>
 </div>
 <%@ include file="footer.jsp"%>
</body>
</html>