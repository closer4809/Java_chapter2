package com.javaex.ex14;

public class  Student extends Person {

	//�ʵ�
	private String schoolName;
	
	//������
	
	public Student() {
	
		System.out.println("student()");
	}
	
//	�θ��� Person(2)������ ���
//	public Student(String name, int age, String schoolName) {
//		super(name, age);
//		this.schoolName = schoolName;
//	}

	public Student(String name, int age, String schoolName) {
	super(); //��������?? 
	super.setName(name);
	super.setAge(age);
	this.schoolName = schoolName;
	
	System.out.println("student(3)");
	}
	
	
	
	//�żҵ� gs
	public void setAge(int age) {
		if(age<0) {
			super.age = 0;
		}
	}
	
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}

	public void showInfo() {
		System.out.println("�̸�: "+ getName());
		System.out.println("����: "+getAge());
		System.out.println("�б�: "+schoolName);
	}
	

	
}
