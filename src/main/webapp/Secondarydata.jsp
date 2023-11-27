<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee Details</title>
<link rel="stylesheet" href="/Ecart/Employye.css" type="text/css" />
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" />
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" />
</head>
<body>
	<div class="form-bg container-fluid" >
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-4 col-md-offset-4">
					<div class="form-container">
						<div class="form-icon">
							<i class="fa fa-user"></i>
						</div>
						<h3 class="title"> Add Employee Details</h3>
						<form action="secondarydata" method="post" class="form-horizontal">
							
							<div class="form-group">
								<label>MobileNumber</label> 
								<input class="form-control"
									type="number" placeholder="Mobile Number"  name="smobile">
							</div>
							<div class="form-group">
								<label>Address</label> <textarea class="form-control"
									rows=10 name="saddress"  placeholder="Address" name="saddress"></textarea>
							</div>
							<button type="submit" class="btn btn-default"
								>Add Details</button>
						</form>
					<a href="./AdminHome.jsp">
					<button class="btn btn-primary m-4 pr-6"
								>back</button>
					</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>