<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read All</title>
<%@include file="styles.jsp"%>
</head>
<body>
  <%@include file="navbar.jsp"%>
  <div class="container-xxl my-2 justify-content-between align-items-center">
    <c:if test="${dtos != null}">
      <p class="fw-bold fs-4">List of Details</p>
      <table class="table table-bordered border-dark my-2 text-center table-striped">
        <thead>
          <tr class="align-middle table-dark">
            <th scope="col">Id</th>
            <th scope="col">User Name</th>
            <th scope="col">Email</th>
            <th scope="col">Contact Number</th>
            <th scope="col">Violation Type</th>
            <th scope="col">&#8377; Fine Amount</th>
            <th scope="col">Violation Date</th>
            <th scope="col">Vehicle Number</th>
            <th scope="col">Location</th>
            <th scope="col">Issuer</th>
            <th scope="col">Payment Status</th>
            <th scope="col" colspan="2">Actions</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="d" items="${dtos}">
            <tr>
              <td>${d.id}</td>
              <td>${d.userName}</td>
              <td>${d.email}</td>
              <td>${d.phoneNumber}</td>
              <td>${d.violationType}</td>
              <td>${d.fineAmount}</td>
              <td>${d.date}</td>
              <td>${d.vehicleNumber}</td>
              <td>${d.location}</td>
              <td>${d.issuedBy}</td>
              <td>${d.paymentStatus}</td>
              <td><a href="register.jsp" class="btn btn-primary btn-sm rounded-0 fw-medium">Update</a></td>
              <td><a href="delete/${d.id}" class="btn btn-danger btn-sm rounded-0 fw-medium">Delete</a></td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </c:if>
    <c:if test="${noData != null}">
      <p class="text-danger text-center fw-bold fs-6">
        <i class="bi bi-emoji-frown-fill me-1"></i>${noData}</p>
    </c:if>
    <div class="text-center" style="padding-bottom: 339px;">
      <form action="readAll" method="get">
        <input type="submit" class="btn btn-primary rounded-0 fw-bold w-50" value="View All Details">
      </form>
    </div>
  </div>
  <%@include file="footer.jsp"%>
</body>
</html>