package com.example.Stock.model;

import java.util.Date;

public class Stock {
	
	private int id;
	private String name;
	private int price;
	private int volume;
	private Date date;
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", name=" + name + ", price=" + price + ", volume=" + volume
				+ ", date=" + date + "]";
	}
	
	

}
