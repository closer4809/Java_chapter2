package com.javaex.ex13;

public class Personapp {

	public static void main(String[] args) {
		
		Student s01 = new Student();
		s01.setName("���켺");
		s01.setAge(50);
		s01.setSchoolName("���ǰ���б�");
		/*
		System.out.println(s01.getAge());
		System.out.println(s01.getName());
		System.out.println(s01.getSchoolName());
		*/
		
		s01.showInfo();
	
		Person p01 = new Person();
		p01.setName("��ȿ��");
		p01.setAge(45);
		//�θ�� �ڽ��� ���ӵ��� ��������
	
		p01.showInfo();
	
	}
	
	

}
