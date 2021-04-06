package com.ict01.grammar03;

import java.util.Scanner;

class Ex10 {
	public static void main(String[] args) {
	// if ~ else ~ : 조건식이 참일 때와 거짓일 때 각각 나눠서 처리한다.
	// 형식: if(조건식) {
	//	조건식이 참일 때 실행할 문장;
	//	조건식이 참일 때 실행할 문장;
	//	 } else { 
	//	조건식이 거짓일 때 실행할 문장;
	//	조건식이 거짓일 때 실행할 문장;
	//	 }
	// 단, 실행할 문장이 한 줄이면 {} 생략 가능

	  Scanner sc = new Scanner(System.in);

	// int k1이 60 이상이면 합격 아니면 불합격
	   int k1 = 61;
	   String res = "";
	   if (k1 >= 60) {
	   	res = "합격";
	   } else {
		res = "불합격";
	   }
	   System.out.println("결과1 : " + res);


	// int k2가 홀수인지 짝수인지
	   int k2 = 45;
	   String res2 = "";
	   if (k2 % 2 ==0) {
		res2 = "짝수입니다";
	   } else {
		res2 = "홀수입니다";
	   }
	   System.out.println("결과2 : " + res2);


	// char k3가 대문자인지 아닌지
	   char k3 = 'e';
	   String res3 = "";
	   if (k3 >= 'A' && k3 <= 'Z') {
		res3 = "대문자입니다.";
	   } else {
		res3 = "대문자가 아닙니다";
	   }
	   System.out.println("결과3 : " + res3);


	// k4가 1 또는 3이면 남자 아니면 여자
	   int k4 = 2;
	   String res4 = "";
	   if (k4 == 1 || k4 == 3) {
		res4 = "남자입니다";
	   } else {
		res4 = "여자입니다";
	   }
	   System.out.println("결과4 : " + res4);


	// 근무시간이 8시간까지고 시간당 8720원. 초과한 시간만큼은 1.5배
	// 근무 10시간 했는데 총 얼마받냐?
	   int time = 10;
	   int dan = 8720;
	   int pay = 0;
	   if (time < 8) {
		pay = time * dan;
	   } else {
		pay = (int)((time - 8) * dan * 1.5) + (dan * 8);
	   }
	   System.out.println("받을 금액은 : " + pay);


	}

}