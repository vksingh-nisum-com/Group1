package com.nisum.dto;

public class CartItem {
private String itemImage;
private String itemName;
private String itemQuantity;
private String itemsPrice;
private String itemSize;
public String getItemImage() {
	return itemImage;
}
public String getItemSize() {
	return itemSize;
}
public void setItemSize(String itemSize) {
	this.itemSize = itemSize;
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
public String getItemsPrice() {
	return itemsPrice;
}
public void setItemsPrice(String itemsPrice) {
	this.itemsPrice = itemsPrice;
}


}
