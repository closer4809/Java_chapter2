package com.javaex.ex06;

public class Point {

		//필드
	
		
		private int x;
		private int y;

		public Point() {
			
		}
		
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public Point(int x) {
			this.x=x;
		}
		
		
		
		
		
		
		
		
		//겟셋
		public void setx(int x){
			this.x = x;
		}

		public void sety(int y){
			this.y = y;
		}


		public int getx(){
			return x;
		}

		public int gety(){
			return y;
		}


		public void draw() {
			System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
		}
			
			
		

	
		
	

}
