<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search By Fields</title>
<%@include file="styles.jsp"%>
</head>
<body>
  <%@include file="navbar.jsp"%>
  <div class="container border border-dark-subtle shadow-lg mt-3 p-3">
    <span class="fs-5 fw-bold">Search & Delete</span><i class="bi bi-search ms-1 fw-bold"></i>
    <div class="row mt-3">
      <div class="col">
        <form action="findById" method="get">
          <div class="form-floating mb-2">
            <input type="number" class="form-control border-dark rounded-0" placeholder="Search by id" name="id" required> <label for="floatingInput">Id</label>
          </div>
          <input type="submit" class="btn btn-primary rounded-0 fw-medium w-100" value="Search Id">
        </form>
      </div>
      <div class="col">
        <form action="findByEmail" method="get">
          <div class="form-floating mb-2 text-center">
            <input type="email" class="form-control border-dark rounded-0" placeholder="Search by email" name="email" required> <label for="floatingInput">Email address</label>
          </div>
          <input type="submit" class="btn btn-primary rounded-0 fw-medium w-100" value="Search Email">
        </form>
      </div>
      <div class="col">
        <form action="findByName" method="get">
          <div class="form-floating mb-2 text-center">
            <input type="text" class="form-control border-dark rounded-0" placeholder="Search by username" name="userName" required> <label for="floatingInput">Username</label>
          </div>
          <input type="submit" class="btn btn-primary rounded-0 fw-medium w-100" value="Search username">
        </form>
      </div>
    </div>
  </div>
  <hr>

  <div class="container-xxl my-2 justify-content-between align-items-center">
    <c:if test="${d != null}">
      <p class="text-success text-center fw-bold fs-6">
        <i class="bi bi-patch-check-fill me-1"></i>Found
      </p>
      <table class="table table-bordered border-dark my-2 table-sm text-center table-striped">
        <thead>
          <tr class="align-middle table-dark">
            <th scope="col">Id</th>
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
            <th scope="col">Actions</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>${d.id}</td>
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
            <td><a href="delete/${d.id}" class="btn btn-danger btn-sm rounded-0 fw-medium">Delete Id</a></td>
          </tr>
        </tbody>
      </table>
    </c:if>

    <c:if test="${dto != null}">
      <p class="text-success text-center fw-bold fs-6">
        <i class="bi bi-patch-check-fill me-1"></i>Found
      </p>
      <table class="table table-bordered border-dark my-2 table-sm text-center table-striped">
        <thead>
          <tr class="align-middle table-dark">
            <th scope="col">Id</th>
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
            <th scope="col" colspan="2">Actions</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="d" items="${dto}">
            <tr>
              <td>${d.id}</td>
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
              <td><a href="deleteByEmail/${d.email}" class="btn btn-danger btn-sm rounded-0 fw-medium">Delete Email</a></td>
              <td><a href="deleteByName/${d.userName}" class="btn btn-danger btn-sm rounded-0 fw-medium">Delete Username</a></td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </c:if>
    <c:if test="${notFound != null}">
      <p class="text-danger text-center fw-bold fs-6">
        <i class="bi bi-emoji-frown-fill me-1"></i>${notFound}</p>
    </c:if>
    <c:if test="${succ != null}">
      <p class="text-success text-center fw-bold fs-6">
        <i class="bi bi-check2-all me-1"></i>${succ}</p>
    </c:if>
    <c:if test="${err != null}">
      <p class="text-danger text-center fw-bold fs-6">
        <i class="bi bi-check2-all me-1"></i>${err}</p>
    </c:if>
  </div>
</body>
</html>