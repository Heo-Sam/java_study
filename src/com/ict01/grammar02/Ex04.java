package com.ict01.grammar02;

class Ex04 {
	public static void main(String[] args) {
		// 숫자들의 크기에 따른 저장 원리
		//  char > int < long < float < double
		//  (문자)  (정   수)        (실    수)

		// 형 변환: 자동 형 변환과 강제 형 변환
		// 자동 형 변환: 작은 자료 형이 큰 자료 형에 저장될 때 (=프로모션 자동 형 변환)

		// ex) char를 int에 저장할 수 있다
		char c1 = 'a';
		System.out.println(c1); // 출력값: a

		int s1 = 'a';
		System.out.println(s1); // 출력값: 97

		//char c1변수도 int s2에 저장
		int s2 = c1;
		System.out.println(s2); //변수 호출. 출력값: 97


		// ex) int를 long에 저장할 수 있다
		long s3 = 117L;
		System.out.println(s3);
		long s4 = 117; // 117을 int로 인식해서 형 변환이 이루어짐

		
		// ex) long을 float나 double에 저장할 수 있다
		float s5 = s3;
		System.out.println(s5);

		// =========================================

		// 강제 형 변환: 큰 자료형을 작은 자료형으로 저장할 때 (=디모션 형 변환)
		// 		오류가 발생 -> 강제로 형을 변환해서 오류가 나지 않게 함
		//		그러나, 데이터를 손실할 가능성이 있다.
		// 강제 형 변환 방법: 등호(=)를 기준으로 "무조건" 왼쪽 자료형에 맞춘다.
		//		 = (왼쪽자료형) (대상);
		byte k1 = (byte)(129);
		System.out.println(k1);

		// ex) int를 char에 넣쟝
		char k2 = 97;
		System.out.println(k2);

		int k3 = 97;
		char k4 = (char)(k3);
		System.out.println(k4);

		// ex) float나 double을 int로 저장
		int k5 = (int)(87.64);
		System.out.println(k5);
		
	}
}