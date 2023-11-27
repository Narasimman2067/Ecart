<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
	<%@page import="bean.*"%>
	<%@page import="service.Dbservice"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
	<table border='1' width='100%' align='center'>
		<tr>
			
			<th>Name</th>
			<th>MobileNumber</th>
			<th>Address</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<%
		Map<String, PrimaryData> listmap = new HashMap<String, PrimaryData>();

		List<PrimaryData> list1 = Dbservice.getAllDatas();

		if (!list1.isEmpty()) {
			for (PrimaryData p : list1) {
				listmap.put(p.getPmobile(), p);

			}
		}

		List<SecondaryData> list2 = Dbservice.getAllSecondaryDatas();

		if (!list2.isEmpty()) {

			for (SecondaryData s : list2) {

				PrimaryData p = listmap.get(s.getSmobile());
		%>

		<tr>
			
			<td><%=p.getPname()%></td>
			<td><%=p.getPmobile()%></td>
			<td><%=s.getSaddress()%></td>
			<td><a
				href="./UserView.jsp?pname=<%=p.getPname()%>&pmobile=<%=p.getPmobile()%>&saddress=<%=s.getSaddress()%> ">edit</a></td>
			
			
			<td><a href="DeleteServlet?pname=<%=p.getPname()%>&pmobile=<%=p.getPmobile()%>&saddress=<%=s.getSaddress()%>">Delete</a></td>
		</tr>





		<%
		}

		}
		%>



	</table>
</body>
</html>