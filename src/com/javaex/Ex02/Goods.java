package com.javaex.Ex02;

public class Goods {
	
	//필드 
	private String name; //도장파놓음
	private int price;

	//생성자
	
	//메소드-겟터세터
	
	
	public void setName(String name){
		
		this.name = name;
		
	}
	
	public void setpric(int price){
		
		this.price = price;
		
	}
	
	
	public String getName(){
		//
		return name;
	}

	public int getPrice() {
		return price;
	}

	//메소드 (일반)
	public void showInfo() {
		System.out.println("상품이름 : "+name);
		System.out.println(" 가격 : "+price);
		System.out.println("-------------------");
	}
	
	
}
