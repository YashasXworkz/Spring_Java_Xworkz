<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Login Page</title>
<%@ include file="styles.jsp"%>
<style>
.required::after {
 content: " *"; color: red;
}

@media ( min-width : 768px) {
 .custom-width {
  width: 50%;
 }
}
</style>
</head>
<body class="d-flex flex-column min-vh-100 bg-secondary-subtle">
 <%@ include file="navbar.jsp"%>
 <div class="container my-4 custom-width">
  <div class="card shadow-lg fw-medium rounded-end" style="border: 1px solid #40C2FF">
   <div class="card-header fs-4 text-light mb-3" style="background-color: #40C2FF;">Application Status</div>
   <c:if test="${not empty err}">
    <li style="list-style-type: none" class="text-danger text-center">
     <i class="bi bi-x me-2"></i>${err}</li>
   </c:if>
   <div class="card-body">
    <form action="llrapplstatus" method="post">
     <div class="row mb-3">
      <label class="col-md-6 col-form-label required">Application [OR] Mobile Number</label>
      <div class="col-md-6">
       <input type="text" class="form-control" name="applNoOrPhNo" placeholder="Ex: KA2023LLR123 | 1234567890" required>
      </div>
     </div>
     <div class="row mb-3">
      <label class="col-md-6 col-form-label required">Date of Birth</label>
      <div class="col-md-6">
       <input type="date" class="form-control" name="dob" max="2005-11-10" required>
      </div>
     </div>
     <hr>
     <div class="d-flex flex-row gap-3 justify-content-center mt-4">
      <input type="submit" class="btn btn-primary fw-medium">
      <a href="index.jsp" class="btn btn-primary fw-medium">Cancel</a>
     </div>
    </form>
   </div>
  </div>
 </div>
 <%@ include file="footer.jsp"%>
</body>
</html>