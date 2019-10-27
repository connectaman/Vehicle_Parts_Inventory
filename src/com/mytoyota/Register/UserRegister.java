package com.mytoyota.Register;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mytoyota.Utilitiles.PasswordHash;

@WebServlet("/UserRegister")
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pass = request.getParameter("password");
		String cpass = request.getParameter("cpassword");
		if(pass.equals(cpass)){
			UserRegisterModel user = new UserRegisterModel();
			user.setName(request.getParameter("name"));
			user.setEmail(request.getParameter("username"));
			user.setPassword(PasswordHash.getMd5(request.getParameter("password")));
			user.setPhone(request.getParameter("phonenumber"));
			user.setCity(request.getParameter("city"));
			boolean result = UserRegisterDAO.RegisterUser(user);
			if(result){
				response.sendRedirect("UserRegister.jsp");
			}
		}
		else{
			System.out.println("p and cp not same");
		}
		
		
		
	}

}
