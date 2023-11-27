package controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.PrimaryData;
import bean.SecondaryData;
import service.Dbservice;


@WebServlet("/EditServlet2")
public class EditServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		
//	PrintWriter out =response.getWriter();
//	
//	String sid=request.getParameter("id");
//	int id=Integer.parseInt(sid);
//	
//	String pname=request.getParameter("pname");
//	String pmobile=request.getParameter("pmobile");
//	String saddress=request.getParameter("saddress");
//	
//	PrimaryData p=new PrimaryData();
//	
//	p.setId(id);
//	p.setPname(pname);
//	p.setPmobile(pmobile);
//	SecondaryData s=new SecondaryData();
//	s.setId(id);
//	s.setSaddress(saddress);
//	
//	int status1=Dbservice.updatePrimary();
//	//int status1=Dbservice.updateSecondary(s);
//	
//    if(status1>0){  
//    	System.out.println("updated");
//        response.sendRedirect("ViewServelet");  
//    }else{  
//        out.println("Sorry! unable to update record");  
//    }  
//      
//    out.close();  
//	
//}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter out = response.getWriter();

//	    String sid = request.getParameter("id");
//	    int id = Integer.parseInt(sid);

	    String pname = request.getParameter("pname");
	    String saddress = request.getParameter("saddress");

	    PrimaryData p = new PrimaryData();
//	    p.setId(id);
	    p.setPname(pname);

	    SecondaryData s = new SecondaryData();
//	    s.setId(id);
	    s.setSaddress(saddress);

	    int status1 = Dbservice.updatePrimary(p);
	    int status2 = Dbservice.updateSecondary(s);

	    if (status1 > 0 && status2 > 0) {
	        System.out.println("Updated");
	        response.sendRedirect("ViewServelet");
	    } else {
	        out.println("Sorry! Unable to update record");
	    }

	    out.close();
	}

}
