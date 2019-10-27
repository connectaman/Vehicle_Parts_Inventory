package com.mytoyota.Stock;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteStock")
public class DeleteStock extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid = request.getParameter("id");
		boolean result = StockDAO.deleteStock(pid);
		if(result){
			response.sendRedirect("GetSales");
		}
		else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("GetSales");
			request.setAttribute("status", "Error Deleting");
			dispatcher.forward(request, response);
		}
	}


}
