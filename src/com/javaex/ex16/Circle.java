package com.javaex.ex16;

public class Circle extends Reactangle {
	
	
	int radius;

	public Circle(String filecolor, String linecolor, int radius) {
		this.filecolor = filecolor;
		this.linecolor = linecolor;
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	
	
	
	public void draw() {
		System.out.println("[���: "+filecolor+", ����: "+linecolor+", ������: "+radius+ "] �� �簢���� �׷Ƚ��ϴ�.");
		
	}
}
