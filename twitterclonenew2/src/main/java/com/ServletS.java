package com;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletS")
public class ServletS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PersonIn person=new PersonImpl();
		
		
		//String option=request.getParameter("option");
		
		//if(option.equals("register")){
			
			
			Person per = new Person();
			per.setUser_id(request.getParameter("userName"));
			per.setPassword(request.getParameter("password"));
			per.setFullName(request.getParameter("fullName"));
			per.setEmail(request.getParameter("email"));
			
			per.setActive(true);
			

			person.register(per);

			
			RequestDispatcher rd = request.getRequestDispatcher("LoginPage.jsp");
			rd.forward(request, response);
			
		
		
	}

}
