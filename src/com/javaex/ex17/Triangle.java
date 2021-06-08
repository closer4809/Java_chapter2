package com.javaex.ex17;

public class Triangle extends Shape {

	int line1;
	int line2;
	int line3;
	
	public Triangle(String FillColor, String lineColor, int line1, int line2, int line3) {
		this.FillColor = FillColor;
		this.lineColor = lineColor;
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
	}

	public int getLine1() {
		return line1;
	}

	public void setLine1(int line1) {
		this.line1 = line1;
	}

	public int getLine2() {
		return line2;
	}

	public void setLine2(int line2) {
		this.line2 = line2;
	}

	public int getLine3() {
		return line3;
	}

	public void setLine3(int line3) {
		this.line3 = line3;
	}
	
	public void draw() {                                                                                                  
		System.out.println("[면색: "+FillColor+", 선색: "+lineColor+", 첫번째 선: "+line1+", 두번째 선: "+line2+", 세번째 선: "+line3+"]"+ "도형을 그렸습니다." );       
	                                                                                                                      
		                                                                                                                  
	                                                                                                                      
	}                                                                                                                     

}
