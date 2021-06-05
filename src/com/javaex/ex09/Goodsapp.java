package com.javaex.ex09;

public class Goodsapp {
	public static void main(String[] args) {
		
		
		Goods computer = new Goods("그램", 1000000);
		computer.showinfo();
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showinfo();
		
		Goods cup = new Goods("머그컵", 2000);
		cup.showinfo();
	}
}