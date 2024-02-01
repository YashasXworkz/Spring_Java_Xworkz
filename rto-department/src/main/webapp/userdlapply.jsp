<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>DL Application Form Page</title>
<%@ include file="styles.jsp"%>
<style>
.form-control,.form-select {
 border: 1px solid black; border-radius: 0;
}

.required:after {
 content: " *"; color: red;
}
</style>
</head>
<body class="d-flex flex-column min-vh-100 bg-secondary-subtle">
 <%@ include file="navbar.jsp"%>
 <div class="container-fluid my-3">
  <div class="text-center fw-medium">
   <p class="fs-5 text-primary mb-0">NEW DRIVING LICENCE REGISTRATION</p>
   <p class="text-danger mb-0">
    **Fields marked with
    <mark class="text-danger bg-secondary-subtle">*</mark>
    are mandatory
   </p>
   <p class="text-danger">**To calucate Age, place the cursor in age field</p>
  </div>
  <div class="card shadow-lg fw-medium" style="border: 3px solid #003D63;">
   <div class="card-header text-light fw-bold text-break text-center text-light" style="background-color: #003D63;">DEMOGRAPHIC DETAILS</div>
   <div class="card-body bg-light">
    <form action="dlsave" method="post">
     <div class="row mb-3 g-lg-3">
      <label class="col-md-3 col-form-label required">APPLICANT FIRST NAME</label>
      <div class="col-md-3">
       <input type="text" class="form-control" name="firstName" placeholder="First Name" value="${user.firstName}" disabled>
      </div>
      <label class="col-md-3 col-form-label required ms-auto">APPLICANT MIDDLE NAME</label>
      <div class="col-md-3">
       <input type="text" class="form-control" name="middleName" placeholder="Middle Name" value="${user.middleName}" disabled>
      </div>
      <label class="col-md-3 col-form-label required">APPLICANT LAST NAME</label>
      <div class="col-md-3">
       <input type="text" class="form-control" name="lastName" placeholder="Last Name" value="${user.lastName}" disabled>
      </div>
      <label class="col-md-3 col-form-label required">DOB</label>
      <div class="col-md-3">
       <input type="date" class="form-control" name="dateOfBirth" value="${user.dob}" disabled>
      </div>
      <label class="col-md-3 col-form-label required">AGE</label>
      <div class="col-md-3">
       <input type="number" class="form-control" name="age" placeholder="Age" value="${user.age}" disabled>
      </div>
      <label class="col-md-3 col-form-label required">GENDER</label>
      <div class="col-md-3">
       <select class="form-select" name="gender" disabled>
        <option value="" selected>Select</option>
        <option value="${user.gender}" selected>${user.gender}</option>
        <option value="male">Male</option>
        <option value="female">Female</option>
        <option value="other">Other</option>
       </select>
      </div>
      <label class="col-md-3 col-form-label required">OCCUPATION</label>
      <div class="col-md-3">
       <select class="form-select" name="occupation" required>
        <option value="" selected>Select</option>
        <option value="agriculture">Agriculture</option>
        <option value="business">Business</option>
        <option value="government_service">Government Service</option>
        <option value="private_sector_employee">Private Sector Employee</option>
        <option value="student">Student</option>
        <option value="retired">Retired</option>
        <option value="housewife">Housewife</option>
        <option value="self_employed">Self-Employed</option>
        <option value="professional">Professional (Doctor, Engineer, Lawyer, etc.)</option>
        <option value="teacher">Teacher</option>
        <option value="artist">Artist</option>
        <option value="artisan">Artisan</option>
        <option value="daily_wage_laborer">Daily Wage Laborer</option>
        <option value="other">Other</option>
       </select>
      </div>
      <label class="col-md-3 col-form-label required">EDUCATION</label>
      <div class="col-md-3">
       <select class="form-select" name="qualification" disabled>
        <option value="" selected>Select</option>
        <option value="${user.qualification}" selected>${user.qualification}</option>
        <option value="SSLC">SSLC</option>
        <option value="PUC">PUC</option>
        <option value="ITI">ITI</option>
        <option value="Diploma">Diploma</option>
        <option value="Under Graduate">Under Graduate</option>
        <option value="Post Graduate">Post Graduate</option>
       </select>
      </div>
      <label class="col-md-3 col-form-label required">BLOOD GROUP</label>
      <div class="col-md-3">
       <select class="form-select" name="bloodGroup" disabled>
        <option value="" selected>Select</option>
        <option value="${user.bloodGroup}" selected>${user.bloodGroup}</option>
        <option value="A+">A+</option>
        <option value="A-">A-</option>
        <option value="B+">B+</option>
        <option value="B-">B-</option>
        <option value="AB+">AB+</option>
        <option value="AB-">AB-</option>
        <option value="O+">O+</option>
        <option value="O-">O-</option>
        <option value="Unknown">Unknown</option>
       </select>
      </div>
      <label class="col-md-3 col-form-label required">CITIZENSHIP</label>
      <div class="col-md-3">
       <select onchange="makeSubmenu(this.value)" class="form-select" name="state" disabled>
        <option value="" selected>Select</option>
        <option value="${user.state}" selected>${user.state}</option>
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
      <label class="col-md-3 col-form-label required">CITIZENSHIP NO</label>
      <div class="col-md-3">
       <input type="tel" class="form-control" name="aadharNumber" placeholder="Citizenship No" value="${user.aadharNumber}" disabled>
      </div>
      <label class="col-md-3 col-form-label required">CITIZENSHIP ISSUE DISTRICT</label>
      <div class="col-md-3">
       <select class="form-select" id="districtSelect" name="rtoOffice" disabled>
        <option value="" selected>Select</option>
        <option value="${user.rtoOffice}" selected>${user.rtoOffice}</option>
       </select>
      </div>
      <label class="col-md-3 col-form-label">PASSPORT NO</label>
      <div class="col-md-3">
       <input type="text" class="form-control" name="passportNo" placeholder="Passport No">
      </div>
      <label class="col-md-3 col-form-label">PASSPORT ISSUED COUNTRY</label>
      <div class="col-md-3">
       <select class="form-select" name="passportIssuedCountry">
        <option value="" selected>Select</option>
        <option value="United States">United States</option>
        <option value="Canada">Canada</option>
        <option value="United Kingdom">United Kingdom</option>
        <option value="France">France</option>
        <option value="Germany">Germany</option>
        <option value="Australia">Australia</option>
        <option value="Japan">Japan</option>
        <option value="Brazil">Brazil</option>
        <option value="India">India</option>
        <option value="China">China</option>
        <option value="SouthKorea">South Korea</option>
        <option value="Russia">Russia</option>
        <option value="Spain">Spain</option>
        <option value="Mexico">Mexico</option>
        <option value="Italy">Italy</option>
       </select>
      </div>
      <label class="col-md-3 col-form-label">IDENTITY MARK</label>
      <div class="col-md-9">
       <input type="text" class="form-control" name="identityMark" placeholder="Identity Mark">
      </div>
      <label class="col-md-3 col-form-label required">WITNESS FIRST NAME</label>
      <div class="col-md-3">
       <input type="text" class="form-control" name="witnessFirstName" placeholder="Witness First Name" required>
      </div>
      <label class="col-md-3 col-form-label">WITNESS MIDDLE NAME</label>
      <div class="col-md-3">
       <input type="text" class="form-control" name="witnessMiddleName" placeholder="Witness Middle Name">
      </div>
      <label class="col-md-3 col-form-label required">WITNESS LAST NAME</label>
      <div class="col-md-3">
       <input type="text" class="form-control" name="witnessLastName" placeholder="Witness Last Name" required>
      </div>
      <label class="col-md-3 col-form-label required">WITNESS RELATIONSHIP</label>
      <div class="col-md-3">
       <select class="form-select" name="witnessRelationship" required>
        <option value="" selected>Select</option>
        <option value="husband">Husband</option>
        <option value="wife">Wife</option>
        <option value="relative">Relative</option>
        <option value="son">Son</option>
        <option value="daughter">Daughter</option>
       </select>
      </div>
      <label class="col-md-3 col-form-label">TRAINER NAME</label>
      <div class="col-md-3">
       <input type="text" class="form-control" name="trainerName" placeholder="Trainer Name">
      </div>
      <label class="col-md-3 col-form-label">TRAINER LICENCE NO.</label>
      <div class="col-md-3">
       <input type="text" class="form-control" name="trainerLicenceNo" placeholder="Trainer Licence No">
      </div>

      <div class="d-flex flex-column gap-3 flex-lg-row gap-lg-3 justify-content-lg-center justify-content-evenly mt-5">
       <input type="submit" class="btn btn-primary fw-medium" id="submit">
       <a href="userdl.jsp" class="btn btn-primary fw-medium">Cancel</a>
      </div>
     </div>
    </form>
   </div>
  </div>
 </div>
 <script type="text/javascript" src="<c:url value="static/js/signupvalidation.js"/>"></script>
 <%@ include file="footer.jsp"%>
</body>
</html>