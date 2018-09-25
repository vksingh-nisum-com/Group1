package com.nisum.entity;

import javax.persistence.*;

@Entity
@Table(name="CARTITEM")
public class CartItem {
@Id @Column(name="ID") @GeneratedValue
private int id;
@Column(name="USERNAME")
private String username;
@Column(name="PID")
private String PID;
@Column(name="ITEMIMAGE")
private String itemImage;
@Column(name="ITEMNAME")
private String itemName;
@Column(name="ITEMQUANTITY")
private String itemQuantity;
@Column(name="ITEMPRICE")
private String itemPrice;
@Column(name="ITEMSIZE")
private String itemSize;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPID() {
	return PID;
}
public void setPID(String pID) {
	PID = pID;
}
public String getItemImage() {
	return itemImage;
}
public String getItemSize() {
	return itemSize;
}
public void setItemSize(String itemSize) {
	this.itemSize = itemSize;
}
public String getItemPrice() {
	return itemPrice;
}
public void setItemPrice(String itemPrice) {
	this.itemPrice = itemPrice;
}

public void setItemImage(String itemImage) {
	this.itemImage = itemImage;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public String getItemQuantity() {
	return itemQuantity;
}
public void setItemQuantity(String itemQuantity) {
	this.itemQuantity = itemQuantity;
}
}
