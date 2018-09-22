package com.nisum.dao;
import javax.persistence.*;
@Entity
@Table(name = "USER")
public class User {
	@Id @GeneratedValue
	@Column(name = "ID")
	private int id;
	@Column(name = "FULLNAME")
	private String fullName;
	@Column(name = "USERNAME")
	private String userName;
	@Column(name = "PASSWORD")
	private  String password;
	
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "PHONE")
	private String phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
