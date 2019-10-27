package com.mytoyota.Order;

public class SalesModel {
private int oid;
private int cid;
private String cname;
private String cemail;
private String cphone;
private String pid;
private int quantity;
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
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCemail() {
	return cemail;
}
public void setCemail(String cemail) {
	this.cemail = cemail;
}
public String getCphone() {
	return cphone;
}
public void setCphone(String cphone) {
	this.cphone = cphone;
}
public String getPid() {
	return pid;
}
public void setPid(String pid) {
	this.pid = pid;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "SalesModel [oid=" + oid + ", cid=" + cid + ", cname=" + cname
			+ ", cemail=" + cemail + ", cphone=" + cphone + ", pid=" + pid
			+ ", quantity=" + quantity + "]";
}

}
