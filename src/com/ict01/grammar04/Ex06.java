package com.ict01.grammar04;

import java.util.Scanner;

class Ex06 
{
	public static void main(String[] args) 
	{
		// do ~ while문: while문과 같은 반복문
		//				먼저 실행 후 나중에 비교한다.
		// 형식: 초기식;
		//		do {
		//		  실행할 문장;
		//		  증감식;
		//		} while (조건식);


		// 0-10까지 출력
		int i = 0;
		do
		{
			System.out.print(i + " ");
			i++;
		}
		while (i < 11);
		System.out.println();



		//반복횟수를 받아서 처리하자

		Scanner sc = new Scanner(System.in);
		
		System.out.print("횟수를 입력하세요 : ");
		int a = sc.nextInt();
		
		i = 0;
		do
		{
			System.out.println("안녕하쇼");
			i++;
		}
		while (i < a);


		//반복 횟수와 판별 숫자를 받아서
		//판별할 숫자가 홀수인지 짝수인지 출력
		System.out.print("반복할 횟수를 입력하세요 : ");
		int count = sc.nextInt();

		i = 0;
		String msg = "";
		do
		{
			System.out.print("판별할 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num % 2 == 0)
			{
				msg =  "짝수";
			} else {
				msg =  "홀수";
			}
			System.out.println("입력한 수 " + num + "는 " + msg + "입니다.");

			
		} while(i < count);
	}
}
