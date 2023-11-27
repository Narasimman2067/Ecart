<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UpdateDetails</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" />
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" />


</head>
<body>
<%
		String name = request.getParameter("name");
		String mob = request.getParameter("mob");
		String address = request.getParameter("address");

		//out.print(mob + " " + name + " " + address);
	%>

	<form action="UpdateDetails" method="post">
		<table class="container table" align="center">
			
			<tr>
				<td>Name</td>
				<td><input type="text" id="pwd" name="upname" value="<%=name%>"></td>
			</tr>
			<tr>
				<td>MobileNumber</td>
				<td><input type="text" id="uname" name="upmobile" value="<%=mob%>"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" id="pwd" name="upaddress" value="<%=address%>"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit"></td>
			</tr>
			<!--  <tr>
				<td></td>
				<td><a href="signup.jsp">SignUp</a></td>
			</tr> -->
		</table>
	</form>

</body>
</html>