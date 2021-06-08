package com.javaex.ex17;

public class Circle extends Shape {

	int radius;

	public Circle(String FillColor, String lineColor, int radius) {
		super(FillColor, lineColor);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", FillColor=" + FillColor + ", lineColor=" + lineColor + "]";
	}
	
	
	public void draw() {                                                                                           
		System.out.println("[���: "+FillColor+", ����: "+lineColor+", ������: "+radius+"]"+ "������ �׷Ƚ��ϴ�." );
	}

}
