<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>RTO SignUp Page</title>
<%@ include file="styles.jsp"%>
<style>
@media ( min-width : 768px) {
 .custom-width {
  width: 50%;
 }
}
</style>
</head>
<body class="d-flex flex-column min-vh-100 bg-secondary-subtle">
 <%@ include file="adminnavbar.jsp"%>
 <div class="container p-3 fw-medium border border-dark my-3 bg-light rounded custom-width">
  <p class="bg-success-subtle p-2 rounded fw-bold text-center border-success border fs-4">RTO Registration Form</p>
  <c:if test="${not empty succ}">
   <li style="list-style-type: none" class="text-success">
    <i class="bi bi-check-circle-fill me-2"></i>${succ}
   </li>
  </c:if>
  <c:forEach items="${err}" var="e">
   <c:if test="${not empty e}">
    <li style="list-style-type: none" class="text-danger">
     <i class="bi bi-x me-2"></i>${e}</li>
   </c:if>
  </c:forEach>
  <hr>
  <form action="rtosave" method="post">
   <div class="row g-3">
    <div class="col-md-6">
     <div class="mb-2">
      <label class="form-label">First Name</label>
      <input oninput="handleFirst()" id="firstName" type="text" class="form-control" placeholder="First Name" name="firstName" required>
      <span id="fnmsg"></span>
     </div>
    </div>
    <div class="col-md-6">
     <div class="mb-2">
      <label class="form-label">Last Name</label>
      <input oninput="handleLast()" id="lastName" type="text" class="form-control" placeholder="Last Name" name="lastName" required>
      <span id="lnmsg"></span>
     </div>
    </div>
    <div class="col-md-6">
     <div class="mb-2">
      <label class="form-label">Email Address</label>
      <input oninput="handleEmail()" id="email" type="email" class="form-control" placeholder="Email Address" name="email" required>
      <span id="emsg"></span>
     </div>
    </div>
    <div class="col-md-6">
     <div class="mb-2">
      <label class="form-label">Phone Number</label>
      <input oninput="handlePhone()" id="phoneNumber" type="tel" class="form-control" placeholder="Phone Number" name="phoneNumber" required>
      <span id="phmsg"></span>
     </div>
    </div>
    <div class="col-md-6">
     <div class="mb-2">
      <label class="form-label">Password</label>
      <input oninput="handlePass()" id="password" type="password" class="form-control" placeholder="Password" name="password" required>
      <span id="pamsg"></span>
     </div>
    </div>
    <div class="col-md-6">
     <div class="mb-2">
      <label class="form-label">Confirm Password</label>
      <input oninput="handleConfPass()" id="confirmPassword" type="password" class="form-control" placeholder="Confirm Password" name="confirmPassword" required>
      <span id="cpamsg"></span>
     </div>
    </div>
    <div class="col-md-6">
     <div class="mb-2">
      <label class="form-label">State</label>
      <select onchange="makeSubmenu(this.value)" class="form-select" name="state" required>
       <option value="" disabled selected>Select State</option>
       <option value="Andhra Pradesh">Andhra Pradesh</option>
       <option value="Maharashtra">Maharashtra</option>
       <option value="Tamil Nadu">Tamil Nadu</option>
       <option value="Karnataka">Karnataka</option>
       <option value="Kerala">Kerala</option>
       <option value="Gujarat">Gujarat</option>
       <option value="Uttar Pradesh">Uttar Pradesh</option>
       <option value="Rajasthan">Rajasthan</option>
       <option value="West Bengal">West Bengal</option>
       <option value="Bihar">Bihar</option>
      </select>
     </div>
    </div>
    <div class="col-md-6">
     <div class="mb-2">
      <label class="form-label">District</label>
      <select id="districtSelect" class="form-select" name="district" required>
       <option value="" selected>Select District</option>
      </select>
     </div>
    </div>
    <div class="col-md-6">
     <div class="mb-2">
      <label class="form-label">Date Of Birth</label>
      <input type="date" class="form-control" placeholder="dd-mm-yyyy" name="dob" max="2005-05-18" required>
     </div>
    </div>
    <div class="col-12">
     <div class="form-check mb-2">
      <input id="check" class="form-check-input" type="checkbox" value="true" name="confirmRegister" required checked>
      <label for="check" class="form-check-label"> Confirm Registration </label>
     </div>
    </div>
    <div class="col-md-6">
     <input type="submit" id="submit" class="btn btn-primary fw-semibold p-2 col-12" value="REGISTER" disabled>
    </div>
    <div class="col-md-6">
     <a href="index.jsp" class="btn btn-dark text-light fw-semibold p-2 col-12">CANCEL</a>
    </div>
   </div>
  </form>
 </div>
 <script type="text/javascript" src="<c:url value="static/js/signupvalidation.js"/>"></script>
 <%@ include file="footer.jsp"%>
</body>
</html>