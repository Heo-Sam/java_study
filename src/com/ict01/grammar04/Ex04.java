package com.ict01.grammar04;

class Ex04 
{
	public static void main(String[] args) 
	{
		// while��: for���� ���� �ݺ���
		// ����1)									����2)
		//	�ʱ��;										�ʱ��;
		//	while(���ǽ�) {								while(true) {
		//	  ���ǽ��� ���� �� ������ ����;				** if (�������� ����) break; //�� Ż���
		//	  ���ǽ��� ���� �� ������ ����;					���ǽ��� ���� �� ������ ����;
		//	  ������;									** if (�������� ����) break; //�� Ż���
		//	}												������;
		//												}



		// 0~15���� ���
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
			// ���๮���� �� ���̸� {}(���) �Ƚᵵ ��.��� ��� break���� �𸣴� �ٷ� ������
			if (i >= 16) break;
			System.out.print(i + " ");
			i++;
		}
		System.out.println();



		// 0~10������ ¦����
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



		// 0~10���� Ȧ����
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



		// 0~50���� 7�� �����
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



		// 5�� ��� 
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

		// 0 ~ 10���� ������
		int sum = 0;
		i = 0;
		while (i < 11)
		{
			sum = sum + i;
			i++;
		}
		System.out.println("���� �� : " + sum);

		// Ȧ���� ¦���� ���� ���� ���� ���ϱ�
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
		System.out.println("Ȧ�� ��: " + odd);
		System.out.println("¦�� ��: " + even);


	}
}
