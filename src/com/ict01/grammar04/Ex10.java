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
			System.out.print("�����Է� : ");
			int k = sc.nextInt();
			String msg = "";
			if (k % 2 == 0)
			{
				msg = "¦��";
			} else {
				msg = "Ȧ��";
			}
			System.out.println(k + "�� " + msg + "�Դϴ�.");

			while (true)
			{
				System.out.print("��� �ұ��?(1.YES/2.NO) >>> ");
				int k2 = sc.nextInt();
				if (k2 == 1) {
					 // continue esc; �ٱ� �� while���� ���ǽ����� �̵�
					 break;
				} else if (k2 == 2)
				{
					break esc; // �ٱ� �� while���� ��������
				} else 
				{
					System.out.println("�ٽ� �Է��ϼ���.");
					continue; // �� �� while������ �̵��ؼ� ����ұ��?�� �ݺ�
				} 
			} // �� �� while�� ��
			System.out.println("���ʳ� ~~");
			//���ʰ� �ٱ��� ���̿� ���๮�� ���� ��� break�� ����Ѵ�.
			//break�� ����ϴ� ���� ����� ����
		}// �ٱ� �U while�� ��

	}
}
