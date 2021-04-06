package com.ict03.class01;

public class Ex02 {
	// Ŭ���� �ȿ��� 3������ ����
	// ����ʵ�, ����޼ҵ�, ������
	
	// ����ʵ�: ����� ����, static�� instance�� ��������.
	// final�� �����ϸ� ���
	// static�� ������ �ν��Ͻ�(��ü ������ �� ���� �������)
	// static�̶�� ��ü ������ ������� �̸� ������� �ִ�.
	
	int k1 = 80;              // instance ���� == �Ϲݺ���
	static int k2 = 90;       // static ����
	final int K3 = 85;        // instance ���
	static final int K4 = 95; // static ��� = API���� �����ϴ� �������

	// ����޼ҵ�: ����, ���
	// �޼ҵ�� �ڱ⸦ ȣ���� ������ �ǵ��ư���.
	
	// �ν��Ͻ�, ��ȯ���� ����.(���� �����Ͱ� ����!!)
	public void sammy01() {
		// ���� ������ �� �����Ƿ� ����
		k1 = k1 + 20;
		k2 = k2 + 10;
		System.out.println("k1 = " + k1);		
		System.out.println("k2 = " + k2);
		
		// final�� ������ ����̴�. ����� �� ������ �� �� ����. => ���� �߻���
		// K3 = K3 + 15;
		// K4 = K4 + 5;
		
		// ��������: �޼ҵ� �ȿ��� ������� ����
		//			 �޼ҵ� �ȿ��� ������� ������ �޼ҵ带 ȣ���� �� ������.
		//			 �޼ҵ尡 ������ �������.
		//			 �ν��Ͻ� ���������� static�� ���� �� ����.
		int s1 = 10;
		// static int s2 = 90;
		final int s3 = 85; 
		// static final int S4 = 95; 
	}
	
	
	// static, ��ȯ���� ����
	public static void sammy02() {
		// static�޼ҵ忡�� �ν��Ͻ� ������ ����� �� ����.
		// k1 = k1 + 20;
		k2 = k2 + 10;
		// K3 = K3 + 15;
		System.out.println("k2 = " + k2);
		System.out.println("K4 = " + K4);
		
		int s1 = 10;
		// static int s2 = 90;
		final int s3 = 85; 
		// static final int S4 = 95; 
	}
	
	
	// �ν��Ͻ�, ��ȯ���� ����. ������ �ٿ� return '����������';
	public int sammy03() {
		//return 14;
		return 's'; //��ȯ���̶� ���ų� ���� �ڷ����� ������
	}
	
	// static, ��ȯ���� ����.
	public static double sammy04() {
		return 147;		
	}
}
