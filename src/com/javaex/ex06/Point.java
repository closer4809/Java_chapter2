package com.javaex.ex06;

public class Point {

		//�ʵ�
	
		
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
		
		
		
		
		
		
		
		
		//�ټ�
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
			System.out.println("��[x="+x+", y="+y+"]�� �׷Ƚ��ϴ�.");
		}
			
			
		

	
		
	

}
