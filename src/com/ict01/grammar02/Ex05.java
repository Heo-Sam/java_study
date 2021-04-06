package com.ict01.grammar02;

class Ex05 {
	public static void main(String[] args) {
		// 참조 자료형: String
		String str = "Hello java";
		System.out.println(str);
	
		// String + 연산 : 실제로 더하기 연산을 하지 않고 문자를 연결하는 역할을 한다.
		// String에서 연산을 수행하면 결과는 String으로 나옴

		String k1 = "1000";
		int k2 = 1000;
		System.out.println(k1 + 10);   //100010
		System.out.println(k2 + 10);   //1010

		int s1 = 20;
		int s2 = 4;
		System.out.println(s1 + s2);     // 24
		System.out.println("결과 : " + s1 + s2);    // 결과 : 204
		System.out.println("결과 : " + (s1 + s2));    // 결과 : 24
	}
}