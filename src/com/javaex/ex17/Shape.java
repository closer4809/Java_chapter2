package com.javaex.ex17;

public class Shape {
	//�ʵ�
	protected String FillColor;
	protected String lineColor;
	
	//������
	public Shape() {
		System.out.println("shape()");
	}
	
	public Shape(String fillColor, String lineColor) {
		
		this.FillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("shape(2)");
	}
	
	//�޼ҵ� �ټ�
	public String getFillColor() {
		return FillColor;
	}
	public void setFillColor(String fillColor) {
		FillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	//�޼ҵ� �Ϲ� 
	@Override
	public String toString() {
		return "Shape [FillColor=" + FillColor + "]";
	}
	
	public void draw() {
		System.out.println("[���: "+FillColor+", ����: "+lineColor+"] ������ �׷Ƚ��ϴ�." );
	}
	
}
