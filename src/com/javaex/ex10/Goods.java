package com.javaex.ex10;

public class Goods {
	//�ʵ�
	private String name;
	private int price;
	
	//������
	public Goods() {
		//������
	}
	
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	//�ټ�
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
	// �Ϲ�
	public void showinfo() {
		System.out.println(name+" "+price);
		
		System.out.println("======================");
	}



}
