package com.javaex.ex17;

public class Rectangle extends Shape {

	//�ʵ�
	private int width;
	private int height;
	
	//������
	public Rectangle() {
		System.out.println("rect(0)");
	}
	
	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		System.out.println("rect(4)");
	}

	//�޼ҵ� �ټ�
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
	
	//�޼ҵ� �Ϲ�

	public void draw() {
		System.out.println("[���: "+FillColor+", ����: "+lineColor+", ����: "+width+", ����: "+height+"]"+ "������ �׷Ƚ��ϴ�." );

		
	
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", FillColor=" + FillColor + ", lineColor="
				+ lineColor + "]";
	}


}


