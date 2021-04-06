package com.ict01.grammar04;

class Ex04 
{
	public static void main(String[] args) 
	{
		// while문: for문과 같은 반복문
		// 형식1)									형식2)
		//	초기식;										초기식;
		//	while(조건식) {								while(true) {
		//	  조건식이 참일 때 실행할 문장;				** if (빠져나갈 조건) break; //선 탈출맨
		//	  조건식이 참일 때 실행할 문장;					조건식이 참일 때 실행할 문장;
		//	  증감식;									** if (빠져나갈 조건) break; //후 탈출맨
		//	}												증감식;
		//												}



		// 0~15까지 출력
		int i = 0;
		while (i < 16)
		{
			System.out.print(i + " ");
			i++;
		}
		System.out.println();

		i = 0;
		while (true)
		{
			// 실행문장이 한 줄이면 {}(블록) 안써도 됨.대신 어디서 break인지 모르니 바로 옆에다
			if (i >= 16) break;
			System.out.print(i + " ");
			i++;
		}
		System.out.println();



		// 0~10까지의 짝수만
		i = 0;
		while (true)
		{
			if (i >= 11) break;
			
			if (i % 2 == 0)
			{
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();



		// 0~10까지 홀수만
		i = 0;
		while (i < 11)
		{
			if (i % 2 == 1)
			{
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();



		// 0~50까지 7의 배수만
		i = 0;
		while (i < 51)
		{
			if (i % 7 == 0)
			{
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();



		// 5단 출력 
		i = 1;
		while (i < 10)
		{
			System.out.println("5*" + i + "=" + (5*i));
			i++;
		}
		System.out.println();
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		i = 1;
		while (i < 17)
		{
			System.out.print("0 ");
			if (i % 4 == 0)
			{
				System.out.println();
			}
			i++;
		}
		System.out.println();

		// 0 ~ 10까지 누적합
		int sum = 0;
		i = 0;
		while (i < 11)
		{
			sum = sum + i;
			i++;
		}
		System.out.println("누적 합 : " + sum);

		// 홀수와 짝수의 누적 합을 각각 구하기
		int odd = 0;
		int even = 0;
		i = 0;
		while (i < 11)
		{
			if (i % 2 == 0)
			{
				even = even + i;
			} else {
				odd = odd + i;
			}		
			i++;
		}
		System.out.println("홀수 합: " + odd);
		System.out.println("짝수 합: " + even);


	}
}
