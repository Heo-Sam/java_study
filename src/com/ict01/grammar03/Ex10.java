package com.ict01.grammar03;

import java.util.Scanner;

class Ex10 {
	public static void main(String[] args) {
	// if ~ else ~ : ���ǽ��� ���� ���� ������ �� ���� ������ ó���Ѵ�.
	// ����: if(���ǽ�) {
	//	���ǽ��� ���� �� ������ ����;
	//	���ǽ��� ���� �� ������ ����;
	//	 } else { 
	//	���ǽ��� ������ �� ������ ����;
	//	���ǽ��� ������ �� ������ ����;
	//	 }
	// ��, ������ ������ �� ���̸� {} ���� ����

	  Scanner sc = new Scanner(System.in);

	// int k1�� 60 �̻��̸� �հ� �ƴϸ� ���հ�
	   int k1 = 61;
	   String res = "";
	   if (k1 >= 60) {
	   	res = "�հ�";
	   } else {
		res = "���հ�";
	   }
	   System.out.println("���1 : " + res);


	// int k2�� Ȧ������ ¦������
	   int k2 = 45;
	   String res2 = "";
	   if (k2 % 2 ==0) {
		res2 = "¦���Դϴ�";
	   } else {
		res2 = "Ȧ���Դϴ�";
	   }
	   System.out.println("���2 : " + res2);


	// char k3�� �빮������ �ƴ���
	   char k3 = 'e';
	   String res3 = "";
	   if (k3 >= 'A' && k3 <= 'Z') {
		res3 = "�빮���Դϴ�.";
	   } else {
		res3 = "�빮�ڰ� �ƴմϴ�";
	   }
	   System.out.println("���3 : " + res3);


	// k4�� 1 �Ǵ� 3�̸� ���� �ƴϸ� ����
	   int k4 = 2;
	   String res4 = "";
	   if (k4 == 1 || k4 == 3) {
		res4 = "�����Դϴ�";
	   } else {
		res4 = "�����Դϴ�";
	   }
	   System.out.println("���4 : " + res4);


	// �ٹ��ð��� 8�ð������� �ð��� 8720��. �ʰ��� �ð���ŭ�� 1.5��
	// �ٹ� 10�ð� �ߴµ� �� �󸶹޳�?
	   int time = 10;
	   int dan = 8720;
	   int pay = 0;
	   if (time < 8) {
		pay = time * dan;
	   } else {
		pay = (int)((time - 8) * dan * 1.5) + (dan * 8);
	   }
	   System.out.println("���� �ݾ��� : " + pay);


	}

}