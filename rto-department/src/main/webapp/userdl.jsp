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
.form-control {
 border: 1px solid black; border-radius: 0;
}

.required:after {
 content: " *"; color: red;
}
</style>
</head>
<body class="d-flex flex-column min-vh-100 bg-secondary-subtle">
 <%@ include file="navbar.jsp"%>
 <c:if test="${not empty err}">
  <script>
			alert("${err}")
		</script>
 </c:if>
 <div class="container-fluid my-3">
  <div class="card shadow-lg fw-medium" style="border: 3px solid #40C2FF;">
   <div class="card-header text-light fw-bold text-break" style="background-color: #40C2FF;">Application for Driving Licence (DL)</div>
   <div class="card-body bg-light">
    <form action="checkUser" method="post">
     <div class="row mb-3 g-lg-3">
      <label class="col-md-4 col-form-label required">Application Number</label>
      <div class="col-md-4">
       <input type="text" class="form-control" name="applNo" placeholder="Ex: KA2023LLR708" required>
      </div>
      <div class="col-md-4">
       <input type="submit" class="btn btn-primary w-50 fw-medium">
      </div>
     </div>
    </form>
   </div>
  </div>
 </div>
 <%@ include file="footer.jsp"%>
</body>
</html>