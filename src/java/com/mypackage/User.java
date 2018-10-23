/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypackage;

/**
 *
 * @author hp
 */
public class User {
    
	String name,address;
	long phone_number;
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
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public Order getCurrent_order() {
		return current_order;
	}
	public void setCurrent_order(Order current_order) {
		this.current_order = current_order;
	}
	Order current_order;
}
