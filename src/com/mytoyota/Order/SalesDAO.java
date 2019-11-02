package com.mytoyota.Order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SalesDAO {
public static List<SalesModel> getAllSales(){
	List<SalesModel> data = new ArrayList<>();
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toyota","root","root");
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("SELECT order.oid,order.cid,userregister.name,userregister.email,userregister.phone,order.pid,order.qty FROM toyota.order,toyota.userregister where userregister.id=order.cid");
		while(rs.next()){
			SalesModel sale = new SalesModel();
			sale.setOid(rs.getInt("oid"));
			sale.setCid(rs.getInt("cid"));
			sale.setCname(rs.getString("name"));
			sale.setCemail(rs.getString("email"));
			sale.setCphone(rs.getString("phone"));
			sale.setPid(rs.getString("pid"));
			sale.setQuantity(rs.getInt("qty"));
			data.add(sale);
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	return data;
}

public static List<CustomerOrderModel> getSalesById(int id){
	List<CustomerOrderModel> order = new ArrayList<>();
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toyota","root","root");
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("SELECT * FROM toyota.order where cid="+id);
		while(rs.next()){
			CustomerOrderModel data = new CustomerOrderModel();
			data.setCid(rs.getInt("cid"));
			data.setOid(rs.getInt("oid"));
			data.setPid(rs.getString("pid"));
			data.setQty(rs.getInt("qty"));
			data.setDate(rs.getString("date"));
			order.add(data);
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	
	return order;
}
}
