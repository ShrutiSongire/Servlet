package com.servlet;



import java.io.IOException;

import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

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
	  int id11=Integer.parseInt(id1);
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
	  
	  
	  
	  System.out.println("<h1>"+id11+"</h1>");
	  System.out.println("<h1>"+name1+"</h1>");
	  System.out.println("<h1>"+email1+"</h1>");
	  System.out.println("<h1>"+empPhone1+"</h1>");
	  System.out.println("<h1>"+empDept1+"</h1>");
	  System.out.println("<h1>"+empPosition1+"</h1>");
	  System.out.println("<h1>"+empSalary1+"</h1>");
	  System.out.println("<h1>"+empDOB1+"</h1>");
	  System.out.println("<h1>"+empGender1+"</h1>");
	  System.out.println("<h1>"+empAddress1+"</h1>");
	  System.out.println("<h1>"+empCity1+"</h1>");
	  System.out.println("<h1>"+empState1+"</h1>");
	  System.out.println("<h1>"+empPin1+"</h1>");
	  System.out.println("<h1>"+empJoinDate1+"</h1>");
	  System.out.println("<h1>"+empQualification1+"</h1>");
	  
	  PrintWriter out = response.getWriter();

	 
	  out.println(id11);
	  out.println(name1 );
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
	 
	  
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch215?useSSL=false","root","shru3022");
		PreparedStatement ps= c.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setInt(1,id11);
		ps.setString(2,name1);
		ps.setString(3,email1);
		ps.setLong(4,empPhone1);
		ps.setString(5,empDept1);
		ps.setString(6,empPosition1);
		ps.setFloat(7,empSalary1);
		ps.setString(8,empDOB1);
		ps.setString(9,empGender1);
		ps.setString(10,empAddress1);
		ps.setString(11,empCity1);
		ps.setString(12,empState1);
		ps.setInt(13,empPin1);
		ps.setString(14,empJoinDate1);
		ps.setString(15,empQualification1);
		
		ps.executeUpdate();
		response.setContentType("text/html");
		
		System.out.println("Data is Inserted.....");
		out.println("<h1>Data is Inserted..</h1>");
		
		
		
		
		
		
		
	} catch (Exception e) {
		
	}
	  
	  
}
	
	
	
}