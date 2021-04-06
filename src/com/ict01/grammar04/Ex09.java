package com.ict01.grammar04;

import java.util.Scanner;

class Ex09 
{
	public static void main(String[] args) 
	{
		// continue 예제
		// 1 - 10까지 짝수만 출력 (continue사용)
		for (int i = 1; i < 11; i++)
		{
			if(i % 2 == 1) continue; // i가 홀수이면 아래 출력문을 실행하지 않음
			System.out.println(i);
		}

		// 무한루프에서 숫자를 받아서 짝수, 홀수 판별		
		// break 예제
		Scanner sc = new Scanner(System.in);

		while (true){
			System.out.print("숫자입력 : ");
			int k = sc.nextInt();
			String msg = "";
			if (k % 2 == 0)
			{
				msg = "짝수";
			} else {
				msg = "홀수";
			}
			System.out.println(k + "는(은) " + msg + "여요 ~~");

			System.out.print("계속할까요? (1.YES / 2. NO) >>>>> ");
			int k2 = sc.nextInt();
			if (k2 == 2) break; // 입력받은 값이 2번이면 while문을 빠져나감
		}


	}
}
