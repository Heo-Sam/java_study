package com.ict01.grammar04;

import java.util.Scanner;

class Ex10
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		esc:
		while (true)
		{
			System.out.print("숫자입력 : ");
			int k = sc.nextInt();
			String msg = "";
			if (k % 2 == 0)
			{
				msg = "짝수";
			} else {
				msg = "홀수";
			}
			System.out.println(k + "는 " + msg + "입니다.");

			while (true)
			{
				System.out.print("계속 할까요?(1.YES/2.NO) >>> ");
				int k2 = sc.nextInt();
				if (k2 == 1) {
					 // continue esc; 바깥 쪽 while문의 조건식으로 이동
					 break;
				} else if (k2 == 2)
				{
					break esc; // 바깥 쪽 while문을 빠져나감
				} else 
				{
					System.out.println("다시 입력하세요.");
					continue; // 안 쪽 while문으로 이동해서 계속할까요?를 반복
				} 
			} // 안 쪽 while문 끝
			System.out.println("안쪽끝 ~~");
			//안쪽과 바깥쪽 사이에 실행문이 있을 경우 break를 사용한다.
			//break를 사용하는 것이 깔끔한 문장
		}// 바깥 쪾 while문 끝

	}
}
