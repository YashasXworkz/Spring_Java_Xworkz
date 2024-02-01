<style>
.nav-item:hover {
 border-bottom: 3px solid white;
}
</style>
<nav class="navbar navbar-expand-lg navbar-light bg-light-subtle py-0" data-bs-theme="dark">
 <div class="container-fluid">
  <a class="navbar-brand d-flex align-items-center text-sm-truncate text-wrap text-break" href="index.jsp">
   <img src="static/images/logo.jpg" width="60" class="rounded-circle me-2">RTO DEPARTMENT
  </a>
  <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
   <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse my-2" id="navbarSupportedContent">
   <ul class="navbar-nav ms-auto mb-2 mb-lg-0 text-center">
    <li class="nav-item">
     <a class="nav-link active" aria-current="page" href="index.jsp">HOME</a>
    </li>
    <li class="nav-item dropdown">
     <a class="nav-link dropdown-toggle rounded" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"> USER </a>
     <ul class="dropdown-menu dropdown-menu-end text-center">
      <li>
       <a class="dropdown-item" href="userregister.jsp">Apply for LL</a>
      </li>
      <li>
       <hr class="dropdown-divider">
      </li>
      <li>
       <a class="dropdown-item" href="userllrapplstatus.jsp">Application Status</a>
      </li>
      <li>
       <hr class="dropdown-divider">
      </li>
      <li>
       <a class="dropdown-item" href="userdl.jsp">Apply for DL</a>
      </li>
     </ul>
    </li>
    <li class="nav-item">
     <a class="nav-link" href="rtologin.jsp">RTO</a>
    </li>
    <li class="nav-item">
     <a class="nav-link" href="adminlogin.jsp">ADMIN</a>
    </li>
   </ul>
  </div>
 </div>
</nav>