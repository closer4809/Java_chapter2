package com.javaex.ex09;

public class Goods {

	private String name;
	private int price;
	private static int count;
	
	public Goods() {
		count = count + 1;
	} 
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		count = count + 1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		if(price>0) {
			this.price = price;
		}else {
			this.price = 0;
		} 
		
	}
	
	public void showinfo() {
		System.out.println(name+" "+price);
		System.out.println(count);
		System.out.println("======================");
	}


}

