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
  <div class="container p-2 mt-3 border border-success-subtle shadow-lg rounded-4 w-50">
    <h4 class="text-center bg-success-subtle p-2 border border-success text-success">RTO Traffic Fine Portal</h4>
    <hr>
    <form action="save" method="post">
      <div class="row">
        <div class="col border-end border-dark-subtle">
          <div class="form-floating mb-2">
            <input type="text" class="form-control" placeholder="Enter username" name="userName" required> <label class="form-label">User Name</label>
          </div>
          <div class="form-floating mb-2">
            <input type="email" class="form-control" placeholder="Enter email" name="email" required> <label class="form-label">Email address</label>
          </div>
          <div class="form-floating mb-2">
            <input type="tel" class="form-control" placeholder="Enter Phone +91" name="phoneNumber" required> <label class="form-label">Phone Number</label>
          </div>
          <div class="form-floating mb-2">
            <select class="form-select" name="violationType" required>
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
            </select> <label class="form-label">Violation Type</label>
          </div>
          <div class="form-floating mb-2">
            <select class="form-select" name="fineAmount" required>
              <option selected>Select fine amount</option>
              <option value="1000">Speeding - 1000</option>
              <option value="1500">Running a Red Light - 1500</option>
              <option value="500">Driving Without Seatbelt - 500</option>
              <option value="1000">Using Mobile Phone While Driving - 1000</option>
              <option value="5000">Drunk Driving - 5000</option>
              <option value="500">Parking in No-Parking Zone - 500</option>
              <option value="1000">Driving Without Helmet - 1000</option>
              <option value="2000">Wrong-Way Driving - 2000</option>
              <option value="2000">Overloading - 2000</option>
              <option value="1000">Not Following Lane Discipline - 1000</option>
            </select> <label class="form-label">Fine Amount</label>
          </div>
        </div>
        <div class="col">
          <div class="form-floating mb-2">
            <input type="date" class="form-control" name="date" required> <label class="form-label">Violation Date</label>
          </div>
          <div class="form-floating mb-2">
            <input type="text" class="form-control" placeholder="Enter vehicle number" name="vehicleNumber" required> <label class="form-label">Vehicle Number</label>
          </div>
          <div class="form-floating mb-2">
            <select class="form-select" name="location" required>
              <option selected>Select location</option>
              <option value="Bangalore">Bangalore</option>
            </select> <label class="form-label">Location</label>
          </div>
          <div class="form-floating mb-2">
            <select class="form-select" name="issuedBy" required>
              <option selected>Select</option>
              <option value="Traffic Police Department, Karnataka">Traffic Police Department, Karnataka</option>
            </select> <label class="form-label">Issued By</label>
          </div>
          <div class="form-floating mb-2">
            <select class="form-select" name="paymentStatus" required>
              <option selected>Select</option>
              <option value="Paid">Paid</option>
              <option value="Unpaid">Unpaid</option>
            </select> <label class="form-label">Payment Status</label>
          </div>
        </div>
      </div>
      <input type="submit" class="btn btn-outline-primary mt-2 w-100 fw-bold rounded-0">
    </form>
  </div>
</body>
</html>