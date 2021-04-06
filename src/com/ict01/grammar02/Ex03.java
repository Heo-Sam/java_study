package com.ict01.grammar02;

class Ex03 {
	public static void main(String[] args) {
		 // 정수형: 소숫점이 없는 숫자 
		 // 정수형 종류: byte < short < int < long
		 // 정수형의 기본은 int
		 // 주의사항: byte, short를 연산하면 결과는 무조건 int 이상

		 // byte : -128 ~ 127 사이 숫자만 사용 가능
		byte s1 = -127;
		System.out.println(s1);

		s1 = -128;
		System.out.println(s1);

		 // byte범위가 벗어나서 오류 발생
		 // s1 = -129; 
		 // System.out.println(s1);

		 // short : -32,768 ~ 32,767 범위 안에 존재하는 정수를 저장
		 // 오류 발생: 결과값이 저장된다. (결과를 먼저 구해야 된다.)
		 // short s2 = 32760 + 100;
		 // System.out.println(s2);

		 // int와 long은 범위를 외울 필요x
		 // 일반적인 정수는 int, 아주 큰 정수를 사용하고자 할 때는 long을 사용
		 // long에는 숫자 뒤에 L(대) 또는 l(소) 을 사용할 수 있다. (생략도 가능) 

		int s3 = 117;

		long s4 = 117L;
		long s5 = 117l;
		long s6 = 117;

		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);


		 // 실수형: 소숫점이 존재하는 수
		 // 무조건 정수보다는 크다.
		 // 실수형의 종류: float < double 
		 //	(char < 정수(int<long) < float < double)
		 //실수의 기본형은 double
		 //float는 숫자 뒤에 F(대) 또는 f(소)를 붙인다.(생략 불가!!)

		float s7 = 3.14f; 
		System.out.println(s7);

		double s8 = 3.14;
		System.out.println(s8);

		double s9 = 117; // 형 변환이 일어남
		System.out.println(s9);
	}
}