package com.ict01.grammar02;

class Ex08 {
	public static void main(String[] args) {
		// �Ƹ޸�ī�밡 2500���̴�. Ī���� ���̼� 10000���� ���� �ֹ��ߴ�
		// �ܵ��� �󸶴�? (�ΰ��� 10%�� �߰�)

	   // �Է� ����
	   String coffee = "�Ƹ޸�ī��";
	   int ameri = 2500;
	   int human = 2;
	   int pay = 10000;

	   // ���� ���� ����
	   int total = ameri * human;
	   int vat = (int)(total * 0.1);
	   
	   int jandon = pay - (total + vat);
	   System.out.println("�� : " + jandon );


	   int total2 = (int)((ameri * human) * 1.1);
	   int jandon2 = pay - total2;
	   System.out.println("��2 : " + jandon2 );

	}
}