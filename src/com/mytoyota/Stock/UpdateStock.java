package com.mytoyota.Stock;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateStock")
public class UpdateStock extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid = request.getParameter("id");
		List<StockModel> data = StockDAO.getStockData(pid);
		request.setAttribute("data",data);
		RequestDispatcher dispatcher = request.getRequestDispatcher("UpdateStock.jsp");
		dispatcher.forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("partid");
		String name=request.getParameter("partname");
		int price=Integer.parseInt(request.getParameter("partprice"));
		int quan=Integer.parseInt(request.getParameter("stockqty"));
		int sid=Integer.parseInt(request.getParameter("supplierid"));
		StockModel data = new StockModel();
		data.setPid(id);
		data.setPnname(name);
		data.setPrice(price);
		data.setQuant(quan);
		data.setSid(sid);
		boolean result = StockDAO.UpdateStock(data);
		if(result){
			response.sendRedirect("GetSales");
		}
	}

}
