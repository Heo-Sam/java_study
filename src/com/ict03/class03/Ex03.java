package com.ict03.class03;

// Ex02와 Ex03은 상속관계다
public class Ex03 extends Ex02 {
	String name = "차두리";
	int age = 34;
	static String hobby = "영화보기";
	
	public Ex03() {
		System.out.println("자식클래스 생성자 : " + this);
	}
	
	public void sound() {
		System.out.println("자식클래스 메소드");
	}
	
	public void study() {
		// 객체 생성 없이 부모클래스의 멤버를 사용한 것
		System.out.println("공부 장소 : " + addr);
		
		 System.out.println("name + " + this.name);
		 System.out.println("name + " + super.name);
		
		// 상속관계라도 private는 사용불가
		// System.out.println("우리집 반려동물 : " + dog);
	}
	
	
	// 오버라이딩: (겉모양은)부모메소드를 그대로 사용하면서 내용만 변경함
	// = 재정의
	@Override
	public void eat() {
		System.out.println("자식: 나는 아침밥을 안먹는당");
		// super.eat();
	}

	// final : 오버라이딩을 할 수 없게하는 예약어
	// 즉, 부모메소드에 final이 있으면 override 할 수 없음.
/*
  	@override
  	public final void walk() {
		System.out.println("부모 : 하루에 무조건 1시간은 산책한다!");
	}
*/	
	
	
	

}
