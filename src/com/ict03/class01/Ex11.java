package com.ict03.class01;

public class Ex11 {
	// 생성자: 클래스를 객체로 만들 때 자동으로 한 번 호출된다.
	//   목적: 멤버필드(변수와 상수)의 초기화
	//   특징: 클래스이름 == 생성자이름
	//		   클래스이름([인자=매개변수]);
	//		   반환형이 없는 메소드라고도 한다.
	//		   생성자를 만들지 않으면 자동으로 기본생성자로 객체를 생성한다.
	//		   기본생성자란? 인자가 없는 생성자를 말한다. 즉, '클래스이름()';
	//		   클래스 안에서 생성자를 만들었으면 만들어진 생성자를 사용해야 한다.

	//		   생성자도 오버로딩이 가능하다.
	//		   (하나의 클래스에 여러개의 생성자가 존재할 수 있다. 단, 인자의 종류나 갯수나 순서가 달라야 함)
	//		   오버로딩이란? 하나의 클래스안에 같은 이름의 메소드가 여러 개 존재하는 것을 말함
	//		   (단, 인자의 종류나 갯수나 순서가 달라야 함)
	
	private String name = "둘리";
	private int age = 24;
	private boolean gender = true;
	
	//생성자 오버로딩
	// 기본생성자
	public Ex11() {
		System.out.println("기본생성자");
		// 초기값 지정
		name = "태권V";
		age = 38;
	}
	
	//기본 생성자가 아닌 다른 생성자(즉, 인자가 있는 생성자)
	public Ex11(String name, int age) {
		System.out.println(1  );
		this.name = name;
		this.age = age;
	}
	
	public Ex11(int age,String name) {
		System.out.println(2);
		this.name = name;
		this.age = age;
	}
	
	
	//getter, setter
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
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	

}
