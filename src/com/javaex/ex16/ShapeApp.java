package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�簢�� ����
		Reactangle[] rArray = new Reactangle[3];
		
		Reactangle r01 = new Reactangle("����", "����", 5, 5);
		Reactangle r02 = new Reactangle("���", "����", 6, 6);
		Reactangle r03 = new Reactangle("�ʷ�", "����", 7, 7);
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//�迭�� �̿��� �׸���
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		//������
		//������ ����ؼ� �׸���
		/*
		r01.draw();
		r02.draw();
		r03.draw();
		*/
		
		Circle[] cArray = new Circle[3];
		
		Circle c01 = new Circle("����", "����", 4);
		Circle c02 = new Circle("����", "����", 4);
		Circle c03 = new Circle("����", "����", 4);
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		/*
		c01.draw();
		c02.draw();
		c03.draw();
		*/
	}

}
