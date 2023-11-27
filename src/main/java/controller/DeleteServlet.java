package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
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


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			PrintWriter out=response.getWriter();
			
			Connection con=Dbservice.getConnection();	
			
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

					PrimaryData pmap = listmap.get(s.getSmobile());
					
				out.println("<td>"+pmap.getId()+"</td>");
				out.println("<td>"+pmap.getPname()+"</td>");
				out.println("<td>"+pmap.getPmobile()+"</td>");
				out.println("<td>"+s.getSaddress()+"</td>");
				
				String query="delete from PrimaryData where id=? and pname=? and pmobile=? ";
				
				int status=0;
					PreparedStatement ps=con.prepareCall(query);
					ps.setInt(1, pmap.getId());
					ps.setString(2, pmap.getPname());
					ps.setString(3,pmap.getPmobile());
					status=ps.executeUpdate();	
					
					
					String query2="delete from PrimaryData where saddress=?";
					PreparedStatement ps2=con.prepareCall(query2);
					ps2.setString(1, s.getSaddress());
					status=ps2.executeUpdate();	
					
					if(status>0) {
						System.out.println("Deleted Succesfully");
					}
					else {
						System.out.println("invalid data");
					}
					
					
				}}
			
			
		} catch (Exception e) {
		
			
			e.printStackTrace();			
			
		}
		
		
		
		
		
	}

}
