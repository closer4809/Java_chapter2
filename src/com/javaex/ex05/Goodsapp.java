package com.javaex.ex05;

public class Goodsapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Goods camera = new Goods(); // ������ ȣ�� --> ����Ʈ ������
		
		camera.SetName("����");
		camera.setPrice(400000);
		
		camera.showInfo();
		//�����ڴ� 1���� ����� �� �ִ�*****> ���� �ǹ� �� üũ�غ���
		
		
		Goods computer = new Goods("�׷�", 1000000);
		computer.showInfo();
		*/
		
		Goods camera = new Goods();
		
		camera.setName("����");
		camera.setPrice(400000);
		
		camera.showInfo();
		/*
		camera.setName("����2");
		camera.showInfo();
		*/
		
		
		Goods camera2 = new Goods("����2", 500000);
		
		camera2.showInfo();
		
		camera = new Goods("����3", 500);
	
		camera.showInfo();
		
	}

}
