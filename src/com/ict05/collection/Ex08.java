package com.ict05.collection;

import java.util.HashMap;
import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		// Map �������̽� : Key�� Value�� �����ϴ� ������ �̷����
		//					Key�� �ߺ��Ǹ� ����� �ȴ�.(�ߺ��� �� ����.) => value�� �ߺ� ����
		//					Key�� ȣ���ϸ� Value�� ���´�.
		//					Key�� set�÷��ǿ� ������ ���� => keySet()
		
		// �ֿ� �޼ҵ�
		// add()�� �߰�, ���� �ȵ�
		//  - put(K key, V value): �߰�, ����
		//  - keySet(): key�� set���� ����
		//  - containsKey(Object key): boolean
		//		���ڷ� ���� key�� �����ϸ� true, �ƴϸ� false
		//  - containsValue(Object value) : boolean
		//		���ڷ� ���� value�� �����ϸ� true, �ƴϸ� false
		//  - get(Object key): key�� �޾Ƽ� value�� ����
		//  - remove(Object key): key�� �޾Ƽ� ����
		//  - replace(K key, V value): ġȯ�ϱ�
		
		
		// 1. key�� �����ִ� ���ڷ� ����� for�� ��� ����
		HashMap<Integer, String> map1 = new HashMap<Integer, String>(); // key ����, value ����
		map1.put(1, "�ѱ�");
		map1.put(2, "�̱�");
		map1.put(3, "�߱�");
		map1.put(4, "����");
		map1.put(5, "�±�");
		System.out.println(map1);
		
		map1.put(3, "�Ϻ�"); // key�� �ߺ�
		System.out.println(map1);
		
		map1.put(6, "�ѱ�"); // value�� �ߺ�
		System.out.println(map1);
		
		
		// �ϳ��� �����ϱ�(get(key))
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		System.out.println(map1.get(3));
		System.out.println(map1.get(4));
		System.out.println(map1.get(5));
		System.out.println("=====================");
		
		for (int i = 1; i < map1.size(); i++) {
			System.out.println(map1.get(i));
		}
		System.out.println();
		
		// ������ for�� ��� => KeySet() ���
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k));
		}
		System.out.println();
		
		// iterator() => KetSet() ���
		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			int su1 = (int)it.next();
			System.out.println(map1.get(su1));
		}
		System.out.println("=====================");
		
		
		// 2. key�� ���ڷ� ����� ��� �� KetSet()�� ����ؾ� �Ѵ�.(�Ϲ���)
		// 			=> iterator
		HashMap<String, String> map2 = new HashMap<String, String>();
		
		map2.put("�̸�", "���浿");
		map2.put("����", "34");
		map2.put("�ּ�", "������");
		map2.put("����", "��");
		map2.put("���", "���ڱ�"); 
		
		System.out.println(map2.get("�̸�"));
		System.out.println(map2.get("����"));
		System.out.println(map2.get("�ּ�"));
		System.out.println(map2.get("����"));
		System.out.println(map2.get("���"));
		System.out.println("=====================");
		
		// ������ for���� KeySet() 
		for (String k : map2.keySet()) {
			System.out.println(map2.get(k));
		}
		System.out.println("=====================");
		
		// iterator���
		Iterator<String> it2 = map2.keySet().iterator();
		while (it2.hasNext()) {
			String k = (String) it2.next();
			System.out.println(map2.get(k));
		}
		
		
		
		
		
		
	}

}