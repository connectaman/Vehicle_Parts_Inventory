package com.mytoyota.Stock;

public class StockModel {
private String pid;
private String pnname;
private int price;
private int quant;
private int sid;
public String getPid() {
	return pid;
}
public void setPid(String pid) {
	this.pid = pid;
}
public String getPnname() {
	return pnname;
}
public void setPnname(String pnname) {
	this.pnname = pnname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuant() {
	return quant;
}
public void setQuant(int quant) {
	this.quant = quant;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
@Override
public String toString() {
	return "StockModel [pid=" + pid + ", pnname=" + pnname + ", price=" + price
			+ ", quant=" + quant + ", sid=" + sid + "]";
}

}
