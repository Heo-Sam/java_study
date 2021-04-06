package com.ict01.grammar03;

class Ex01 {
	public static void main(String[] args) {
	// 논리연산자 : && (AND, 논리곱),  ||(OR, 논리합), !(NOT, 논리부정)
	// 사용되는 자원 : boolean형, 비교연산, 논리연산
	// 결과는 boolean형으로 나온다 => 조건식에 사용


	// && (AND, 논리곱, 교집합)
	// - 주어진 조건이 모두 true일 때만 결과가 true
	// - 주어진 조건들 중에 false를 만나는 순간 결과는 false
	// - false를 만나면 이후의 연산은 실행하지 않음



	   int s1 = 10;
	   int s2 = 7;

	   boolean result = true && true;
	   System.out.println(result); 

 	   result = (s1 >= 7) && (s2 >= 5) ; //비교연산
	   System.out.println(result); 	

 	   result = false && true ; //논리연산
	   System.out.println(result); 

 	   result = (s1 <= 7) && (s2 >= 5) ; //비교연산
	   System.out.println(result); 	


	// false를 만나면 이후 연산을 하지 않는다
	   result = ((s1 = s1 + 2) > s2) && (s1 == (s2 = s2 + 5));
	   
	   System.out.println("결과 : " + result);
	   System.out.println("s1 : " + s1);
	   System.out.println("s2 : " + s2);


	   result = ((s1 = s1 + 2) < s2) && (s1 == (s2 = s2 + 5));
	   
	   System.out.println("결과 : " + result);
	   System.out.println("s1 : " + s1);
	   System.out.println("s2 : " + s2);

	// &&는 숫자일 경우 범위를 지정할 수 있다
	// a >= 10 && a <= 20; (a는 10부터 20까지의 범위를 의미)

	   s1 = 24;
	   result = (s1 >= 20) && (s1 <= 30);
	   System.out.println(result);

	// char c1이 소문자인가?

	   char c1 = 'D'; // D = 68
	// result = (c1 >= 97) && (c1 <= 122); //소문자의 숫자 범위
	   result = (c1 >= 'a') && (c1 <= 'z'); //char은 숫자로 저장되기 때문에 요롷게 써도 댐
	   System.out.println("c1은 소문자인가? : " + result);
	}
}