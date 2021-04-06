package com.ict05.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex06 {
	public static void main(String[] args) {
		// * List �������̽��� ������ Ŭ������: Stack, ArrayList, Vector;
		
		// * ArrayList�� Vector : �迭�� ����� ���������� ����, ����, �߰��� �����Ӵ�.
		//						ũ�⸦ �̸� �������� �ʾƵ� �ȴ�.
		//			�� ���� ����ȭ ���������� ���� �ٸ���. ==>	ArrayList(����ȭ ����x), Vector(����ȭ ����=��������)
		
		// Set ������ ������ ���� �ߺ��� �ȵ�.
		// List ������ �����ϰ� ���� ==> ������ �ְ�, �ߺ��� ������
		
		ArrayList<String> list = new ArrayList<String>();
		//list�� �߰�
		list.add("����ȣ");
		list.add("������");
		list.add("�����");
		System.out.println(list);
		
		//list�� ����
		list.add(1, "�߽ż�");
		System.out.println(list);
		System.out.println("========================");
		
		Vector<String> vector = new Vector<String>();
		vector.add("�Ѹ�");
		vector.add("�����");
		vector.addElement("��ġ");
		System.out.println(vector);
		
		vector.add(2, "����");
		System.out.println(vector);
		System.out.println("========================");
		
		
		if(list.contains("�����")) {
			// ��ġ��(�ε�����) �˻�
			System.out.println(list.indexOf("�����") + "��° ��ġ"); //��ġ �˻�
			// �ش���ġ�� �����ϴ� ��ü�� �˻�
			System.out.println(list.get(3)); //��ġ �˻�
			System.out.println(list.get(list.indexOf("�����"))); //��ġ �˻�
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
		System.out.println(list.size() + "��Ұ� ������.");
		System.out.println("========================");
		
		
		// ġȯ: set
		list.set(3, "�̴�ȣ");
		System.out.println(list); // ����� -> �̴�ȣ
		
		// �߽ż��� ������ �߽ż��� ���������� �����ض�
		
		if(list.contains("�߽ż�")) {
			list.set(list.indexOf("�߽ż�"), "������");
		} else {
			System.out.println("����.");
		}
		System.out.println("========================");
		
		
		
		// �ϳ��� ������(for, iterator)
		for (String k : list) {
			System.out.println(k);
		}
		System.out.println("========================");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String msg = (String) it.next();
			System.out.println(msg);
		}
		
		
	}

}
