package com.ict03.class01;

public class Ex05_main {

	public static void main(String[] args) {
		// static은 객체 생성과 상관없이 사용가능 
		// 클래스이름.멤버필드, 클래스이름.멤버메소드
		
		System.out.println(Ex05.s3);
		
		// s4가 static으로 선언됐지만 private는 접근할 수 없다.
		// System.out.println(Ex05.s4);
		
		Ex05 test = new Ex05();
		System.out.println(test.s1);
		
		// private는 접근 안 됨
		// System.out.println(test.s2);
		
		System.out.println(test.s3);
		
		
		// 메소드들도 마찬가지
		test.add();
		
		// private 메소드 접근 안 됨
		// test.add2();
		
		// 돌아가서 접근
		test.add3();

	}

}
