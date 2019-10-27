package com.mytoyota.Order;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PlaceOrder")
public class PlaceOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid = Integer.parseInt(request.getParameter("customerid"));
		int qty = Integer.parseInt(request.getParameter("partqty"));
		String pid = request.getParameter("partid");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        OrderModel data = new OrderModel();
        data.setCid(cid);
        data.setQty(qty);
        data.setPid(pid);
        data.setTimeStamp(timestamp.toString());
        boolean result = OrderDAO.placeOrder(data);
        if(result){
        	response.sendRedirect("order.jsp");
        }
	}

}
