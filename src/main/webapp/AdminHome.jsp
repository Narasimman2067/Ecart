<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin_home</title>
<jsp:include page="Navbar.jsp" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" />
</head>
<body>
<%
	String sessvalue = (String) session.getAttribute("userName");
	out.println("Welcome to Home " + "( " + sessvalue + " )");
	%>

	<a href="./primarydata.jsp"><button class="btn btn-primary p-2">PrimaryData</button></a>
	<a href="./Secondarydata.jsp">
		<button class="btn btn-secondary  p-2">SecondaryData</button>
	</a>
</body>
</html>