package com.javaex.ex12;

public class Personapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p00 = new Person("정우성", 46); 
		p00.showInfo();
		
		System.out.println(p00.toString());
	
		Student s00 = new Student("이효리", 50, "제주고등학교"); 
		
		System.out.println(s00.toString());
	}

}
