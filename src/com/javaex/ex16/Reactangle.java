package com.javaex.ex16;

public class Reactangle {
	//필드
	protected String filecolor;
	protected String linecolor;
	private int width;		
	private int heinght;

	//생성자
	public Reactangle() {
		
	}
	
	
	public Reactangle(String filecolor, String linecolor, int width, int heinght) {
		super();
		this.filecolor = filecolor;
		this.linecolor = linecolor;
		this.width = width;
		this.heinght = heinght;
	}
	
	///메소드 겟셋
	public String getFillcolor() {
		return filecolor;
	}
	public void setFillcolor(String fillcolor) {
		this.filecolor = fillcolor;
	}
	public String getLinecolor() {
		return linecolor;
	}
	public void setLinecolor(String linecolor) {
		this.linecolor = linecolor;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeinght() {
		return heinght;
	}
	public void setHeinght(int heinght) {
		this.heinght = heinght;
	}

	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Reactangle [filecolor=" + filecolor + ", linecolor=" + linecolor + ", width=" + width + ", heinght="
				+ heinght + "]";
	}

	public void draw() {
		System.out.println("[면색: "+filecolor+", 선색: "+linecolor+", 가로: "+width+", 세로: "+heinght+"] 인 사각형을 그렸습니다.");
	}
	






}
	