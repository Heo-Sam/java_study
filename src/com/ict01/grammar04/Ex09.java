package com.ict01.grammar04;

import java.util.Scanner;

class Ex09 
{
	public static void main(String[] args) 
	{
		// continue ����
		// 1 - 10���� ¦���� ��� (continue���)
		for (int i = 1; i < 11; i++)
		{
			if(i % 2 == 1) continue; // i�� Ȧ���̸� �Ʒ� ��¹��� �������� ����
			System.out.println(i);
		}

		// ���ѷ������� ���ڸ� �޾Ƽ� ¦��, Ȧ�� �Ǻ�		
		// break ����
		Scanner sc = new Scanner(System.in);

		while (true){
			System.out.print("�����Է� : ");
			int k = sc.nextInt();
			String msg = "";
			if (k % 2 == 0)
			{
				msg = "¦��";
			} else {
				msg = "Ȧ��";
			}
			System.out.println(k + "��(��) " + msg + "���� ~~");

			System.out.print("����ұ��? (1.YES / 2. NO) >>>>> ");
			int k2 = sc.nextInt();
			if (k2 == 2) break; // �Է¹��� ���� 2���̸� while���� ��������
		}


	}
}
