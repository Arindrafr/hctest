package com.hctest.model;

public class OrderModel {

	private String orderName;
	private int orderNumber;
	
	public OrderModel() {
		
		this.orderName = "";
	
	}
	
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Override
	public String toString() {
		return "OrderModel [orderName=" + orderName + ", orderNumber=" + orderNumber + "]";
	}
	
	
}
