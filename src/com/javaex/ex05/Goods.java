package com.javaex.ex05;

public class Goods {
	
	//�ʵ�
	private String name;
	private int price;

	//������
	public Goods() { //����Ʈ������ --> �ٸ� �����ڸ� ����� ��������
		//Goods �޸� ���� �ø��°�
	}
	
	public Goods(String name, int price) {
		// Goods �޸� ���� �ø��°�;
		this.name = name;
		this.price = price;
	}
	
	
	//�޼ҵ�-���ͼ���
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}
	
	public int getprice() {
		return price;
	}

	public void showInfo() {
		System.out.println("��ǰ�̸�: " + name);
		System.out.println("����: " + price);
		System.out.println("========================");
	}

}
