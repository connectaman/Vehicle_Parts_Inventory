package com.mytoyota.Order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class OrderDAO {
	public static boolean placeOrder(OrderModel data){
		int result = 0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toyota","root","root");
			PreparedStatement pst = con.prepareStatement("insert into toyota.order(cid,qty,pid,date) values(?,?,?,?)");
			pst.setInt(1,data.getCid());
			pst.setInt(2,data.getQty());
			pst.setString(3,data.getPid());
			pst.setString(4,data.getTimeStamp());
			result = pst.executeUpdate();
			if(result>0){
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
	}
}
