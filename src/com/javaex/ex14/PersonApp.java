package com.javaex.ex14;


public class PersonApp {

	public static void main(String[] args) {
		
		//����Ʈ ������ ���
		Student s01 = new Student();
		s01.setName("���켺");
		s01.setAge(50);
		s01.setSchoolName("���ǰ���б�");
		
		

	
		//Student ������(3) ���
		//������ ����(�θ���� ����)
		/*
		Student s02 = new Student("��ȿ��", 50, "���ǰ�");
		s02.showInfo();
		*/
		
		//�θ��� ����Ʈ ������ ��� ->Ȯ��
		Student s03 = new Student();
		
		Student s04 = new Student("��ȿ��", 45, "���ְ���б�");
	
		Person p = new Person();
		
		p.name = "�ٺ���";
	}

}
