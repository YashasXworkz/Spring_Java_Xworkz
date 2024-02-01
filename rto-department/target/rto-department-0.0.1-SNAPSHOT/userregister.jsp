<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Application Form Page</title>
<%@ include file="styles.jsp"%>
<style>
.required:after {
 content: " *"; color: red;
}

.rtoPincode:hover {
 cursor: not-allowed;
}
</style>
</head>
<body class="d-flex flex-column min-vh-100 bg-secondary-subtle">
 <c:if test="${not empty succ}">
  <script>
			alert("${succ}")
		</script>
 </c:if>
 <c:if test="${not empty err}">
  <script>
			alert("${err}")
		</script>
 </c:if>
 <%@ include file="navbar.jsp"%>
 <div class="container-fluid my-3">
  <div class="card shadow-lg fw-medium" style="border: 1px solid #40C2FF;">
   <div class="card-header text-light fs-4 fw-bold text-break" style="background-color: #40C2FF;">Application for Learner's Licence (LL) - General</div>
   <div class="card-body">
    <form action="usersave" method="post">
     <div class="mb-3 text-center fw-bold" style="font-size: 13px;">Select RTO office from where LL is being applied</div>
     <div class="row p-3">
      <label class="col-md-2 col-form-label required">State</label>
      <div class="col-md-2">
       <select onchange="makeSubmenu(this.value)" class="form-select" name="state" required>
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
      <label class="col-md-2 col-form-label required text-wrap">RTO Office</label>
      <div class="col-md-2">
       <select class="form-select" id="rtoOffice" name="rtoOffice" required>
        <option value="" selected>Select</option>
       </select>
      </div>
      <label class="col-md-2 col-form-label required">Pincode</label>
      <div class="col-md-2">
       <input type="text" class="form-control rtoPincode" id="rtoPincode" placeholder="Pincode" disabled>
      </div>
     </div>
     <hr>
     <fieldset class="border border-dark border-opacity-50 p-3 mb-3">
      <legend class="float-none w-auto px-1 text-break">Personal Details</legend>
      <div class="row mb-3">
       <label class="col-md-2 col-form-label required">Applicant Name</label>
       <div class="col-md-4 mb-2 mb-lg-0">
        <input oninput="handleFirst()" type="text" class="form-control" id="firstName" name="firstName" placeholder="First Name" required>
        <span id="fnmsg"></span>
       </div>
       <div class="col-md-3 mb-2 mb-lg-0">
        <input oninput="handleMiddle()" type="text" class="form-control" id="middleName" name="middleName" placeholder="Middle Name" required>
        <span id="mnmsg"></span>
       </div>
       <div class="col-md-3">
        <input oninput="handleLast()" type="text" class="form-control" id="lastName" name="lastName" placeholder="Last Name" required>
        <span id="lnmsg"></span>
       </div>
      </div>
      <div class="row mb-3">
       <label class="col-md-2 col-form-label required">Gender</label>
       <div class="col-md-4 text-break">
        <div class="form-check form-check-inline">
         <input class="form-check-input" type="radio" name="gender" value="male" id="male" required>
         <label class="form-check-label" for="male">Male</label>
        </div>
        <div class="form-check form-check-inline">
         <input class="form-check-input" type="radio" name="gender" value="female" id="female" required>
         <label class="form-check-label" for="female">Female</label>
        </div>
        <div class="form-check form-check-inline">
         <input class="form-check-input" type="radio" name="gender" value="other" id="other" required>
         <label class="form-check-label" for="other">Other</label>
        </div>
       </div>
       <label class="col-md-2 col-form-label required">Date of Birth</label>
       <div class="col-md-4">
        <input type="date" class="form-control" name="dob" max="2005-11-10" required>
       </div>
      </div>
      <div class="row mb-3">
       <label class="col-md-2 col-form-label required">Age</label>
       <div class="col-md-4">
        <div class="input-group">
         <input oninput="handleAge()" type="number" class="form-control" id="age" name="age" placeholder="Age">
         <span class="input-group-text bg-secondary bg-opacity-75 text-center fw-bold text-bg-dark">years</span>
        </div>
        <span id="agmsg"></span>
       </div>
       <label class="col-md-2 col-form-label required">Place of Birth</label>
       <div class="col-md-4">
        <select class="form-select" id="district" name="placeOfBirth" required>
         <option value="" selected>Select</option>
        </select>
       </div>
      </div>
      <div class="row mb-3">
       <label class="col-md-2 col-form-label required">Country of Birth</label>
       <div class="col-md-4">
        <select class="form-select" name="country" required>
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
       <label class="col-md-2 col-form-label required">Qualification</label>
       <div class="col-md-4">
        <select class="form-select" name="qualification" required>
         <option value="" selected>Select</option>
         <option value="SSLC">SSLC</option>
         <option value="PUC">PUC</option>
         <option value="ITI">ITI</option>
         <option value="Diploma">Diploma</option>
         <option value="Under Graduate">Under Graduate</option>
         <option value="Post Graduate">Post Graduate</option>
        </select>
       </div>
      </div>
      <div class="row mb-3">
       <label class="col-md-2 col-form-label required">Blood Group</label>
       <div class="col-md-4">
        <select class="form-select" name="bloodGroup" required>
         <option value="" selected>Select</option>
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
       <label class="col-md-2 col-form-label required">Email Id</label>
       <div class="col-md-4">
        <input oninput="handleEmail()" type="email" class="form-control" id="emailAddress" name="emailAddress" placeholder="Ex: abc@xyz.com" required>
        <span id="emsg"></span>
       </div>
      </div>
      <div class="row mb-3">
       <label class="col-md-2 col-form-label required text-break">Applicants Mobile Number</label>
       <div class="col-md-4">
        <div class="input-group">
         <span class="input-group-text bg-secondary bg-opacity-75 text-center fw-bold text-bg-dark">+91</span>
         <input oninput="handlePhone()" type="tel" class="form-control" id="phoneNumber" name="phoneNumber" placeholder="Mobile Number" required>
        </div>
        <span id="phmsg"></span>
       </div>
       <!-- <label class="col-md-2 col-form-label required text-wrap">Alternate Mobile Number</label>
              <div class="col-md-4">
                <div class="input-group">
                  <span class="input-group-text bg-secondary bg-opacity-75 text-center fw-bold text-bg-dark">+91</span>
                  <input oninput="handleAlternatePhone()" type="tel" class="form-control" id="alternatePhoneNumber"
                    name="alternatePhoneNumber" placeholder="Alternate Mobile Number" required>
                </div>
                <span id="alphmsg"></span>
              </div> -->
      </div>
     </fieldset>
     <fieldset class="border border-dark border-opacity-50 p-3 mb-3">
      <legend class="float-none w-auto px-1 text-break">Address</legend>
      <div class="row mb-3">
       <label class="col-md-2 col-form-label required">Present Address</label>
       <div class="col-md-4">
        <textarea oninput="handlePresentAdd()" class="form-control text-capitalize" rows="3" id="presentAddress" name="presentAddress" placeholder="Present Address" required></textarea>
        <span id="presaddmsg"></span>
       </div>
       <label class="col-md-2 col-form-label required text-wrap">Permanent Address</label>
       <div class="col-md-4">
        <textarea oninput="handlePermanentAdd()" class="form-control text-capitalize" rows="3" id="permanentAddress" name="permanentAddress" placeholder="Permanent Address" required></textarea>
        <span id="permaddmsg"></span>
        <div class="col-md-12">
         <div class="form-check">
          <input onclick="copyPresentAddress()" class="form-check-input" type="checkbox" id="sameAddress">
          <label class="form-check-label text-primary fw-bold text-break" for="sameAddress"> Same as Present Address </label>
         </div>
        </div>
       </div>
      </div>
      <div class="row mb-3">
       <label class="col-md-2 col-form-label required">Present Pincode</label>
       <div class="col-md-4">
        <input oninput="handlePresentPin()" type="text" class="form-control" id="presentPincode" name="presentPincode" placeholder="Present Pincode" required>
        <span id="prespinmsg"></span>
       </div>
       <label class="col-md-2 col-form-label required text-wrap">Permanent Pincode</label>
       <div class="col-md-4">
        <input oninput="handlePermanentPin()" type="text" class="form-control" id="permanentPincode" name="permanentPincode" placeholder="Permanent Pincode" required>
        <span id="permpinmsg"></span>
       </div>
      </div>
      <div class="row mb-3">
       <label class="col-md-2 col-form-label required">Aadhar Number</label>
       <div class="col-md-4">
        <input oninput="handleAadhar()" type="text" class="form-control" id="aadharNumber" name="aadharNumber" placeholder="Aadhar Number" required>
        <span id="admsg"></span>
       </div>
      </div>
     </fieldset>
     <fieldset class="border border-dark border-opacity-50 p-3">
      <legend class="float-none w-auto px-1 text-break">Declaration</legend>
      <div class="row mb-3">
       <div class="col-12 text-break">
        <p class="text-danger fw-bold d-inline-block me-3">Fill-up Form1 details before submitting the application</p>
        <p class="d-inline-block bg-warning p-2 border border-dark border-2 fw-bold">Self Declaration (Form1)</p>
        <div class="ms-3">
         <div class="form-check">
          <label class="form-check-label text-break"> 1. I am willing to donate my organs, in case of accidental death&quest; </label>
          <div class="form-check form-check-inline">
           <input class="form-check-input" type="radio" name="organDonation" value="true" required>
           <label class="form-check-label">Yes</label>
          </div>
          <div class="form-check form-check-inline">
           <input class="form-check-input" type="radio" name="organDonation" value="false" required>
           <label class="form-check-label">No</label>
          </div>
         </div>
         <div class="form-check">
          <label class="form-check-label text-break" for="check"> 2. I hereby declare that the above details are true to the best of my knowledge. </label>
          <div class="form-check form-check-inline" style="vertical-align: middle;">
           <input class="form-check-input" type="checkbox" id="check" required checked>
          </div>
         </div>
        </div>
       </div>
      </div>
     </fieldset>
     <div class="d-flex flex-column gap-3 flex-lg-row gap-lg-3 justify-content-lg-center justify-content-evenly mt-3">
      <input type="submit" class="btn btn-primary fw-medium" id="submit" disabled>
      <input type="reset" class="btn btn-primary fw-medium" value="Refresh" onclick="window.location.href='userregister.jsp'">
      <a href="index.jsp" class="btn btn-primary fw-medium">Cancel</a>
     </div>
    </form>
   </div>
  </div>
 </div>
 <script type="text/javascript" src="<c:url value="static/js/uservalidation.js" />"></script>
 <%@ include file="footer.jsp"%>
</body>
</html>