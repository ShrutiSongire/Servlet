package com.servlet;



import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/submitform")//run only class level because class level hi deside kr ta hai kha jana hai
public class Emp extends HttpServlet {

	
//	@Override
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	  String id1 =request.getParameter("empId");
//	  String name1 =request.getParameter("empName");
//	  String email1 =request.getParameter("empEmail");
//	  
//	  
//	  System.out.println(id1);
//	  System.out.println(name1);
//	  System.out.println(email1);
//	  
//	}
	
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	  String id1 =request.getParameter("empId");
	  String name1 =request.getParameter("empName");
	  String email1 =request.getParameter("empEmail");
	  String empPhoneStr = request.getParameter("empPhone");
	  long empPhone1 = Long.parseLong(empPhoneStr);

	  String empDept1 =request.getParameter("empDept");
	  String empPosition1 =request.getParameter("empPosition");
	  String empSalaryStr =request.getParameter("empSalary");
	  float empSalary1 =Float.parseFloat(empSalaryStr);
	  String empDOB1 =request.getParameter("empDOB");
	  String empGender1 =request.getParameter("empGender");
	  String empAddress1 =request.getParameter("empAddress");
	  String empCity1 =request.getParameter("empCity");
	  String empState1 =request.getParameter("empState");
	  String empPinString =request.getParameter("empPin");
	  int empPin1 =Integer.parseInt(empPinString);
	  String empJoinDate1 =request.getParameter("empJoinDate");
	  String empQualification1 =request.getParameter("empQualification");
	  
	  int id11=Integer.parseInt(id1);
	  
	  System.out.println(id11);
	  System.out.println(name1);
	  System.out.println(email1);
	  System.out.println(empPhone1);
	  System.out.println(empDept1);
	  System.out.println(empPosition1);
	  System.out.println(empSalary1);
	  System.out.println(empDOB1);
	  System.out.println(empGender1);
	  System.out.println(empAddress1);
	  System.out.println(empCity1);
	  System.out.println(empState1);
	  System.out.println(empPin1);
	  System.out.println(empJoinDate1);
	  System.out.println(empQualification1);
	  
	  PrintWriter out = response.getWriter();

	 
	  out.println(id11);
	  out.println( name1 );
	  out.println(email1);
	  out.println(empPhone1);
	  out.println(empDept1);
	  out.println(empPosition1 );
	  out.println(empSalary1 );
	  out.println(empDOB1 );
	  out.println(empGender1);
	  out.println(empAddress1 );
	  out.println(empCity1);
	  out.println(empState1);
	  out.println(empPin1);
	  out.println(empJoinDate1);
	  out.println(empQualification1);
	  
	  
	 
	  
	  
}
	
	
	
}