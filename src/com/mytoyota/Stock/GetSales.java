package com.mytoyota.Stock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mytoyota.Order.SalesDAO;
import com.mytoyota.Order.SalesModel;

@WebServlet("/GetSales")
public class GetSales extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<StockModel> data = new ArrayList<>();
		data = StockDAO.getAllStockData();
		request.setAttribute("data",data);
		RequestDispatcher dispatcher = request.getRequestDispatcher("ViewStock.jsp");
		dispatcher.forward(request, response);
	}



}
