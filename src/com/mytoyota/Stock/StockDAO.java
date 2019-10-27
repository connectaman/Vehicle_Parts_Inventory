package com.mytoyota.Stock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mytoyota.Order.SalesModel;


public class StockDAO {
	public static boolean AddStock(StockModel data){
		int result = 0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toyota","root","root");
			PreparedStatement pst = con.prepareStatement("insert into toyota.stock(pid,pname,price,qty,sid) values(?,?,?,?,?)");
			pst.setString(1,data.getPid());
			pst.setString(2,data.getPnname());
			pst.setInt(3,data.getPrice());
			pst.setInt(4,data.getQuant());
			pst.setInt(5,data.getSid());
			result = pst.executeUpdate();
			if(result>0){
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	public static List<StockModel> getAllStockData(){
		List<StockModel> data = new ArrayList<>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toyota","root","root");
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("SELECT * FROM toyota.stock;");
			while(rs.next()){
				StockModel stock = new StockModel();
				stock.setPid(rs.getString("pid"));
				stock.setPnname(rs.getString("pname"));
				stock.setPrice(rs.getInt("price"));
				stock.setQuant(rs.getInt("qty"));
				stock.setSid(rs.getInt("sid"));
				data.add(stock);	
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return data;
	}
	public static boolean deleteStock(String stock){
		int result = 0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toyota","root","root");
			PreparedStatement pst = con.prepareStatement("delete from toyota.stock where pid=?");
			pst.setString(1,stock);
			result = pst.executeUpdate();
			if(result > 0){
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	public static boolean updateStock(StockModel stock){
		int result = 0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toyota","root","root");
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	public static List<StockModel> getStockData(String pid){
		List<StockModel> data = new ArrayList<>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toyota","root","root");
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("SELECT * FROM toyota.stock where pid='"+pid+"'");
			while(rs.next()){
				StockModel stock = new StockModel();
				stock.setPid(rs.getString("pid"));
				stock.setPnname(rs.getString("pname"));
				stock.setPrice(rs.getInt("price"));
				stock.setQuant(rs.getInt("qty"));
				stock.setSid(rs.getInt("sid"));
				data.add(stock);	
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return data;
	}
	public static boolean UpdateStock(StockModel data){
		int result = 0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toyota","root","root");
			PreparedStatement pst = con.prepareStatement("update toyota.stock set pname=?,price=?,qty=?,sid=? where pid=?");
			pst.setString(1,data.getPnname());
			pst.setInt(2,data.getPrice());
			pst.setInt(3,data.getQuant());
			pst.setInt(4,data.getSid());
			pst.setString(5,data.getPid());
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
