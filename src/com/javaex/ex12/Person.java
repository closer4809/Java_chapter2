package com.javaex.ex12;

public class Person {
	//�ʵ�
	String name;
	int age;
	
	

	//������
	public void person() {
		
	}
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	//�޼ҵ� �ټ�
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//����ŸȮ�ο�
	public String toString() {
		return "Person[name="+ name+", age = "+age+"]";
	}
	
	
	//�޼ҵ� �Ϲ�
	public void showInfo() {
		System.out.println("�̸�:"+name+"����:"+age);
	}
	
}
