<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Admin Profile Page</title>
<%@ include file="styles.jsp"%>
</head>
<body>
 <%@ include file="adminnavbar.jsp"%>
 <div class="container-fluid mt-3">
  <div class="row g-3">
   <div class="col-md-2">
    <form action="findbystate" method="post">
     <div class="mb-3 fw-medium">
      <label class="form-label">Search By State</label>
      <select class="form-select border-dark" name="state" required>
       <option value="" selected>Select</option>
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
     <input type="submit" class="btn btn-primary fw-medium w-100" value="Search">
    </form>
   </div>
   <div class="col-md-10">
    <div class="table-responsive">
     <c:if test="${not empty rtos}">
      <h4>Rto List for state: ${state}</h4>
      <table class="table table-bordered border-dark table-sm text-center table-striped align-middle">
       <thead>
        <tr class="table-dark align-middle">
         <th scope="col">ID</th>
         <th scope="col">Name</th>
         <th scope="col">Email Address</th>
         <th scope="col">Phone Number</th>
         <th scope="col">Date of Birth</th>
         <th scope="col">State</th>
         <th scope="col">District</th>
         <th scope="col">Registered Time</th>
        </tr>
       </thead>
       <tbody>
        <c:forEach var="rto" items="${rtos}">
         <tr>
          <td>${rto.id}</td>
          <td>${rto.firstName}&nbsp;${user.lastName}</td>
          <td>${rto.email}</td>
          <td>${rto.phoneNumber}</td>
          <td>${rto.dob}</td>
          <td>${rto.state}</td>
          <td>${rto.district}</td>
          <td>${rto.registeredTime}</td>
         </tr>
        </c:forEach>
       </tbody>
      </table>
     </c:if>
    </div>
    <c:if test="${not empty err}">
     <li style="list-style-type: none" class="text-danger fw-medium text-center">
      <i class="bi bi-x-circle-fill me-1"></i>${err}</li>
    </c:if>
   </div>
  </div>
 </div>
</body>
</html>