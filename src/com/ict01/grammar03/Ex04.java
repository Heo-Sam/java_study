package com.ict01.grammar03;

class Ex04 {
	public static void main(String[] args) {	
	// ���׿�����: ���ǿ����� = ���ǹ��� if ~ else���� ����
	// - ����: ���庯�� = ���ǽ� ? ���϶� ���� �� ���� : ������ �� ���� �� ���� ;
	//	   ���ǽĿ��� boolean, ������, �񱳿����� ����.
	// - ���ǻ���: ���庯��, ���� �� ������, ������ �� ������ ��� ���� �ڷ����̾�� �Ѵ�.
	//		(���庯���� �� ū �ڷ����̸� ����x)
	// byte < short < char < int < long < float < double !!

	   int result = true ? 14 : 10;
	   System.out.println("��� : " + result); // 14

	   result = false ? 14 : 10;
	   System.out.println("��� : " + result); // 10

	// ���庯���� �� ū �ڷ����̸� ���� ����
	   int result2 = false ? 14 : 'C'; //  result2�� int, 'C'�� char
	   System.out.println("��� : " + result2); // C�� �ش��ϴ� ���ڰ� ���
	// ���ڿ� �ش��ϴ� ���ڷ� ������ֱ� ���� ����ȯ�� ����
	   System.out.println("��� : " + (char)(result2)); // ���� C�� ���


	// �־��� sum�� 80�̻��̸� "�հ�", �ƴϸ� "���հ�"
	   int sum =  81;
	   String result3 = (sum >= 80) ? "�հ�" : "���հ�";
	   System.out.println("�����? " + result3);

	// ��������� 90�̻��̸� A, �ƴϸ� B
	   double avg = 87.0;
	   double result4 = (avg >= 90) ? 'A' : 'B'; // result4�� double, ���ǽ��� int, 'A','B'�� char
	   System.out.println("������? " + result4); // res4�� double���̱� ������ �Ǽ��� ��µ� 
	   System.out.println("������? " + (char)(result4)); // ���ڿ� �ش��ϴ� ���ڷ� ���
	}
}