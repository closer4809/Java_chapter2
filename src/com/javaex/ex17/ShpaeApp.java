package com.javaex.ex17;

public class ShpaeApp {

	public static void main(String[] args) {
		
		Shape s01 = new Shape("Red", "black");
		s01.draw();

		
		
		Rectangle[] rArray = new Rectangle[3];
		
		Rectangle r01 = new Rectangle("Red", "black", 3, 3);
		Rectangle r02 = new Rectangle("주황", "black", 4, 4);
		Rectangle r03 = new Rectangle("초록", "black", 5, 6);
		
		
		
		//배열<--사각형
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//베열을 통해서 그리기
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
			
		//원관리
		
		Circle[] cArray = new Circle[3];	
			
		Circle c01 = new Circle("주황", "검정", 2);
		Circle c02 = new Circle("빨강", "검정", 3);
		Circle c03 = new Circle("파랑", "검정", 4);
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		
		//삼각형 관리 
		Triangle[] tArray = new Triangle[3];
		
		Triangle t01 = new Triangle("주황", "검정", 1, 2, 3);
		Triangle t02 = new Triangle("주황", "검정", 1, 2, 3);
		Triangle t03 = new Triangle("주황", "검정", 1, 2, 3);
		
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		for(int i = 0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
	}

}
