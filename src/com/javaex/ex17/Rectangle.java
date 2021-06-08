package com.javaex.ex17;

public class Rectangle extends Shape {

	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
		System.out.println("rect(0)");
	}
	
	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		System.out.println("rect(4)");
	}

	//메소드 겟셋
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	//메소드 일반

	public void draw() {
		System.out.println("[면색: "+FillColor+", 선색: "+lineColor+", 가로: "+width+", 세로: "+height+"]"+ "도형을 그렸습니다." );

		
	
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", FillColor=" + FillColor + ", lineColor="
				+ lineColor + "]";
	}


}


