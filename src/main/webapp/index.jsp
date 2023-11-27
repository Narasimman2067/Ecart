<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<jsp:include page="Navbar.jsp" />

<link rel="stylesheet" href="/Ecart/Login.css" type="text/css" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" />


</head>
<body class="body">



	<div class="wrapper">

		<div class="logo">
			<img
				src="https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSoqut9yKk3kgamHHKa-Fhu9VlB79XHCfih2hPAObHwd3WYrTsV"
				alt="">
		</div>
		<div class="text-center mt-4 name">
			APPLE-CART
			<div class="text-center asignup mt-0.4">User-Login</div>
		</div>
		<form action="User_login" method="post" class="p-3 mt-3">
			<div class="form-field form-field2 d-flex align-items-center">
				<span class="far fa-user"></span> <input type="text" name="ulName"
					id="userName" placeholder="Username" required>
			</div>
			<div class="form-field form-field2 d-flex align-items-center">
				<span class="fas fa-key"></span> <input type="password"
					name="ulpass" id="pwd" placeholder="Password" required>
			</div>
			<button class="btn mt-3">Login</button>
		</form>
		<div class="text-center fs-6">
			<a href="#">Forget password?</a> or <a href="./User_Signup.jsp">Sign
				up</a>
		</div>
	</div>


</body>
</html>