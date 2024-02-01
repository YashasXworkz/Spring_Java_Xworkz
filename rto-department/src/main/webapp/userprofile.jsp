<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Profile Page</title>
<%@ include file="styles.jsp"%>
<style>
.form-control {
 border: 1px solid rgba(0, 0, 0, 0.30);
}

.required:after {
 content: " *"; color: red;
}

.table {
 font-weight: normal;
}

.disabled:hover {
 cursor: not-allowed;
}

.custom-table-row {
 --bs-table-bg: #1B6B93; --bs-table-color: #fff;
}
</style>
</head>
<body class="d-flex flex-column min-vh-100 bg-secondary-subtle">
 <div class="container-fluid my-3">
  <div class="card shadow-lg fw-medium" style="border: 1px solid #40C2FF;">
   <div class="card-header text-light fs-4 fw-bold text-break" style="background-color: #40C2FF;">Application Status</div>
   <div class="card-body bg-light">
    <div class="row p-3 gap-lg-5">
     <label class="col-md-2 col-form-label required">Application Number</label>
     <div class="col-md-2">
      <input type="text" class="form-control disabled" value="${user.applicationNumber}" disabled>
     </div>
     <label class="col-md-2 col-form-label required">Date of Birth</label>
     <div class="col-md-2">
      <input type="date" class="form-control disabled" value="${user.dob}" disabled>
     </div>
    </div>
    <hr>
    <fieldset class="border border-dark border-opacity-50 p-3 mb-3">
     <legend class="float-none w-auto px-1 text-break fs-6">Applicant Details</legend>
     <div class="table-responsive">
      <table class="table table-bordered align-middle border-dark-subtle">
       <tbody>
        <tr class="text-nowrap text-break">
         <th scope="row">Appl No:</th>
         <td>${user.applicationNumber}</td>
        </tr>
        <tr class="text-nowrap text-break">
         <th scope="row">Appl Date:</th>
         <td>${user.registeredTime}</td>
        </tr>
        <tr class="text-nowrap text-break">
         <th scope="row">RTO Name:</th>
         <td>${user.rtoOffice}</td>
        </tr>
        <tr class="text-nowrap text-break">
         <th scope="row">Name:</th>
         <td class="text-capitalize">${user.firstName}&nbsp;${user.lastName}</td>
        </tr>
        <tr class="text-nowrap text-break">
         <th scope="row">DOB:</th>
         <td>${user.dob}</td>
        </tr>
       </tbody>
      </table>
     </div>
    </fieldset>
    <fieldset class="border border-dark border-opacity-50 p-3 mb-3">
     <legend class="float-none w-auto px-1 text-break fs-6">Related Application(s) of the Applicant</legend>
     <div class="table-responsive">
      <table class="table table-bordered text-center align-middle border-dark-subtle">
       <thead>
        <tr class="text-nowrap text-break custom-table-row">
         <th scope="col">Id</th>
         <th scope="col">Application Number</th>
         <th scope="col">Status</th>
        </tr>
       </thead>
       <tbody>
        <tr class="text-nowrap text-break">
         <td>${user.id}</td>
         <td>${user.applicationNumber}</td>
         <td>${user.applicationStatus}</td>
        </tr>
       </tbody>
      </table>
     </div>
    </fieldset>
    <div class="d-flex flex-column gap-3 flex-lg-row gap-lg-3 justify-content-lg-center justify-content-evenly mt-3">
     <input type="submit" class="btn btn-primary" value="Back" onclick="window.location.href='userllrapplstatus.jsp'">
    </div>
   </div>
  </div>
 </div>
 <%@ include file="footer.jsp"%>
</body>
</html>