package com.ict03.class03;

// Ex02�� Ex03�� ��Ӱ����
public class Ex03 extends Ex02 {
	String name = "���θ�";
	int age = 34;
	static String hobby = "��ȭ����";
	
	public Ex03() {
		System.out.println("�ڽ�Ŭ���� ������ : " + this);
	}
	
	public void sound() {
		System.out.println("�ڽ�Ŭ���� �޼ҵ�");
	}
	
	public void study() {
		// ��ü ���� ���� �θ�Ŭ������ ����� ����� ��
		System.out.println("���� ��� : " + addr);
		
		 System.out.println("name + " + this.name);
		 System.out.println("name + " + super.name);
		
		// ��Ӱ���� private�� ���Ұ�
		// System.out.println("�츮�� �ݷ����� : " + dog);
	}
	
	
	// �������̵�: (�Ѹ����)�θ�޼ҵ带 �״�� ����ϸ鼭 ���븸 ������
	// = ������
	@Override
	public void eat() {
		System.out.println("�ڽ�: ���� ��ħ���� �ȸԴ´�");
		// super.eat();
	}

	// final : �������̵��� �� �� �����ϴ� �����
	// ��, �θ�޼ҵ忡 final�� ������ override �� �� ����.
/*
  	@override
  	public final void walk() {
		System.out.println("�θ� : �Ϸ翡 ������ 1�ð��� ��å�Ѵ�!");
	}
*/	
	
	
	

}
