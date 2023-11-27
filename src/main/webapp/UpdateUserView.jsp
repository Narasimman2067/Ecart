<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="service.Dbservice"%>
<%@ page import="bean.PrimaryData"%>
<%@ page import="bean.SecondaryData"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserView</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" />
</head>
<body>
	<form action='EditServlet' method='post'>
		<table class="table container colspan-4 col-md-4 align-center border-2px cellpaddding-2px cellspacing-3px">


			<%
			String pname = request.getParameter("pname");
			String pmobile = request.getParameter("pmobile");
			String saddress= request.getParameter("saddress");
%>

<tr>
<th>Name:</th>
<th>MobileNumber:</th>
<th>Address:</th>
	</tr>	
			<tr>
				
				<td><input type='text' name='pname' value="<%=pname%>" /></td>
			
				
				<td><input type='number' name='pmobile' readonly='readonly' value="<%=pmobile%>" /></td>
			
				
				<td><input name='saddress' value=" <%=saddress%>"></td>
			</tr>
			<tr align="center">
				<td colspan='3' class="border:5px"  align="center">
			
			
			
				<a href='./UserViewLogic.jsp'><button style='background-color:orangered;color:white; padding:0.5rem;' 
						type='submit'>Edit_Save</button></a>
				</td>
			</tr>














		</table>
	</form>

</body>
</html>