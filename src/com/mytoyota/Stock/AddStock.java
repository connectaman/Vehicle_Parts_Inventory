package com.mytoyota.Stock;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddStock")
public class AddStock extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		boolean result = StockDAO.AddStock(data);
		if(result){
			response.sendRedirect("stock.jsp");
		}
	}

}
