<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdminRegister</title>
<jsp:include page="Navbar.jsp" />
<link rel="stylesheet" href="/Ecart/Login.css" type="text/css" />
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" />
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" />
</head>
<body>

<div class="wrapper reg-wrapper">
        <div class="logo">
       
            <img src="https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSoqut9yKk3kgamHHKa-Fhu9VlB79XHCfih2hPAObHwd3WYrTsV" alt="">
        </div>
        <div class="text-center mt-2 name">
            APPLE-CART
              <div class="text-center asignup mt-0.4">
            Admin_Register
        </div>
        </div>
        
        <form action="signup" class="p-3 mt-3" method="post">
         <div class="form-field d-flex align-items-center">
                <span class="far fa-user"></span>
                
                <input type="email" name="adMail" id="userName" placeholder="Email" required>
            </div>
            <div class="form-field d-flex align-items-center">
                <span class="far fa-user"></span>
                <input type="text" name="aname" id="userName" placeholder="Username" required>
            </div>
            <div class="form-field d-flex align-items-center">
                <span class="fas fa-key"></span>
                <input type="password" name="adpass" id="pwd" placeholder="Password" required>
            </div>
            <button class="btn mt-3">Register</button>
        </form>
        <div class="text-center fs-6">
        <a href="./index.jsp">Sign In</a>
        </div>
    </div>
</body>
</html>