package com.nisum.entity;

import javax.persistence.*;

@Entity
@Table(name="PRODUCT")
public class Product {
	 @Id @Column(name="ID") @GeneratedValue
	private int id;
	@Column(name="PID")
	private String pId;
	@Column(name="NAME")
	private String name;
	@Column(name="PRICE")
	private String price;
	@Column(name="DESCRIP")
	private String descrip;
	@Column(name="IMG")
	private String img;
	@Column(name="IMG2")
	private String img2;
	@Column(name="IMG3")
	private String img3;
	@Column(name="IMG4")
	private String img4;
	@Column(name="IMG5")
	private String img5;
	@Column(name="QUANTITY")
	private String quantity;
	@Column(name="CATAGORY")
	private String catagory;
	@Column(name="SUBCATAGORY")
	private String subCatagory;
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public String getSubCatagory() {
		return subCatagory;
	}
	public void setSubCatagory(String subcatagory) {
		this.subCatagory = subcatagory;
	}
	public String getImg5() {
		return img5;
	}
	public void setImg5(String img5) {
		this.img5 = img5;
	}
	public String getImg2() {
		return img2;
	}
	public void setImg2(String img2) {
		this.img2 = img2;
	}
	public String getImg3() {
		return img3;
	}
	public void setImg3(String img3) {
		this.img3 = img3;
	}
	public String getImg4() {
		return img4;
	}
	public void setImg4(String img4) {
		this.img4 = img4;
	}
	
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
