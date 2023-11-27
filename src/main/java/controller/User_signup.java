package controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Dbservice;

@WebServlet("/User_admin")
public class User_signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String useremail = request.getParameter("usemail");
			String username = request.getParameter("usname");
			String userpassword = request.getParameter("uspass");

			

			String Query = "insert into user_det(useremail,username,userpassword) values(?,?,?)";
			Connection con =Dbservice.getConnection();
			PreparedStatement pst = con.prepareStatement(Query);
			pst.setString(1, useremail);
			pst.setString(2, username);
			pst.setString(3, userpassword);

			int rows = pst.executeUpdate();

			if (rows == 1) {
				out.println("Added Succesfully");
			System.out.println("Registered succesfully" + rows);
			response.sendRedirect("./index.jsp");
				
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
