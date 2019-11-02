package com.mytoyota.Order;

public class CustomerOrderModel {
private int oid;
private int cid;
private int qty;
private String pid;
private String date;
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public String getPid() {
	return pid;
}
public void setPid(String pid) {
	this.pid = pid;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@Override
public String toString() {
	return "CustomerOrderModel [oid=" + oid + ", cid=" + cid + ", qty=" + qty
			+ ", pid=" + pid + ", date=" + date + "]";
}

}
