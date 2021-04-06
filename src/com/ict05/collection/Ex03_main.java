package com.ict05.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_main {
	public static void main(String[] args) {
		
		//setter�� �̿��ؼ� �̸��� ���� ����
		Ex03 coffee = new Ex03();
		coffee.setName("Ŀ������");
		coffee.setPrice(2500);
		
		// �����ڸ� �̿��ؼ� �̸��� ���� ����
		Ex03 cola = new Ex03("�ݶ�",1600);
		Ex03 juice = new Ex03("��������", 2300);
		
		// ��ü�� �����ϰ� �����ϴ� ���: �迭, �÷���
		
		// 1. �迭
		// Ex03�� �ڷ����̵�
		Ex03[] arr = new Ex03[3];
		arr[0] = coffee;
		arr[1] = cola;
		arr[2] = juice;
		
		// �̸��� ������ ������ ���� (?)
		for (Ex03 k : arr) {
			System.out.println("�̸� : " + k.getName());
			System.out.println("���� : " + k.getPrice());
		}
		System.out.println("=================");
		
		
		// 2. �÷���
		// h1�� Ex03���θ� ������� ��ü���� �ʿ��� ���̴�
		// Ex03�� ���׸�Ÿ��
		
		HashSet<Ex03> h1 = new HashSet<>();
		//�߰�, h1�� Ex03���� ������� ��ü�� �޾ƿ�
		h1.add(coffee);
		h1.add(cola);
		h1.add(juice);
		//���� �߰��� ����(�迭�� �Ұ�)
		h1.add(new Ex03("�̿�����", 1500));
		
		//�̸�,.���� ������
		// 1). ������ for�� ���
		for (Ex03 k : h1) { 
			System.out.println("�̸� : " + k.getName());
			System.out.println("���� : " + k.getPrice());
		}
		System.out.println("=================");
		
		
		
		// 2). iterator()
		Iterator<Ex03> it = h1.iterator(); // h1�� ���ʴ�� ����
		while (it.hasNext()) {
			Ex03 s1 = (Ex03) it.next();
			System.out.println("�̸� : " + s1.getName());
			System.out.println("���� : " + s1.getPrice());
			}
		System.out.println("=================");
		
		
		// ���Կ���: contains(Object o)
		if(h1.contains(coffee)) {
			System.out.println("�ִ�.");
		}else {
			System.out.println("����.");
		}
		
		// ����: size()
		System.out.println(h1.size());
		
		// ����: remove(Object o) , clear()
		// �÷��� �ȿ� �ش� ��ü�� ������ ����, ������ ��������
		// cola�� ������ �����ض�
		if (h1.contains(cola)) {
			h1.remove(cola);
			System.out.println(cola.getName() + " ����");
		} else {
			System.out.println("�������� �ʽ��ϴ�");
		}
		System.out.println("=================");
		
		// ��ü ���� ��, ������� Ȯ���ϱ� : isEmpty()
		System.out.println("---��ü ���� ��---");
		if (h1.isEmpty()) {
			System.out.println("�������");
		} else {
			System.out.println("������� ����");
		}
		System.out.println("---��ü ���� ��---");
		h1.clear();
		if (h1.isEmpty()) {
			System.out.println("�������");
		} else {
			System.out.println("������� ����");
		}
		
		
		
		
	}

}
