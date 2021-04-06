package com.ict05.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		// Set �������̽��� ��ӹ��� Ŭ���� : HashSet, TreeSet
		// - HashSet�� TreeSet ������� ��� ����.
		// �׷��� TreeSet�� ���ο��� �׻� ���� ���� ���� ���¸� �����Ѵ�.
		// set�� Ư�� �������� ������ �� �� ����.
		// - HashSet, TreeSet ��� �ߺ� �ȵ� (���� �ȳ�)

		// �÷��� ����
		// HashSet<���״�Ÿ��=��üŸ��=����Ŭ����> �������� = new HashSet<���״�Ÿ��>();
		// HashSet<���״�Ÿ��=��üŸ��=����Ŭ����> �������� = new HashSet<>();
		HashSet<String> h1 = new HashSet<>(); // ���ڿ��� ��ü ����
		HashSet<Integer> h2 = new HashSet<>(); // ������ ��ü ����
		HashSet<Double> h3 = new HashSet<>(); // �Ǽ��� ��ü ����
		HashSet<Boolean> h4 = new HashSet<>(); // ������ ��ü ����

		// h2 (������)�� ��ü�� �߰��ϴ� ���
		// ���1) �⺻�ڷ����� ��ü�� ���� �ֱ� => Boxing
		Integer k1 = new Integer(10);
		Integer k2 = new Integer("10");

		// ���2) �⺻�ڷ����� �׳� �ִ´�.
		// �⺻�ڷ����� �ڵ����� ��ü�� �Ǿ(AutoBoxing) �־�����.

		// h2 �÷��ǿ� ��ü �ֱ� (add(���))
		h2.add(k1); // true
		h2.add(k2); // false (����: �ߺ��� ������� ����)
		h2.add(10); // ���2 // false
		h2.add(new Integer(10)); // false
		// h2.add('A'); // ���� ���״� Ÿ���� �ƴϸ� ������ ����

		h3.add(3.14);
		h3.add(new Double(31.4));
		// h3.add(14); // ���� ���״� Ÿ���� �ƴϸ� ������ ����

		// ���� ���� (��ü ���� ����)
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);

		h1.add("java");
		h1.add("Java");
		h1.add("JAVA");
		h1.add("jsp");
		h1.add("JSP");
		h1.add("spring");
		System.out.println(h1);
		System.out.println();
		
		
		
		// �ϳ��� ������ ����ϱ�
		// 1. ������ for��(�Ϲ� for���� ������ (�ε����� ����))
		for (String k : h1) {
			String msg = k;
			System.out.println(msg);	
		}
		System.out.println("======================");
		
		
		
		// 2. iterator()
		Iterator<String> it =  h1.iterator(); // h1�� ���ʴ�� �����ϴ� �ְ� it��
		// h1�� ������ it�� ����
		// it���� ������ �ֳİ� ���
		while (it.hasNext()) {  // hasNext(): ���� ��ü�� �����ϸ� true, �������������� false
			String msg = (String)it.next(); // �ڿ� ������ �ִ��� Ȯ��
			// next(): ������ü�� return�ϰ� ���� ��ü�� �̵�
			System.out.println(msg);
		}
	}
}