package com.ict03.class03;

public class Ex15 extends Ex14 {
	
	String name = "ȫ����";
	int id = 2410;
	
	public Ex15() {
		super("������", 30); // �⺻�����ڿ��� ����������
		System.out.println("�ڽ� Ŭ���� ������ : " + this);
		name = "ȫ�β�";
		id = 1004;
	}

	public Ex15(String name) {
		super("�±Ǻ���", 19);
		this.name = name;
	}
	
	public void prn() {
		String name = "ȫ��";
		
		// ����, ����, �θ� ��� ���� �����̸��� ������ �ִ�.
		//	=> �̶��� �ݵ�� �����ؾ� ��
		System.out.println("�������� �̸� : " + name);
		System.out.println("�������� �̸� : " + this.name);
		System.out.println("�θ𺯼� �̸� : " + super.name);
		
		// �θ� ������ �ִ� ����
		//	=> �������� �ʾƵ� ��
		System.out.println("�θ� ������ �ִ� ���� : " + age);
		System.out.println("�θ� ������ �ִ� ���� : " + this.age);
		System.out.println("�θ� ������ �ִ� ���� : " + super.age);
		
		// �ڽĸ� ������ �ִ� ����
		System.out.println("�ڽĸ� ������ �ִ� ���� : " + id);
		System.out.println("�ڽĸ� ������ �ִ� ���� : " + this.id);
		// System.out.println("�ڽĸ� ������ �ִ� ���� : " + super.id);
		// 							=> ����: �θ𿡴� id������ ����
	}
	
	

}
