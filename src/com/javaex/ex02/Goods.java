package com.javaex.ex02;

public class Goods {
	
	//�ʵ� 
	private String name; //�����ĳ���
	private int price;

	//������
	public Goods() {
		
	}
	
	
	
	
	//�޼ҵ�-���ͼ���
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

	//�޼ҵ� (�Ϲ�)
	public void showInfo() {
		System.out.println("��ǰ�̸� : "+name);
		System.out.println(" ���� : "+price);
		System.out.println("-------------------");
	}
	
	
}
