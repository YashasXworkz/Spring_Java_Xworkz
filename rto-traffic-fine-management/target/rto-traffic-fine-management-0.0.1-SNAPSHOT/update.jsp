<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RTO Update Portal</title>
<%@include file="styles.jsp"%>
</head>
<body class="d-flex flex-column min-vh-100">
  <%@include file="navbar.jsp"%>
  <div class="container p-3 border border-dark-subtle w-75 shadow-lg my-3">
    <i class="bi bi-door-open-fill me-1 fs-4"></i><span class="border-bottom border-info border-4 fs-4 fw-bold">RTO</span> <span class="fs-4 fw-semibold">Traffic Fine Portal</span><span class="text-dark badge bg-info ms-1">Update form</span>
    <hr class="text-success">
    <form action="${pageContext.request.contextPath}/onUpdate" method="post">
      <input type="hidden" name="id" value="${d.id}">
      <div class="row">
        <p class="fw-medium text-info-emphasis">
          <i class="bi bi-file-person me-1"></i>User Details
        </p>
        <div class="col">
          <div class="form-floating mb-2">
            <input type="text" class="form-control rounded-0 border-dark" placeholder="Enter username" name="userName" value="${d.userName}" required> <label class="form-label">User Name</label>
          </div>
        </div>
        <div class="col">
          <div class="form-floating mb-2">
            <input type="email" class="form-control rounded-0 border-dark" placeholder="Enter email" name="email" value="${d.email}" required> <label class="form-label">Email address</label>
          </div>
        </div>
        <div class="col">
          <div class="form-floating mb-2">
            <input type="tel" class="form-control rounded-0 border-dark" placeholder="Enter Phone +91" name="phoneNumber" value="${d.phoneNumber}" required> <label class="form-label">Phone Number</label>
          </div>
        </div>
        <p class="fw-medium mt-2 text-info-emphasis">
          <i class="bi bi-stoplights-fill me-1"></i>Violation Details
        </p>
        <div class="col-md-4">
          <div class="form-floating mb-2">
            <select class="form-select rounded-0 border-dark" name="violationType" required>
              <option selected value="${d.violationType}">${d.violationType}</option>
              <option value="">Select violation type</option>
              <option value="Speeding">Speeding</option>
              <option value="Running a Red Light">Running a Red Light</option>
              <option value="Driving Without Seatbelt">Driving Without Seatbelt</option>
              <option value="Using Mobile Phone While Driving">Using Mobile While Driving</option>
              <option value="Drunk Driving">Drunk Driving</option>
              <option value="Parking in No-Parking Zone">Parking in No-Parking Zone</option>
              <option value="Driving Without Helmet">Driving Without Helmet</option>
              <option value="Wrong-Way Driving">Wrong-Way Driving</option>
              <option value="Overloading">Overloading</option>
              <option value="Not Following Lane Discipline">Not Following Lane Discipline</option>
            </select> <label class="form-label">Violation Type</label>
          </div>
        </div>
        <div class="col-md-4">
          <div class="form-floating mb-2">
            <select class="form-select rounded-0 border-dark" name="fineAmount" required>
              <option selected value="${d.fineAmount}">${d.fineAmount}</option>
              <option value="">Select fine amount</option>
              <option value="1000">Speeding - 1000</option>
              <option value="1500">Running a Red Light - 1500</option>
              <option value="500">Driving Without Seatbelt - 500</option>
              <option value="1000">Using Mobile While Driving - 1000</option>
              <option value="5000">Drunk Driving - 5000</option>
              <option value="500">Parking in No-Parking Zone - 500</option>
              <option value="1000">Driving Without Helmet - 1000</option>
              <option value="2000">Wrong-Way Driving - 2000</option>
              <option value="2000">Overloading - 2000</option>
              <option value="1000">Not Following Lane Discipline - 1000</option>
            </select> <label class="form-label">Fine Amount</label>
          </div>
        </div>
        <div class="col-md-4">
          <div class="form-floating mb-2">
            <input type="date" class="form-control rounded-0 border-dark" name="date" value="${d.date}" required> <label class="form-label">Violation Date</label>
          </div>
        </div>
        <div class="col-md-4">
          <div class="form-floating mb-2">
            <input type="text" class="form-control rounded-0 border-dark text-uppercase" placeholder="Enter vehicle number" name="vehicleNumber" value="${d.vehicleNumber}" required> <label class="form-label">Vehicle Number</label>
          </div>
        </div>
        <div class="col-md-4">
          <div class="form-floating mb-2">
            <select class="form-select rounded-0 border-dark" name="location" required>
              <option selected value="${d.location}">${d.location}</option>
              <option value="">Select location</option>
              <option value="Bangalore">Bangalore</option>
            </select> <label class="form-label">Location</label>
          </div>
        </div>
        <div class="col-md-4">
          <div class="form-floating mb-2">
            <select class="form-select rounded-0 border-dark" name="issuedBy" required>
              <option selected value="${d.issuedBy}">${d.issuedBy}</option>
              <option value="">Select</option>
              <option value="Traffic Police Department, Karnataka">Traffic Police Department, Karnataka</option>
            </select> <label class="form-label">Issued By</label>
          </div>
        </div>
        <div class="col-md-4">
          <div class="form-floating mb-2">
            <select class="form-select rounded-0 border-dark" name="paymentStatus" required>
              <option selected value="${d.paymentStatus}">${d.paymentStatus}</option>
              <option value="">Select</option>
              <option value="Paid">Paid</option>
              <option value="Unpaid">Unpaid</option>
            </select> <label class="form-label">Payment Status</label>
          </div>
        </div>
      </div>
      <div class="d-flex column-gap-2 mt-4">
        <input type="submit" class="btn btn-success fw-medium rounded-0 flex-fill" value="Update"> <a href="${pageContext.request.contextPath}/findall.jsp" class="btn btn-primary fw-medium rounded-0 flex-fill">Cancel</a>
      </div>
    </form>
  </div>
  <%@include file="footer.jsp"%>
</body>
</html>