package com.ict01.grammar02;

class Ex09 {
	public static void main(String[] args) {
		// 2�ð� 40�� 23�ʸ� �ʴ����� �����ض�

	   int hour = 2;
	   int min = 40;
	   int sec = 23;

	   // �ð��� ���� �ʷ�
	   int s1 = hour * 60 * 60;
	   int s2 = min * 60;

	   int total = s1 + s2 + sec;
	  System.out.println("2�ð� 40�� 23�ʴ� �� " + total + "�� �Դϴ�.");

		// 9630�ʴ� �� �ð� �� �� �� �� �ΰ�
	   int time = 9630;
	   int h1 = 0;  // �ð�
	   int m1 = 0; // ��
	   int ss1 = 0; //��
	   int res = 0; //������

	   // �ð� ���ϱ�
	   h1 = time / (60 * 60);
	   res = time % (60 * 60);

	   //�ð��� ���� �� �������� ������ �� ���ϱ�
	   m1 = res / 60;
	   //���� ���� �� �������� ���̴�
	   ss1 = res % 60;

	   System.out.println(time + "�ʴ� " + h1 + "�ð� " + m1 + "�� " + ss1 + "���̴�");
	}
}