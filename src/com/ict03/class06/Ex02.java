package com.ict03.class06;

enum Type {
	WALKING, RUNNING, TRACKING, HIKING
}

public class Ex02 {
	String name;
	int size;
	Type type;
	
	public static void main(String[] args) {
		//�� ��
		// System.out.println(name); 
		//��ü�� ���� ����� �� �ִ�
		
		Ex02 shoes = new Ex02();
		shoes.name = "����Ű";
		shoes.size = 230;
		shoes.type = Type.RUNNING;
		System.out.println("�귣�� : " + shoes.name);
		System.out.println("������ : " + shoes.size);
		System.out.println("Ÿ�� : " + shoes.type);
	}
}
