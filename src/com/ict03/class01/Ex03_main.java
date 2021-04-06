package com.ict03.class01;

public class Ex03_main {
	public static void main(String[] args) {
		// Ex03 클래스를 객체로 만들자
		Ex03 test = new Ex03();
		
		// plus01은 void이므로 받을 데이터가 없음
		System.out.println(1);
		test.plus01(); // 메소드는 호출해야만 실행함
		System.out.println(3);
		System.out.println(test.res);
		
		//sub01은 반환형이 int이므로 저장변수도 int형으로 만들ja
		int sub = test.sub01();
		System.out.println(sub);
	}

}
