package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.PrimaryData;
import bean.SecondaryData;
import service.Dbservice;

@WebServlet("/ViewServelet")
public class ViewServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		PrintWriter out = response.getWriter();
		out.print("<h1>Employee Details</h1>");


		out.print("<table border='1' width='100%'");
		out.print("<tr><th>Id</th><th>Name</th><th>MobileNumber</th><th>Address</th><th>Edit</th><th>Delete</th></tr>");

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

				
						
			PrimaryData pmap=listmap.get(s.getSmobile());

				out.print("<tr><td>" + pmap.getId() + "</td><td>" + pmap.getPname() + "</td><td>" + pmap.getPmobile()
						+ "</td><td>" +s.getSaddress() + 
						"</td>"
+"<td><a href='./UserView.jsp?pname="+ pmap.getPname()+
						"'pmobile=" + pmap.getPmobile()+"'saddress=" + s.getSaddress()+"'>edit</a></td>"
	
						
						
						+ "<td><a href='DeleteServlet?pname=" + pmap.getPname() +"'pmobile=" + pmap.getPmobile()+"'saddress=" + s.getSaddress()+"'>delete</a></td></tr>");

					}
					
				}

		out.print("</table>");

		out.close();

	}

}
