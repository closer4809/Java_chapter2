package com.javaex.ex12;

public class Person {
	//필드
	String name;
	int age;
	
	

	//생성자
	public void person() {
		
	}
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	//메소드 겟셋
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
	
	//데이타확인용
	public String toString() {
		return "Person[name="+ name+", age = "+age+"]";
	}
	
	
	//메소드 일반
	public void showInfo() {
		System.out.println("이름:"+name+"나이:"+age);
	}
	
}
