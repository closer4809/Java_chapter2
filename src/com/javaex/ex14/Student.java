package com.javaex.ex14;

public class  Student extends Person {

	//필드
	private String schoolName;
	
	//생성자
	
	public Student() {
	
		System.out.println("student()");
	}
	
//	부모의 Person(2)생성자 사용
//	public Student(String name, int age, String schoolName) {
//		super(name, age);
//		this.schoolName = schoolName;
//	}

	public Student(String name, int age, String schoolName) {
	super(); //생략가능?? 
	super.setName(name);
	super.setAge(age);
	this.schoolName = schoolName;
	
	System.out.println("student(3)");
	}
	
	
	
	//매소드 gs
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
		System.out.println("이름: "+ getName());
		System.out.println("나이: "+getAge());
		System.out.println("학교: "+schoolName);
	}
	

	
}
