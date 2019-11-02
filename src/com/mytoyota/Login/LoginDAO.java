package com.mytoyota.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	public static int isUserValid(String name,String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toyota", "root", "root");
			PreparedStatement pst = con.prepareStatement("select id from toyota.userregister where email=? and password=?");
			pst.setString(1,name);
			pst.setString(2,password);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				return rs.getInt("id");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
		return 0;
	}
}
