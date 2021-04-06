package com.ict01.grammar03;

class Ex11 {
	public static void main(String[] args) {
	// 다중 if문: 조건식이 거짓일 때 다시 조건식을 사용한다.
	// 형식: if(조건식 1) {
	//	조건식1이 참일 때 실행;
	//	} else if(조건식 2) {
	//	조건식1은 거짓이면서 조건식2는 참일 때 실행;
	//	} else if(조건식 3) {
	//	조건식1,2은 거짓이면서 조건식3은 참일 때 실행;
	//	} else {
	//	조건식1,2,3 모두 거짓일 때 나머지인 경우;
	//	}


	// int k1의 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 나머지 F
	   int k1 = 87;
	   String str = "";
	   if(k1 >= 90) {
		str = "A";
	   } else if(k1 >= 80) {
		str = "B";
	   } else if(k1 >= 70) {
		str = "C";
	   } else {
		str = "F";
	   }
	   System.out.println("당신의 학점은 : " + str);


	// char k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별
	   char k2 = '9';
	   String str2 = "";
	   if(k2 >= 'A' && k2 <= 'Z') {
		str2 = "대문자입니다.";
	   } else if(k2 >= 'a' && k2 <= 'z') {
		str2 = "소문자입니다.";
	   } else if(k2 >= '0' && k2 <= '9') {
		str2 = "숫자입니다.";
	   } else {
		str2 = "기타문자입니다.";
	   }
	   System.out.println("결과 : " + str2);
	

	// char k3가 A,a이면 아프리카ㅡB,b이면 브라질ㅡC,c이면 캐다나ㅡ나머지 한국
	   char k3 = 'C';
	   String str3 = "";
	   if(k3 == 'A' || k3 == 'a') {
		str3 = "아프리카";
	   } else if(k3 == 'B' || k3 == 'b') {
		str3 = "브라질";
	   } else if(k3 == 'C' || k3 == 'c') {
		str3 = "캐나다";
	   } else {
		str3 = "한국";
	   }
	   System.out.println("결과 : " + str3);
	

	// menu가 1이면 카페모카 3500, 2이면 카페라테 4000
	// 3이면 아메 3000, 4이면 쥬스 3500
	// 칭구랑 2잔을 10000원 내고 먹음
	// 잔돈얼마여 (단, 부가세 10%)

	   int jan = 2;
	   int pay = 10000;

	   int menu = 4;
	   String str4 = "";
	   if (menu == 1) {
		str4 = "카페모카";
		double m1 = 3500 + (3500*0.1);
	   } else if (menu == 2) {
		str4 = "카페라떼";
		double m2 = 4000 + (4000*0.1);
	   } else if (menu == 3) {
		str4 = "아메리카노";
		double m3 = 3000 + (3000*0.1);
	   } else {
		str4 = "과일쥬스";
		double m4 = 3500 + (3500*0.1);
	   }

	   



	}

	private static boolean isnumberic(char k2) {
		// TODO Auto-generated method stub
		return false;
	}
}