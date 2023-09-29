<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
<%@include file="styles.jsp"%>
</head>
<body>
  <%@include file="navbar.jsp"%>
  <table class="table table-bordered border-dark mt-5 table-sm text-center align-middle container">
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
      <tr class="table-success">
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
    </tbody>
  </table>
  <div style="padding-top: 311px;"></div>
  <%@include file="footer.jsp"%>
</body>
</html>