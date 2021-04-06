package com.ict01.grammar03;

import java.util.Scanner;

class Ex08 {
	public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);

	// 숫자를 받아서 홀수, 짝수를 구분하자
	   System.out.print("입력한 수 : ");
	   int a = sc.nextInt();
	   String res = (a % 2 == 0) ? "짝수" : "홀수";
	   System.out.println(res);


	// 국어, 영어, 수학을 받아서 
	// 점수의 평균이 60이상이고 각 점수는 40이상일 때 합격 또는 불합격
	
	   System.out.print("국어 : ");
	   int kor = sc.nextInt();

	   System.out.print("영어 : ");
	   int eng = sc.nextInt();

	   System.out.print("수학 : ");
	   int math = sc.nextInt();

	   int sum = kor + eng + math;

	   double avg = (int)(sum / 3.0 * 10) / 10.0; //평균 구할 땐 소숫점 첫째까지

	   String res2 = (avg >= 60 && kor >= 40 && eng >= 40 && math >= 40) ? "합격" : "불합격";
	   System.out.println("결과는 : " + res2);


	// 알바 시간을 입력받아서
	// 8시간까지는 8720원, 8시간 초과시 시간당 1.5배이다
	// 받을 금액을 계산하자

	   System.out.print("일한 시간 : ");
	   int time = sc.nextInt();
	   int dan = 8720;
	   int pay = (time < 8) ? (time * dan) : (8 * dan) + (int)((time - 8) * dan * 1.5); 
	   System.out.println("받을 금액 : " + pay);

	}

}