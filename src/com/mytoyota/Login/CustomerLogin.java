package com.mytoyota.Login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mytoyota.Order.CustomerOrderModel;
import com.mytoyota.Order.SalesDAO;

@WebServlet("/CustomerLogin")
public class CustomerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("email");
		String password = request.getParameter("password");
		int cid = LoginDAO.isUserValid(username, password);
		List<CustomerOrderModel> order = new ArrayList<>();
		order = SalesDAO.getSalesById(cid);
		request.setAttribute("data",order);
		RequestDispatcher dispatcher = request.getRequestDispatcher("CustomerOrder.jsp");
		dispatcher.forward(request, response);
	}

}
