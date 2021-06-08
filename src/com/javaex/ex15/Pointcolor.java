package com.javaex.ex15;

public class Pointcolor extends Point {

	String color;

	public Pointcolor(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void showInfo() {
		System.out.println(x+","+y+color);
	}

}
