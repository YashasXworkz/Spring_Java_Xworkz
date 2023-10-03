<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
<%@include file="styles.jsp"%>
</head>
<body>
  <%@include file="navbar.jsp"%>
  <div class="container-xxl my-2 justify-content-between align-items-center">
    <c:if test="${dtos != null}">
      <p class="bg-success-subtle border border-success border-3 text-center fw-bold fs-4">List of Details</p>
      <table class="table table-bordered border-dark my-2 table-sm text-center table-striped">
        <thead>
          <tr class="align-middle table-dark">
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
          </tr>
        </thead>
        <tbody>
          <c:forEach var="d" items="${dtos}">
            <tr>
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
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </c:if>
    <div class="text-center" style="padding-bottom: 338px;">
      <form action="show" method="get">
        <input type="submit" class="btn btn-primary rounded-0 fw-bold w-50" value="View All Details">
      </form>
    </div>
  </div>
  <%@include file="footer.jsp"%>
</body>
</html>