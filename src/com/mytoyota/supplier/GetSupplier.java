package com.mytoyota.supplier;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mytoyota.Register.CustomerModel;
import com.mytoyota.Register.UserRegisterDAO;

@WebServlet("/GetSupplier")
public class GetSupplier extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<SupplierModel> data = new ArrayList<>();
		data = SupplierDAO.getAllSupplies();
		request.setAttribute("data",data);
		RequestDispatcher dispatcher = request.getRequestDispatcher("ViewSupplier.jsp");
		dispatcher.forward(request, response);
	}

	

}
