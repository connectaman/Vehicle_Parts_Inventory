package com.mytoyota.analytics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AnalyticsDAO {
public static AnalyticsModel getAnalytics(){
	AnalyticsModel data = new AnalyticsModel();
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toyota","root","root");
		Statement s1 = con.createStatement();
		Statement s2 = con.createStatement();
		Statement s3 = con.createStatement();
		Statement s4 = con.createStatement();
		ResultSet r1 = s1.executeQuery("call toyota.count_customer();");
		ResultSet r2 = s2.executeQuery("call toyota.count_sales();");
		ResultSet r3 = s3.executeQuery("call toyota.count_stock();");
		ResultSet r4 = s4.executeQuery("call toyota.count_supplier();");
		while(r1.next() && r2.next() && r3.next() && r4.next()){
			data.setCustomer(r1.getInt("COUNT(*)"));
			data.setSales(r2.getInt(1));
			data.setStock(r3.getInt(1));
			data.setSupplier(r4.getInt(1));
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	return data;
}
}
