package com.ict03.class03;

public class Ex04_main {

	public static void main(String[] args) {
		Ex03 t1 = new Ex03(); // 자식클래스로 객체 생성
		System.out.println(t1);
		
		// 부모와 자식이 같은 멤버변수 이름을 갖고 있으면
		// 자식멤버를 먼저 사용
		System.out.println(t1.name); // 차두리
		// 자시에게 없는 멤버는
		// 부모멤버를 사용
		System.out.println(t1.addr); // 서울 따스한 우리집 거실
		
		
		// 메소드도 마찬가지
		t1.sound();
		t1.prn();
		System.out.println("==============");
		
		// static은 객체생성과 상관x
		System.out.println(Ex03.hobby);
		System.out.println(Ex02.car);
		System.out.println();
		
		// 자식과 부모가 같은 메소드를 가지고 있으면
		// 자식 메소드를 실행한다.
		t1.eat();
		
		
		
	}

}
