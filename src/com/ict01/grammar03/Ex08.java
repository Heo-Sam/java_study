package com.ict01.grammar03;

import java.util.Scanner;

class Ex08 {
	public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);

	// ���ڸ� �޾Ƽ� Ȧ��, ¦���� ��������
	   System.out.print("�Է��� �� : ");
	   int a = sc.nextInt();
	   String res = (a % 2 == 0) ? "¦��" : "Ȧ��";
	   System.out.println(res);


	// ����, ����, ������ �޾Ƽ� 
	// ������ ����� 60�̻��̰� �� ������ 40�̻��� �� �հ� �Ǵ� ���հ�
	
	   System.out.print("���� : ");
	   int kor = sc.nextInt();

	   System.out.print("���� : ");
	   int eng = sc.nextInt();

	   System.out.print("���� : ");
	   int math = sc.nextInt();

	   int sum = kor + eng + math;

	   double avg = (int)(sum / 3.0 * 10) / 10.0; //��� ���� �� �Ҽ��� ù°����

	   String res2 = (avg >= 60 && kor >= 40 && eng >= 40 && math >= 40) ? "�հ�" : "���հ�";
	   System.out.println("����� : " + res2);


	// �˹� �ð��� �Է¹޾Ƽ�
	// 8�ð������� 8720��, 8�ð� �ʰ��� �ð��� 1.5���̴�
	// ���� �ݾ��� �������

	   System.out.print("���� �ð� : ");
	   int time = sc.nextInt();
	   int dan = 8720;
	   int pay = (time < 8) ? (time * dan) : (8 * dan) + (int)((time - 8) * dan * 1.5); 
	   System.out.println("���� �ݾ� : " + pay);

	}

}