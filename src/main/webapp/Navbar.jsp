<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Navbar</title>

<link rel="stylesheet" href="/Ecart/navbar.css" type="text/css" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" />
<Script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></Script>
</head>


<body style="overflow: hidden !important">
	<nav class="navbar navbar-expand-lg navbar-dark p-2 m-auto"
		style="background-color: #00b7eb;">
		<div class="container-fluid">

			<ul type="none">
				<li class="nav-item dropdown"><a
					class="navbar-brand nav-link dropdown-toggle" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">
						AdminPage </a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="./Admin_signup.jsp">Admin_signup</a></li>
						<li><a class="dropdown-item" href="./AdminLogin.jsp">Admin_Login</a></li>


					</ul></li>
			</ul>
			<ul type=none>
				<li class="nav-item dropdown"><a
					class="navbar-brand nav-link dropdown-toggle" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">
						User </a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="./User_Signup.jsp">User_signup</a></li>
						<li><a class="dropdown-item" href="./index.jsp">User_Login</a></li>


					</ul></li>
			</ul>
			<form class="d-flex" role="search">
				<input class="form-control me-2" type="search" placeholder="Search"
					aria-label="Search">
				<button class="btn btn-outline-light" type="submit">Search</button>
			</form>

			<!--   <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
     <div class="collapse navbar-collapse" id="navbarSupportedContent">
     
     
    </div> 
    -->
		</div>
	</nav>
</body>
</html>