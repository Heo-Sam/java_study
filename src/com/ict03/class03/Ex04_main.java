package com.ict03.class03;

public class Ex04_main {

	public static void main(String[] args) {
		Ex03 t1 = new Ex03(); // �ڽ�Ŭ������ ��ü ����
		System.out.println(t1);
		
		// �θ�� �ڽ��� ���� ������� �̸��� ���� ������
		// �ڽĸ���� ���� ���
		System.out.println(t1.name); // ���θ�
		// �ڽÿ��� ���� �����
		// �θ����� ���
		System.out.println(t1.addr); // ���� ������ �츮�� �Ž�
		
		
		// �޼ҵ嵵 ��������
		t1.sound();
		t1.prn();
		System.out.println("==============");
		
		// static�� ��ü������ ���x
		System.out.println(Ex03.hobby);
		System.out.println(Ex02.car);
		System.out.println();
		
		// �ڽİ� �θ� ���� �޼ҵ带 ������ ������
		// �ڽ� �޼ҵ带 �����Ѵ�.
		t1.eat();
		
		
		
	}

}
