package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/UpdateDetails")
public class UpdateDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			
			String upname=request.getParameter("upname");
			String pmobile=request.getParameter("upmobile");
			String upaddress=request.getParameter("upaddress");
			
			String url = "jdbc:mysql://localhost:3306/ecommerce";
			String dbname = "root";
			String dbpass = "PNSVnnsr20@";
			
			
			String query ="update PrimaryData set pname=? where pmobile=?" ;
			String query2 ="update SecondaryData set saddress=? where smobile=?" ;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, dbname, dbpass);
			
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, upname);
			pst.setString(2, pmobile);
			
			int rs=pst.executeUpdate();
			PreparedStatement pst2=con.prepareStatement(query2);
			pst2.setString(1, upaddress);
			pst2.setString(2, pmobile);
			
			int rs2=pst.executeUpdate();
			
			
			
			
//			CallableStatement cst=con.prepareCall("{call getByStore(?,?,?)}");
//			cst.setString(1,upname);
//			cst.setString(3,pmobile);
//			cst.setString(2,upaddress);
			
			
		
		
		if(rs==1 || rs2==1) {
			System.err.println("Updated succesfully");
		}
		else {
			System.out.println("not updated");
		}

			
			
			
			
		} catch (Exception e) {
			System.out.println("Error occure" + e);
		}
		
		
		
		
		
	}

}
