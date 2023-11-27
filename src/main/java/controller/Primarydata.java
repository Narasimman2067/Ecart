package controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.PrimaryData;
import service.Dbservice;

@WebServlet("/Pridata")
public class Primarydata extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String pname = request.getParameter("pname");
			String pmobile = request.getParameter("pmobile");

			PrimaryData p = new PrimaryData();

			p.setPname(pname);
			p.setPmobile(pmobile);

			int rows = Dbservice.insertPrimary(p);
			if (rows > 0) {
				System.out.println("primary data Inserted succesfully : " + rows);
				
				RequestDispatcher rd=request.getRequestDispatcher("AdminHome.jsp");
				rd.include(request, response);
				out.println("<h2 style='font-family:monospace,color:black;position:absolute;top:150px;'>" + "data added succesfully</h1>");
				
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
