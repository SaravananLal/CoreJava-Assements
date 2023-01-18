package com.app.main;
/*
 * Account Class which is holding
 * customer details like number name,balance amnt
 * 
 */
public class Account {
	
	private String accnum;
	private String name;
	private String address;
	private int damnt;
	private int bamnt;
	public int getDamnt() {
		return damnt;
	}
	public void setDamnt(int damnt) {
		this.damnt = damnt;
	}
	public int getBamnt() {
		return bamnt;
	}
	public void setBamnt(int bamnt) {
		this.bamnt = bamnt;
	}
	public String getAccnum() {
		return accnum;
	}
	public void setAccnum(String accnum) {
		this.accnum = accnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


}
