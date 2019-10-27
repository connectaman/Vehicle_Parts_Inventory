package com.mytoyota.supplier;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddSupplier")
public class AddSupplier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("suppliername");
		String phone = request.getParameter("supplierphone");
		String address = request.getParameter("supplieraddress");
		SupplierModel data = new SupplierModel();
		data.setName(name);
		data.setPhone(phone);
		data.setAddress(address);
		boolean result = SupplierDAO.AddingSupplier(data);
		if(result){
			response.sendRedirect("supplier.jsp");
		}
	}

}
