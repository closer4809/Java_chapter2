package com.javaex.ex17;

public class ShpaeApp {

	public static void main(String[] args) {
		
		Shape s01 = new Shape("Red", "black");
		s01.draw();

		
		
		Rectangle[] rArray = new Rectangle[3];
		
		Rectangle r01 = new Rectangle("Red", "black", 3, 3);
		Rectangle r02 = new Rectangle("��Ȳ", "black", 4, 4);
		Rectangle r03 = new Rectangle("�ʷ�", "black", 5, 6);
		
		
		
		//�迭<--�簢��
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//������ ���ؼ� �׸���
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
			
		//������
		
		Circle[] cArray = new Circle[3];	
			
		Circle c01 = new Circle("��Ȳ", "����", 2);
		Circle c02 = new Circle("����", "����", 3);
		Circle c03 = new Circle("�Ķ�", "����", 4);
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		
		//�ﰢ�� ���� 
		Triangle[] tArray = new Triangle[3];
		
		Triangle t01 = new Triangle("��Ȳ", "����", 1, 2, 3);
		Triangle t02 = new Triangle("��Ȳ", "����", 1, 2, 3);
		Triangle t03 = new Triangle("��Ȳ", "����", 1, 2, 3);
		
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		for(int i = 0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
	}

}
