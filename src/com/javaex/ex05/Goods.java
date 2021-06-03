package com.javaex.ex05;

public class Goods {
	
	//필드
	private String name;
	private int price;

	//생성자
	public Goods() { //디폴트생성자 --> 다른 생성자를 만들면 없어진다
		//Goods 메모리 힙에 올리는거
	}
	
	public Goods(String name, int price) {
		// Goods 메모리 힙에 올리는거;
		this.name = name;
		this.price = price;
	}
	
	
	//메소드-게터세터
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}
	
	public int getprice() {
		return price;
	}

	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
		System.out.println("========================");
	}

}
