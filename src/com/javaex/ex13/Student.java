package com.javaex.ex13;

public class  Student extends Person {

	//�ʵ�
	private String schoolName;
	
	public Student() {
		
	}
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
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
