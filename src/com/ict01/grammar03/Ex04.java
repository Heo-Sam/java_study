package com.ict01.grammar03;

class Ex04 {
	public static void main(String[] args) {	
	// 삼항연산자: 조건연산자 = 조건문인 if ~ else문과 같다
	// - 형식: 저장변수 = 조건식 ? 참일때 실행 할 문장 : 거짓일 때 실행 할 문장 ;
	//	   조건식에는 boolean, 논리연산, 비교연산이 들어간다.
	// - 주의사항: 저장변수, 참일 때 실행결과, 거짓일 때 실행결과 모두 같은 자료형이어야 한다.
	//		(저장변수가 더 큰 자료형이면 문제x)
	// byte < short < char < int < long < float < double !!

	   int result = true ? 14 : 10;
	   System.out.println("결과 : " + result); // 14

	   result = false ? 14 : 10;
	   System.out.println("결과 : " + result); // 10

	// 저장변수가 더 큰 자료형이면 문제 없음
	   int result2 = false ? 14 : 'C'; //  result2는 int, 'C'는 char
	   System.out.println("결과 : " + result2); // C에 해당하는 숫자가 출력
	// 숫자에 해당하는 문자로 출력해주기 위해 형변환을 해줌
	   System.out.println("결과 : " + (char)(result2)); // 영어 C를 출력


	// 주어진 sum이 80이상이면 "합격", 아니면 "불합격"
	   int sum =  81;
	   String result3 = (sum >= 80) ? "합격" : "불합격";
	   System.out.println("결과는? " + result3);

	// 평균점수가 90이상이면 A, 아니면 B
	   double avg = 87.0;
	   double result4 = (avg >= 90) ? 'A' : 'B'; // result4는 double, 조건식은 int, 'A','B'는 char
	   System.out.println("학점은? " + result4); // res4가 double형이기 때문에 실수로 출력됨 
	   System.out.println("학점은? " + (char)(result4)); // 숫자에 해당하는 문자로 출력
	}
}