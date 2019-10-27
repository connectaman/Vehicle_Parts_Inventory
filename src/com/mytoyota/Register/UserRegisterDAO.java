package com.mytoyota.Register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mytoyota.Stock.StockModel;

public class UserRegisterDAO {
public static boolean RegisterUser(UserRegisterModel data){
	int result = 0;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toyota","root","root");
		PreparedStatement pst = con.prepareStatement("insert into toyota.userregister(name,email,password,phone,city) values(?,?,?,?,?)");
		pst.setString(1,data.getName());
		pst.setString(2,data.getEmail());
		pst.setString(3,data.getPassword());
		pst.setString(4,data.getPhone());
		pst.setString(5,data.getCity());
		System.out.println(pst);
		result = pst.executeUpdate();
		if(result>0){
			return true;
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	return false;
}
	
public static List<CustomerModel> getAllCustomer(){
	List<CustomerModel> data = new ArrayList<>();
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toyota","root","root");
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("SELECT * FROM toyota.userregister");
		while(rs.next()){
			CustomerModel user = new CustomerModel();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setEmail(rs.getString("email"));
			user.setPassword(rs.getString("password"));
			user.setPhone(rs.getString("phone"));
			user.setCity(rs.getString("city"));
			data.add(user);	
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	return data;
}
	
	
}
