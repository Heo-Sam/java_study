package com.ict01.grammar03;

import java.util.Scanner;

class Ex07 {
	public static void main(String[] args) {
	// Scanner Ŭ���� �˾ƺ���
	// Scanner �� �Ҽ��� java.util.Scanner �̴�
	// java.lang �ȿ� �Ҽӵ� Ŭ�������� ������� ���������
	// �̿��� Ŭ������ �Ҽ�ǥ�ø� �ؾ��Ѵ�. (import)

	// Ŭ���� �ȿ��� Constructor(������), Methods(�޼ҵ�), Field(�ʵ�)
	// method => ����, ���, �ϴ� �� 

	// Ű���忡 �Էµ� ������ sc�� ����ȴ�,
	   Scanner sc = new Scanner(System.in);
	   System.out.print("���� �̸��� : ");

	// ����� ������ ��������(������ �� ������ String���� ������)
	   String name = sc.next();

	// ����� ������ ��������(������ �� ������ int���� ������)
	   System.out.print("���� ���� : ");
	   int kor = sc.nextInt();

	   System.out.print("���� ���� : ");
	   double eng = sc.nextInt ();

	   System.out.print("���� ���� : ");
	   int math = sc.nextInt();

	   double sum = kor + eng + math;
	   System.out.println("������ : " + sum);

	
	// ���� ������ double�� ���
	   System.out.print("����� Ű : ");
	   double height = sc.nextDouble();
	   System.out.println(height);

	// ���� ������ boolean���� ���
	   System.out.print("����� �����Դϱ�?(true/false)");
	   boolean gender = sc.nextBoolean();
	   String str = gender ? "�����Դϴ�." : "�����Դϴ�";
	   System.out.println(str);
	}

}