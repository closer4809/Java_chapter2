package com.javaex.ex12;

public class Student {
	//�ʵ� 
	private String name;
	private int age;
	private String schoolName;
	
	
	

	//������
	public Student() {
		
	}
	
	public Student(String name, int age, String schoolname) {
		this.name = name;
		this.age = age;
		this.schoolName = schoolname;
	}

	//�޼ҵ� - �ټ�
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
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	//�޼ҵ� - �Ϲ�

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", schoolName=" + schoolName + "]";
	}
	
	
	

}

