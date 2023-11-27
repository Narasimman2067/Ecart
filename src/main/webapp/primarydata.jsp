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
	<div class="form-bg container" >
		<div class="container-fluid">
			<div class="row  mt-4 p-4">
				<div class="col-md-4 align-center mt-4 col-md-offset-6">
					<div class="form-container">
						<div class="form-icon">
							<i class="fa fa-user"></i>
						</div>
						<h3 class="title"> Add Primary Data</h3>
						<form action="Pridata" class="form-horizontal" method="post">
							<div class="form-group">
								<label>Name </label> <input class="form-control" type="text"
									placeholder="Name" name="pname" required>
							</div>
							<div class="form-group">
								<label>MobileNumber</label> 
								<input class="form-control"
									type="number" placeholder="Mobile Number" maxlength=10 name="pmobile">
							</div>
							
							<button type="submit" class="btn btn-default"
								>Add Details</button>
						</form>
						<a href="./AdminHome.jsp">
					<button class="btn btn-primary m-2 p-2"
								>back</button>
					</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>