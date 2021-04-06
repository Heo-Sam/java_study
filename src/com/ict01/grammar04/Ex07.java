package com.ict01.grammar04;

class Ex07 
{
	public static void main(String[] args) 
	{
		// break문: 현재 반복문을 탈출할 때 사용
		// continue문: continue문 이하의 수행문을 포기하고 다음 회차를 반복수행

		for (int i = 1; i < 11; i++)
		{
			if (i == 4) break;  // i가 4가되면 반복문을 빠져나옴!! 
			System.out.print(i + " "); // 1 2 3
		}
		System.out.println();



		for (int i = 1; i < 11; i++)
		{
			if (i == 4) continue; // i가 4가되면 출력되지 않고 증감식(다음회차)으로 이동
			System.out.print(i + " "); // continue 아래쪽에 실행문이 있어야 실행되지 않고 출력함
		}
		System.out.println();

		int k = 1;
		while (k < 21)
		{
			if(k == 17) break;
			System.out.print(k + " ");
			k++;
		}
		System.out.println();

		// 17로 무한반복된다.
		int k2 = 11;
		while (k2 < 21)
		{
			//if(k2 == 17) continue;
			System.out.print(k + " ");
			k2++;
			
		}
		System.out.println();

		//중첩 for문에서 break사용: j = 3일 때 break
		for (int i = 1; i < 4; i++)
		{
			for (int j = 1; j < 6; j++)
			{
				if(j == 3) break;
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println("----------------------------");
		

		//중첩 for문에서 break사용: i = 2일 때 break
		for (int i = 1; i < 4; i++)
		{
			for (int j = 1; j < 6; j++)
			{
				if(i == 2) break;
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println("----------------------------");
		


		//중첩 for문에서 continue사용: j = 3일 때 continue
		for (int i = 1; i < 4; i++)
		{
			for (int j = 1; j < 6; j++)
			{
				if(j == 3) continue;
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println("----------------------------");
		

		//중첩 for문에서 continue사용: i = 2일 때 continue
		for (int i = 1; i < 4; i++)
		{
			for (int j = 1; j < 6; j++)
			{
				if(i == 2) continue;
				System.out.println("i = " + i + ", j = " + j);
			}
		}



	}
}
