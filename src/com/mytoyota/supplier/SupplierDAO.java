package com.mytoyota.supplier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mytoyota.Register.CustomerModel;


public class SupplierDAO {
	public static boolean AddingSupplier(SupplierModel data){
		int result = 0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toyota","root","root");
			PreparedStatement pst = con.prepareStatement("insert into toyota.supplier(supname,supphone,supaddress) values(?,?,?)");
			pst.setString(1,data.getName());
			pst.setString(2,data.getPhone());
			pst.setString(3,data.getAddress());
			result = pst.executeUpdate();
			if(result>0){
				return true;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
	}
	public static List<SupplierModel> getAllSupplies(){
		List<SupplierModel> data = new ArrayList<>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toyota","root","root");
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("SELECT * FROM toyota.supplier;");
			while(rs.next()){
				SupplierModel user = new SupplierModel();
				user.setId(rs.getInt("supid"));
				user.setName(rs.getString("supname"));
				user.setPhone(rs.getString("supphone"));
				user.setAddress(rs.getString("supaddress"));
				data.add(user);	
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return data;
	}
	
}
