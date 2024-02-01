<nav class="navbar navbar-expand-lg bg-light-subtle border-bottom py-0" data-bs-theme="dark">
 <div class="container-fluid">
  <a class="navbar-brand text-wrap text-break" href="#">
   <img src="https://i.ibb.co/0DBWXR4/logo.jpg" width="60" class="rounded-circle me-2" alt="Logo"> RTO DEPARTMENT
  </a>
  <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
   <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
   <form class="d-flex">
    <div class="input-group">
     <input class="form-control border border-success me-2" type="search" placeholder="Search" aria-label="Search">
     <button class="btn btn-success" type="submit">
      <i class="bi bi-search fw-bold"></i>
     </button>
    </div>
   </form>
   <ul class="navbar-nav ms-auto mb-2 mb-lg-0 text-center">
    <li class="nav-item">
     <a class="nav-link" href="rtosignup.jsp">Create RTO</a>
    </li>
    <li class="nav-item dropdown">
     <a class="nav-link dropdown-toggle text-capitalize" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
      <i class="bi bi-incognito mx-2"></i>${admin.firstName}&nbsp;${admin.lastName}
     </a>
     <ul class="dropdown-menu dropdown-menu-end text-center" aria-labelledby="adminDropdown">
      <li>
       <a class="dropdown-item rounded text-danger" href="adminlogin.jsp">Logout</a>
      </li>
     </ul>
    </li>
   </ul>
  </div>
 </div>
</nav>
