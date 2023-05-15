package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CheckVotingEligibilityServlet extends HttpServlet {
 @Override
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	 //get PrintWriter object
	 PrintWriter pw = res.getWriter();
	 //set rsponse content type
	 res.setContentType("text/html");
	 //read form data(req param values)
	 String name = req.getParameter("pname");
	 String addrs = req.getParameter("paddrs");
	 String tage = req.getParameter("page");
	 int age = Integer.parseInt(tage);
	 
	 //write b.logic
	 if(age>=18) {
		 pw.println("<h1 style='color:green;text-align:center'>"+name+"you are eligible for voting</h1>");
	 }
	 else {
		 pw.println("<h1 style='color:red;text-align:center'>"+name+"NOT eligible for voting</h1>");
	 }
	 //add home as the graphical hyperlink
	 pw.println("<a href='input.html'><img src='image/home.jfif' width='50' height='50'</a>");
	 
	 //close the stream
	 pw.close();
	 
	 
}//doGet(-,-)
 

}
