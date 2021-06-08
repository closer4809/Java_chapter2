package com.javaex.ex15;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p = new Point(4,4);
		p.showInfo(); //포인트
		
		Pointcolor cp1 = new Pointcolor(0, 0,"red");
		Pointcolor cp2 = new Pointcolor(10, 10, "blue");
		cp1.showInfo(); //포인트컬러
		
		
		cp2.showInfo();	//포인트컬러
		
	
	}

}
