package com.javaex.ex13;

public class Personapp {

	public static void main(String[] args) {
		
		Student s01 = new Student();
		s01.setName("정우성");
		s01.setAge(50);
		s01.setSchoolName("성의고등학교");
		/*
		System.out.println(s01.getAge());
		System.out.println(s01.getName());
		System.out.println(s01.getSchoolName());
		*/
		
		s01.showInfo();
	
		Person p01 = new Person();
		p01.setName("이효리");
		p01.setAge(45);
		//부모는 자식이 종속된지 알지못함
	
		p01.showInfo();
	
	}
	
	

}
