package com.nisum.dto;

public class Product {

	private String PId;
	private String PName;
	private String Price;
	private String Descrip;
	private String Img;
	private int Id;
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		Id = Id;
	}
	
	public String getPId() {
		return PId;
	}
	public void setPId(String pId) {
		PId = pId;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getDescrip() {
		return Descrip;
	}
	public void setDescrip(String descrip) {
		Descrip = descrip;
	}
	public String getImg() {
		return Img;
	}
	public void setImg(String img) {
		Img = img;
	}
}
