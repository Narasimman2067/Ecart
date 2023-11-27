package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Dbservice;

@WebServlet("/signup")
public class Admin_signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
//			response.setContentType("text/html");
//			PrintWriter out = response.getWriter();
			String ademail = request.getParameter("adMail");
			String adname = request.getParameter("aname");
			String adpassword = request.getParameter("adpass");

			

			String Query = "insert into admin_det(ademail,adname,adpassword) values(?,?,?)";
			Connection con =Dbservice.getConnection();

			PreparedStatement pst = con.prepareStatement(Query);
			pst.setString(1, ademail);
			pst.setString(2, adname);
			pst.setString(3, adpassword);

			int rows = pst.executeUpdate();

			if (rows == 1) {
				System.out.println("Registered succesfully" + rows);

				response.sendRedirect("AdminLogin.jsp");
			} else {
				System.out.println("Invalid credentials");

			}
			con.close();
		} catch (Exception e) {
			System.out.println("Error occcured" + e);

		}
		;

	}

}
