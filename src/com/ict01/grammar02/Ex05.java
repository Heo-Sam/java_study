package com.ict01.grammar02;

class Ex05 {
	public static void main(String[] args) {
		// ���� �ڷ���: String
		String str = "Hello java";
		System.out.println(str);
	
		// String + ���� : ������ ���ϱ� ������ ���� �ʰ� ���ڸ� �����ϴ� ������ �Ѵ�.
		// String���� ������ �����ϸ� ����� String���� ����

		String k1 = "1000";
		int k2 = 1000;
		System.out.println(k1 + 10);   //100010
		System.out.println(k2 + 10);   //1010

		int s1 = 20;
		int s2 = 4;
		System.out.println(s1 + s2);     // 24
		System.out.println("��� : " + s1 + s2);    // ��� : 204
		System.out.println("��� : " + (s1 + s2));    // ��� : 24
	}
}