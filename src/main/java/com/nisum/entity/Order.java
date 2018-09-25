package com.nisum.entity;
public class Order {
	private int orderId;
	private String userName; // Similar to userId in CartItems and Sessions
	
	private String amount;
	private String date;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	//	private Set<CartItem> cartItems;
	//private int numberOfItems;
}
