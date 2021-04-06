package com.ict01.grammar04;

class Ex02 
{
	public static void main(String[] args) 
	{
		// for��: ������ ��Ģ�� ���� ���๮�� �ݺ� ó���ϴ� ��
		// - ����: for(�ʱ��; ���ǽ�; ������) {
		//	     ���ǽ��� ���� �� ������ ����;
		//	     ���ǽ��� ���� �� ������ ����;
		//	 }
		// for���� ������ ������ �ʱ������ �̵�
		// �ʱ�Ŀ����� ���ǽ����� �̵�
		// ���ǽ��� ���̸� for�� ����, �����̸� for�� ������ ��������.
		// for�� ���� �� for���� ���� ������ ������ ���������� ����.
		// �������� ������ ���ǽ����� �̵�
	
		// �ȳ��ϼ��� �� �� ����ϱ�
		for (int i = 1; i < 11; i++)
		{
			System.out.println("�ȳ��ϼ��� - " + i);
		}

		// 0~15���� ���
		for (int i = 0; i < 16; i++)
		{
			System.out.print(i + "  ");
		}
		System.out.println();

		// 0~10������ ¦����
		for (int i = 0; i < 11; i++)
		{
			if (i % 2 == 0)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// 0~10���� Ȧ����
		for (int i = 0; i < 11; i++)
		{
			if (i % 2 == 1)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// 0~50���� 7�� �����
		for (int i = 0; i < 51; i++)
		{
			if (i % 7 == 0)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// 5�� ��� 
		for (int i = 1; i < 10; i++)
		{
			int a = 5 * i;
			System.out.println("5 * " + i + " = " + a);
		}


		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (int i = 1; i < 17; i++)
		{
			System.out.print("0 ");
			if (i % 4 == 0)
			{
				System.out.println();
			}
			
		}

		// 0 ~ 10���� ������
		int sum = 0; // ���� ���� ����ϴ� ����
		for (int i = 0; i < 11; i++)
		{
			sum = sum + i; // i�� ������ sum += i;
		}
		System.out.println("���� �� : " + sum);


		// Ȧ���� ������
		int odd = 0;
		for (int i = 0; i < 11; i++)
		{
			if (i % 2 == 1)
			{
				odd += i;
			}
		}
		System.out.println("Ȧ�� ���� ��: " + odd);
		

		// ¦���� ������
		int even = 0;
		for (int i = 0; i < 11; i++)
		{
			if (i % 2 == 0)
			{
				even += i;
			}
		}
		System.out.println("¦�� ���� ��: " + even);

		// Ȧ���� ¦���� ���� ���� ���� ���ϱ�
		int odd1 = 0;
		int even1 = 0;
		for (int i = 0; i < 11; i++)
		{
			if (i % 2 == 1)
			{
				odd1 += i;
			} else {
				even1 += i;
			}
		}
		System.out.println("Ȧ�� ��: " + odd1);
		System.out.println("¦�� ��: " + even1);

		// 7! (7 * 6 * 5 * 4 * 3 * 2 * 1)
		int fac = 1;
		for (int i = 7; i > 0; i--)
		{
			fac = fac * i;
		}
		System.out.println("7! = " + fac);
	}
}

