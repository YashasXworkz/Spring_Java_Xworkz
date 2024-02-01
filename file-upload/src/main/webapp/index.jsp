<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>File Upload</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>
<body class="bg-light-subtle" data-bs-theme="dark">
 <div class="h-100 d-flex align-items-center justify-content-center">
  <div class="container-fluid border border-light m-5 p-5 shadow-lg bg-primary-subtle rounded">
   <form action="upload" method="post" enctype="multipart/form-data">
    <div class="mb-3">
     <label class="form-label fw-bold">Upload a File<i class="bi bi-file-earmark-check-fill ms-2"></i></label>
     <input class="form-control" type="file" name="file">
    </div>
    <input type="submit" class="btn btn-primary" value="Upload">
    <input type="reset" class="btn btn-primary fw-medium" value="Reset" onclick="window.location.href='index.jsp'">
   </form>
  </div>
 </div>
 <c:if test="${not empty message}">
  <p class="alert alert-warning">${message}</p>
 </c:if>
</body>
</html>