package com.javaex.ex15;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p = new Point(4,4);
		p.showInfo(); //����Ʈ
		
		Pointcolor cp1 = new Pointcolor(0, 0,"red");
		Pointcolor cp2 = new Pointcolor(10, 10, "blue");
		cp1.showInfo(); //����Ʈ�÷�
		
		
		cp2.showInfo();	//����Ʈ�÷�
		
	
	}

}
