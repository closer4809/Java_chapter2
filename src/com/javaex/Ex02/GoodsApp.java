package com.javaex.Ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		 Goods camera = new Goods();
		 Goods computer = new Goods();
		 Goods cup = new Goods();
		
		// �޼ҵ���~~~~~~~~~~~~~~~~~~~~~~~~
		 
		 //camera.name= "����";
		 camera.setName("����");
		 
		 //camera.price= 400000;
		 camera.setpric(400000);
		 
		 
		 
		 //computer.name = "�׷�";
		 computer.setName("�׷�");
		 
		 //computer.price = 1000000;
		 computer.setpric(1000000);
		 
		 
		 //cup.name = "�ӱ���";
		 cup.setName("�ӱ���");
		 
		 //cup.price = 2000;
		 cup.setpric(2000);
		 
		 // �ʵ���~~~~~~~~~~~~~~~~~~~~~~~~ 
		 
		 //System.out.println("��ǰ�� : "+camera.getName()+", ���� : "+camera.getPrice());
		 camera.showInfo();
		 
		 //System.out.println("��ǰ�� : "+computer.getName()+", ���� : "+computer.getPrice());
		 computer.showInfo();
		 
		 //System.out.println("��ǰ�� : "+cup.getName()+", ���� : "+cup.getPrice());
		 cup.showInfo();

	
	
	}

}
