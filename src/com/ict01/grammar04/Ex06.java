package com.ict01.grammar04;

import java.util.Scanner;

class Ex06 
{
	public static void main(String[] args) 
	{
		// do ~ while��: while���� ���� �ݺ���
		//				���� ���� �� ���߿� ���Ѵ�.
		// ����: �ʱ��;
		//		do {
		//		  ������ ����;
		//		  ������;
		//		} while (���ǽ�);


		// 0-10���� ���
		int i = 0;
		do
		{
			System.out.print(i + " ");
			i++;
		}
		while (i < 11);
		System.out.println();



		//�ݺ�Ƚ���� �޾Ƽ� ó������

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ƚ���� �Է��ϼ��� : ");
		int a = sc.nextInt();
		
		i = 0;
		do
		{
			System.out.println("�ȳ��ϼ�");
			i++;
		}
		while (i < a);


		//�ݺ� Ƚ���� �Ǻ� ���ڸ� �޾Ƽ�
		//�Ǻ��� ���ڰ� Ȧ������ ¦������ ���
		System.out.print("�ݺ��� Ƚ���� �Է��ϼ��� : ");
		int count = sc.nextInt();

		i = 0;
		String msg = "";
		do
		{
			System.out.print("�Ǻ��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();

			if (num % 2 == 0)
			{
				msg =  "¦��";
			} else {
				msg =  "Ȧ��";
			}
			System.out.println("�Է��� �� " + num + "�� " + msg + "�Դϴ�.");

			
		} while(i < count);
	}
}
