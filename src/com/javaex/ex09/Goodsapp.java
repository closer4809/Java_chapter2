package com.javaex.ex09;

public class Goodsapp {
	public static void main(String[] args) {
		
		
		Goods computer = new Goods("�׷�", 1000000);
		computer.showinfo();
		
		Goods camera = new Goods();
		camera.setName("����");
		camera.setPrice(400000);
		camera.showinfo();
		
		Goods cup = new Goods("�ӱ���", 2000);
		cup.showinfo();
	}
}