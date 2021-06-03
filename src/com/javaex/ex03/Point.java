package com.javaex.ex03;

public class Point {
	int pointx;
	int pointy;


	public void setpointx(int x){
		pointx = x;
	}

	public void setpointy(int y){
		pointy = y;
	}


	public int getpointx(){
		return pointx;
	}

	public int getpointy(){
		return pointy;
	}


	public void draw() {
		System.out.println("점[x="+pointx+", y="+pointy+"]을 그렸습니다.");
	}
	
	
}

