package com.ict01.grammar03;

class Ex06 {
	public static void main(String[] args) {
	// 중첩 삼항 연산자 : 삼항 연산자가 중첩된 것
	// char k1이 대문자인지, 소문자인지, 기타문자인지 판멸하자

	   char k1 = 'W';
	   String res1 = (k1 >= 'A'&& k1 <= 'Z') ? "대문자" 
			: (k1 >= 'a'&& k1 <= 'z') ? "소문자" : "기타문자";
	   System.out.println(res1);


	// int k2가 90점 이상이면 A학점, 80학점 이상이면 B학점, 나머지는 F학점

	   int k2 = 79;
	   String res2 = (k2 >= 90) ? "A학점": (k2 >= 80) ? "B학점" : "F학점";
	   System.out.println(res2);

	// int k3가 1 또는 3이면 남자, 2 또는 4 이면 여자, 나머지는 외국인
		
	   int k3 = 5;
	   String res3 = (k3 == 1 || k3 == 3) ? "남자" : (k3 == 2 || k3 == 4) ? "여자" : "외국인";
	   System.out.println(res3);



	}
}