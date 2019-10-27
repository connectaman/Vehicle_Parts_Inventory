package com.mytoyota.Admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("uname");
		String password=request.getParameter("psw") ;
		if(username.equals("admin")&& password.equals("admin")){
			response.sendRedirect("dashboard.jsp");
		}
		else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("admin.jsp");
			request.setAttribute("status", "invalid username or password");
			dispatcher.forward(request, response);
		}
		System.out.println(username + " " + password);
	}

}
