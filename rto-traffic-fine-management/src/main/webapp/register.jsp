<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RTO Portal</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<style>
.nav-item:hover {
  border-bottom: 3px solid white;
}
</style>
</head>
<body>
  <%@include file="navbar.jsp"%>
  <div class="container p-2 mt-3 border border-success-subtle shadow-lg fw-semibold w-50">
    <h4 class="text-center bg-success-subtle p-2 border border-success text-success">RTO Traffic Fine Portal</h4>
    <hr>
    <form action="save" method="post">
      <div class="row">
        <div class="col border-end border-dark-subtle">
          <div class="mb-2">
            <label class="form-label">User Name</label> <input type="text" class="form-control" placeholder="Enter username" name="userName" required>
          </div>
          <div class="mb-2">
            <label class="form-label">Email address</label> <input type="email" class="form-control" placeholder="Enter email" name="email" required>
          </div>
          <div class="mb-2">
            <label class="form-label">Phone Number</label> <input type="tel" class="form-control" placeholder="Enter Phone +91" name="phoneNumber" required>
          </div>
          <div class="mb-2">
            <label class="form-label">Violation Type</label> <select class="form-select" name="violationType" required>
              <option selected>Select violation type</option>
              <option value="Speeding">Speeding</option>
              <option value="Running a Red Light">Running a Red Light</option>
              <option value="Driving Without Seatbelt">Driving Without Seatbelt</option>
              <option value="Using Mobile Phone While Driving">Using Mobile Phone While Driving</option>
              <option value="Drunk Driving">Drunk Driving</option>
              <option value="Parking in No-Parking Zone">Parking in No-Parking Zone</option>
              <option value="Driving Without Helmet">Driving Without Helmet</option>
              <option value="Wrong-Way Driving">Wrong-Way Driving</option>
              <option value="Overloading">Overloading</option>
              <option value="Not Following Lane Discipline">Not Following Lane Discipline</option>
            </select>
          </div>
          <div class="mb-2">
            <label class="form-label">Fine Amount</label> <input type="number" class="form-control" placeholder="Enter fine amount" name="fineAmount" required>
          </div>
        </div>
        <div class="col">
          <div class="mb-2">
            <label class="form-label">Violation Date</label> <input type="date" class="form-control" name="date" required>
          </div>
          <div class="mb-2">
            <label class="form-label">Vehicle Number</label> <input type="text" class="form-control" placeholder="Enter vehicle number" name="vehicleNumber" required>
          </div>
          <div class="mb-2">
            <label class="form-label">Location</label> <select class="form-select" name="location" required>
              <option selected>Select location</option>
              <option value="Bangalore">Bangalore</option>
            </select>
          </div>
          <div class="mb-2">
            <label class="form-label">Issued By</label> <select class="form-select" name="issuedBy" required>
              <option selected>Select</option>
              <option value="Traffic Police Department, Karnataka">Traffic Police Department, Karnataka</option>
            </select>
          </div>
          <div class="mb-2">
            <label class="form-label">Payment Status</label> <select class="form-select" name="paymentStatus" required>
              <option selected>Select</option>
              <option value="Paid">Paid</option>
              <option value="Unpaid">Unpaid</option>
            </select>
          </div>
        </div>
      </div>
      <input type="submit" class="btn btn-outline-primary mt-2 w-100 fw-bold rounded-0">
    </form>
  </div>
</body>
</html>