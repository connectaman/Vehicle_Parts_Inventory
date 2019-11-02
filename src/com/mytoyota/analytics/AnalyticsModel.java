package com.mytoyota.analytics;

public class AnalyticsModel {
private int customer;
private int sales;
private int stock;
private int supplier;
public int getCustomer() {
	return customer;
}
public void setCustomer(int customer) {
	this.customer = customer;
}
public int getSales() {
	return sales;
}
public void setSales(int sales) {
	this.sales = sales;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public int getSupplier() {
	return supplier;
}
public void setSupplier(int supplier) {
	this.supplier = supplier;
}
@Override
public String toString() {
	return "AnalyticsModel [customer=" + customer + ", sales=" + sales
			+ ", stock=" + stock + ", supplier=" + supplier + "]";
}

}
