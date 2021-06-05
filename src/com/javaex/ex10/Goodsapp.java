package com.javaex.ex10;

public class Goodsapp {

	public static void main(String[] args) {
		
		Goods[] goodsArray = new Goods[3];
		System.out.println(goodsArray.length);
		
		Goods computer = new Goods("그램", 1000000);
		Goods camera = new Goods("니콘", 400000);
		/*
		computer.showinfo();
		camera.showinfo();
		*/
		int count = 0;
		goodsArray[0] = computer;
		goodsArray[1] = camera;
		
		for(int i = 0; i<goodsArray.length; i++) { //배열에 주소가 없지 않으면 -->  주소가 있으면
			if(goodsArray[i] != null) {
				count = count + 1;
				goodsArray[i].showinfo();
			}
			
		}
	System.out.println(count);
	}

}
