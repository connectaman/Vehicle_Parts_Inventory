package com.mytoyota.Order;

public class OrderModel {
private int oid;
private int cid;
private int qty;
private String pid;
private String timeStamp;
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
public String getTimeStamp() {
	return timeStamp;
}
public void setTimeStamp(String timeStamp) {
	this.timeStamp = timeStamp;
}
@Override
public String toString() {
	return "OrderModel [oid=" + oid + ", cid=" + cid + ", qty=" + qty
			+ ", pid=" + pid + ", timeStamp=" + timeStamp + "]";
}

}
