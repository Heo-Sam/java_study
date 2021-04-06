package com.ict03.class01;

public class Ex02 {
	// 클래스 안에는 3가지가 존재
	// 멤버필드, 멤버메소드, 생성자
	
	// 멤버필드: 상수와 변수, static과 instance로 나눠진다.
	// final이 존재하면 상수
	// static이 없으면 인스턴스(객체 생성할 때 같이 만들어짐)
	// static이라는 객체 생성과 상관없이 미리 만들어져 있다.
	
	int k1 = 80;              // instance 변수 == 일반변수
	static int k2 = 90;       // static 변수
	final int K3 = 85;        // instance 상수
	static final int K4 = 95; // static 상수 = API에서 제공하는 상수형태

	// 멤버메소드: 동작, 기능
	// 메소드는 자기를 호출한 곳으로 되돌아간다.
	
	// 인스턴스, 반환형이 없다.(보낼 데이터가 없다!!)
	public void sammy01() {
		// 값을 변경할 수 있으므로 변수
		k1 = k1 + 20;
		k2 = k2 + 10;
		System.out.println("k1 = " + k1);		
		System.out.println("k2 = " + k2);
		
		// final이 붙으면 상수이다. 상수는 값 변경을 할 수 없다. => 오류 발생함
		// K3 = K3 + 15;
		// K4 = K4 + 5;
		
		// 지역변수: 메소드 안에서 만들어진 변수
		//			 메소드 안에서 만들어진 변수는 메소드를 호출할 때 생성됨.
		//			 메소드가 끝나면 사라진다.
		//			 인스턴스 지역변수는 static을 만들 수 없다.
		int s1 = 10;
		// static int s2 = 90;
		final int s3 = 85; 
		// static final int S4 = 95; 
	}
	
	
	// static, 반환형이 없다
	public static void sammy02() {
		// static메소드에는 인스턴스 변수를 사용할 수 없다.
		// k1 = k1 + 20;
		k2 = k2 + 10;
		// K3 = K3 + 15;
		System.out.println("k2 = " + k2);
		System.out.println("K4 = " + K4);
		
		int s1 = 10;
		// static int s2 = 90;
		final int s3 = 85; 
		// static final int S4 = 95; 
	}
	
	
	// 인스턴스, 반환형이 있음. 마지막 줄에 return '보낼데이터';
	public int sammy03() {
		//return 14;
		return 's'; //반환형이랑 같거나 작은 자료형의 데이터
	}
	
	// static, 반환형이 있음.
	public static double sammy04() {
		return 147;		
	}
}
