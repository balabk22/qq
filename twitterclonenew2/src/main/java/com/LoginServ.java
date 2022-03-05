package com;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CheckUser check=new CheckUser();
		PersonIn person=new PersonImpl();
		
		
		String option=request.getParameter("option");
		
		if(option.equals("login")) {
		
		
		String user=request.getParameter("userName");
		String password=request.getParameter("password");
		request.setAttribute("userName", user);
		if(check.checkUser(user, password)==true) {
			RequestDispatcher rs=request.getRequestDispatcher("./Menu.jsp");
			rs.forward(request, response);
		}
		else {
			RequestDispatcher rs=request.getRequestDispatcher("./LoginPage.jsp");
			rs.forward(request, response);
		}
		}
		
		
		//check.checkUser(user, password);
		
		//String option=request.getParameter("option");
		
		
		if(option.equals("profile")) {
			String user=request.getParameter("user");
			
			Person per= person.userDetails(user);
			request.setAttribute("per", per);

			RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
			rd.forward(request, response);
		}
		if(option.equals("listAll")) {
			String user=request.getParameter("user");
			List<Tweet> per = person.findAll();
			request.setAttribute("per", per);

			RequestDispatcher rd = request.getRequestDispatcher("tweets.jsp");
			rd.forward(request, response);
		}
		if(option.equals("edit")) {
			
		}
		
		
		
	}

}
