package com.javaex.ex17;

public class Shape {
	//필드
	protected String FillColor;
	protected String lineColor;
	
	//생성자
	public Shape() {
		System.out.println("shape()");
	}
	
	public Shape(String fillColor, String lineColor) {
		
		this.FillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("shape(2)");
	}
	
	//메소드 겟셋
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
	
	//메소드 일반 
	@Override
	public String toString() {
		return "Shape [FillColor=" + FillColor + "]";
	}
	
	public void draw() {
		System.out.println("[면색: "+FillColor+", 선색: "+lineColor+"] 도형을 그렸습니다." );
	}
	
}
