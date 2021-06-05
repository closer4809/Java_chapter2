package com.javaex.ex10;

public class Goods {
	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() {
		//디포르
	}
	
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	//겟셋
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
	}
	// 일반
	public void showinfo() {
		System.out.println(name+" "+price);
		
		System.out.println("======================");
	}



}
