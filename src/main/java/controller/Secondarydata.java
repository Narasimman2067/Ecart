package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.SecondaryData;
import service.Dbservice;

@WebServlet("/secondarydata")
public class Secondarydata extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String smobile = request.getParameter("smobile");
			String saddress = request.getParameter("saddress");

			SecondaryData s = new SecondaryData();
			s.setSmobile(smobile);
			s.setSaddress(saddress);

			int rows = Dbservice.insertSecondary(s);

			if (rows > 0) {
				System.out.println("Secondary data Inserted succesfully : " + rows);
				out.println("<h1>added succesfully</h1>");
				response.sendRedirect("./AdminHome.jsp");
			} else {
				System.out.println("Invalid credentials");

			}
			out.close();
		} catch (Exception e) {
			System.out.println("Error occcured" + e);

		}
		;

	}

}
