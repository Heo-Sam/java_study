package com.ict01.grammar03;

class Ex11 {
	public static void main(String[] args) {
	// ���� if��: ���ǽ��� ������ �� �ٽ� ���ǽ��� ����Ѵ�.
	// ����: if(���ǽ� 1) {
	//	���ǽ�1�� ���� �� ����;
	//	} else if(���ǽ� 2) {
	//	���ǽ�1�� �����̸鼭 ���ǽ�2�� ���� �� ����;
	//	} else if(���ǽ� 3) {
	//	���ǽ�1,2�� �����̸鼭 ���ǽ�3�� ���� �� ����;
	//	} else {
	//	���ǽ�1,2,3 ��� ������ �� �������� ���;
	//	}


	// int k1�� ������ 90�̻��̸� A, 80�̻��̸� B, 70�̻��̸� C, ������ F
	   int k1 = 87;
	   String str = "";
	   if(k1 >= 90) {
		str = "A";
	   } else if(k1 >= 80) {
		str = "B";
	   } else if(k1 >= 70) {
		str = "C";
	   } else {
		str = "F";
	   }
	   System.out.println("����� ������ : " + str);


	// char k2�� �빮������, �ҹ�������, ��������, ��Ÿ�������� �Ǻ�
	   char k2 = '9';
	   String str2 = "";
	   if(k2 >= 'A' && k2 <= 'Z') {
		str2 = "�빮���Դϴ�.";
	   } else if(k2 >= 'a' && k2 <= 'z') {
		str2 = "�ҹ����Դϴ�.";
	   } else if(k2 >= '0' && k2 <= '9') {
		str2 = "�����Դϴ�.";
	   } else {
		str2 = "��Ÿ�����Դϴ�.";
	   }
	   System.out.println("��� : " + str2);
	

	// char k3�� A,a�̸� ������ī��B,b�̸� �������C,c�̸� ĳ�ٳ��ѳ����� �ѱ�
	   char k3 = 'C';
	   String str3 = "";
	   if(k3 == 'A' || k3 == 'a') {
		str3 = "������ī";
	   } else if(k3 == 'B' || k3 == 'b') {
		str3 = "�����";
	   } else if(k3 == 'C' || k3 == 'c') {
		str3 = "ĳ����";
	   } else {
		str3 = "�ѱ�";
	   }
	   System.out.println("��� : " + str3);
	

	// menu�� 1�̸� ī���ī 3500, 2�̸� ī����� 4000
	// 3�̸� �Ƹ� 3000, 4�̸� �꽺 3500
	// Ī���� 2���� 10000�� ���� ����
	// �ܵ��󸶿� (��, �ΰ��� 10%)

	   int jan = 2;
	   int pay = 10000;

	   int menu = 4;
	   String str4 = "";
	   if (menu == 1) {
		str4 = "ī���ī";
		double m1 = 3500 + (3500*0.1);
	   } else if (menu == 2) {
		str4 = "ī���";
		double m2 = 4000 + (4000*0.1);
	   } else if (menu == 3) {
		str4 = "�Ƹ޸�ī��";
		double m3 = 3000 + (3000*0.1);
	   } else {
		str4 = "�����꽺";
		double m4 = 3500 + (3500*0.1);
	   }

	   



	}

	private static boolean isnumberic(char k2) {
		// TODO Auto-generated method stub
		return false;
	}
}