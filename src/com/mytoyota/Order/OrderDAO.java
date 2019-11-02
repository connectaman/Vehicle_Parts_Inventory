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
			PreparedStatement res = con.prepareStatement("update toyota.stock set qty=qty-? where pid=?");
			res.setInt(1,data.getQty());
			res.setString(2,data.getPid());
			pst.setInt(1,data.getCid());
			pst.setInt(2,data.getQty());
			pst.setString(3,data.getPid());
			pst.setString(4,data.getTimeStamp());
			result = pst.executeUpdate();
			int salesUpdate = res.executeUpdate();
			if(result>0){
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
	}
}
