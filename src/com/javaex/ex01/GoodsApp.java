package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		
		camera.name = "����";
		camera.price = 400000;
		
	
		System.out.println(camera.name+","+camera.price);
	
		Goods computer = new Goods();
		
		computer.name = "�׷�";
		computer.price = 10000000;
		
		System.out.println(computer.name+","+computer.price);
	
		Goods cup = new Goods();
		
		cup.name = "�ӱ���";
		cup.price = 2000;
		
		System.out.println(cup.name+","+cup.price);
	
	
	}

}
