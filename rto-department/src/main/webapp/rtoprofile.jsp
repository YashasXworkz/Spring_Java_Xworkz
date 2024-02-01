<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Rto Profile Page</title>
<%@ include file="styles.jsp"%>
</head>
<body>
 <nav class="navbar navbar-expand-lg bg-light-subtle border-bottom py-0" data-bs-theme="dark">
  <div class="container-fluid">
   <a class="navbar-brand text-wrap text-break" href="#">
    <img src="https://i.ibb.co/0DBWXR4/logo.jpg" width="60" class="rounded-circle me-2" alt="Logo"> RTO DEPARTMENT
   </a>
   <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
   </button>
   <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <form class="d-flex">
     <div class="input-group">
      <input class="form-control border border-success me-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-success" type="submit">
       <i class="bi bi-search fw-bold"></i>
      </button>
     </div>
    </form>
    <ul class="navbar-nav ms-auto mb-2 mb-lg-0 text-center">
     <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle text-capitalize" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
       <i class="bi bi-incognito mx-2"></i>${rto.firstName}&nbsp;${rto.lastName}
      </a>
      <ul class="dropdown-menu dropdown-menu-end text-center" aria-labelledby="rtoDropdown">
       <li>
        <a class="dropdown-item rounded text-danger" href="rtologin.jsp">Logout</a>
       </li>
      </ul>
     </li>
    </ul>
   </div>
  </div>
 </nav>
 <div class="container mt-3">
  <h4>User List</h4>
  <div class="table-responsive">
   <c:if test="${not empty users}">
    <table class="table table-bordered border-dark table-sm text-center table-striped align-middle">
     <thead>
      <tr class="table-dark align-middle">
       <th scope="col">ID</th>
       <th scope="col">Name</th>
       <th scope="col">State</th>
       <th scope="col">Date of Birth</th>
       <th scope="col">Place of Birth</th>
       <th scope="col">RTO Office</th>
       <th scope="col">Email Address</th>
       <th scope="col">Phone Number</th>
       <th scope="col">Registered Time</th>
       <th scope="col">Application Number</th>
       <th scope="col">Application Status</th>
       <th scope="col" class="actions">Actions</th>
      </tr>
     </thead>
     <tbody>
      <c:forEach var="user" items="${users}">
       <tr>
        <td>${user.id}</td>
        <td>${user.firstName}&nbsp;${user.lastName}</td>
        <td>${user.state}</td>
        <td>${user.dob}</td>
        <td>${user.placeOfBirth}</td>
        <td>${user.rtoOffice}</td>
        <td>${user.emailAddress}</td>
        <td>${user.phoneNumber}</td>
        <td>${user.registeredTime}</td>
        <td>${user.applicationNumber}</td>
        <td id="status-${user.id}" class="status">${user.applicationStatus}</td>
        <td><a href="approveUser?id=${user.id}" class="btn btn-danger btn-sm fw-medium">Approve</a></td>
       </tr>
      </c:forEach>
     </tbody>
    </table>
   </c:if>
  </div>
  <c:if test="${not empty err}">
   <li style="list-style-type: none" class="text-danger fw-medium text-center">
    <i class="bi bi-x me-2"></i>${err}</li>
  </c:if>
  <c:if test="${not empty succ}">
   <li style="list-style-type: none" class="text-success fw-medium text-center">
    <i class="bi bi-check-circle-fill me-2"></i>${succ}
   </li>
  </c:if>
 </div>
</body>
</html>