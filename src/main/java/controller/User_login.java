package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Dbservice;

@WebServlet("/User_login")
public class User_login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {

			String s1 = request.getParameter("ulName");
			String s2 = request.getParameter("ulpass");
			Connection con =Dbservice.getConnection();
			String query = "select * from user_det";
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rst = pst.executeQuery();

			int flag = 0;
			while (rst.next()) {
				String username = rst.getString(3);
				String userpassword = rst.getString(4);

				if (s1.equals(username.trim()) && s2.equals(userpassword.trim())) {

					RequestDispatcher rd = request.getRequestDispatcher("./index.jsp");
					rd.include(request, response);
					out.println(
							"<h2 style='font-family:sans-serif;,display:flex;justify-content:center;align-items:center;position:absolute;top:80px;color:white'>Welcome to the AppleCart "
									+ "<span style='color:Red;font-family:monospace;font-size:40px;'>" + username
									+ "</span>" + " have a Nice day.</h1>");
					System.out.println("Login Succesfully");
					flag = 1;

					response.sendRedirect("./Userpage.jsp");

				}
			}
			if (flag == 0) {

				RequestDispatcher rd = request.getRequestDispatcher("./index.jsp");
				rd.include(request, response);
				System.out.println("incorrect username or password");
				out.println(
						"<h1 style='color:red;font-family:cursive,sans-serif;,display:flex;justify-content:center;align-items:center;position:absolute;top:80px;'>"
								+ "Incorrect username or password" + "</h1>");

			}
			con.close();

		} catch (Exception e) {
			System.out.println("Error occured" + e);
		}
	}

}
