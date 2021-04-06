package com.ict05.collection;

import java.util.Iterator;
import java.util.Stack;

public class Ex05 {
	// * List �������̽��� ������ Ŭ������: Stack, ArrayList, Vector;
	
	// * Stack(����): LIFO (Last In First Out) : �������� ���� �����Ͱ� �� ó������ ������.
	// �ֿ� �޼ҵ�
	// add, push, addElement => �߰�
	// add(index, E) => ����(�߰��� ���� ���� ��)
	
	// pop : �� ���� �����ϴ� ��ü�� ��ȯ�ϰ� *����*
	// peek : �� ���� �����ϴ� ��ü�� ��ȯ�ϰ� �������� ����(���ѷ��� ����)
	
	// search : �˻�(������, 1����)
	// indexOf : �˻�(����, 0����) => �迭���
	// elementAt(index) : ��ġ���� �޾Ƽ� �ش� ��ü ���� 
	// get(index) : ��ġ���� �޾Ƽ� �ش� ��ü ���� 
	
	// firstElement : �� ó�� ��� ����
	// lastElement : �� ������ ��� ����
	// setElement(Element, index) : ġȯ
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.add("�Ѹ�");
		stack.addElement("����");
		stack.push("������");
		System.out.println(stack);
		
		 // ����
		stack.add(1, "�����");
		System.out.println(stack);
		
		stack.add(0, "��ġ");
		System.out.println(stack);
		
		stack.add(1, "�ٲ�"); // ���� ����ʿ� �ߺ�x
		System.out.println(stack);
		
		stack.add(1,"�Ѹ�"); // �ڿ� �����Ͱ� �ߺ��̸� ���� �ߺ� ��
		System.out.println(stack);
		System.out.println("========================");
		
		
		// �������� ���� ��ü ����(ó������ ���� ��ü ����)
		//					: pop(����), peek(����x => for�� ����ϸ� ���ѷ���)
		System.out.println(stack.peek()); // �������� �Ӿ�?
		System.out.println(stack); // �������̾�
		
		System.out.println(stack.pop() + "�̰� �̰� �����Ұž�"); // �������� �Ӿ�?
		System.out.println(stack); // �������ε� �˷��ְ� �����Ҳ���
		
		// contains, indexOf, search, get, elementAt, firstElement, lastElement
		if (stack.contains("�Ѹ�")) { // �Ѹ��ִ�?
			System.out.println("������");		
			// �ش� ��ü�� ��ġ��
			System.out.println(stack.indexOf("�Ѹ�") + "��° ��ġ"); // ���ʿ������� 0,1,2...
			System.out.println(stack.search("�Ѹ�") + "��° ��ġ"); // �����ʿ������� 1,2,3...
			// �ش� ��ġ�� ��ü ������
			System.out.println("get(1)" + stack.get(1)); // get�� �迭������� index���� ���ʿ������� 0,1,2...
			System.out.println("get(stack.indexOf()) : " + stack.get(stack.indexOf("�Ѹ�")) ); 
			System.out.println("elementAt(stack.indexOf()) : " + stack.elementAt(stack.indexOf("�Ѹ�")) );
			System.out.println(stack.firstElement());
			System.out.println(stack.lastElement());
		} else {
			System.out.println("�������� ����");
		}
		System.out.println("========================");
		
		// size(����), set(ġȯ), setElementAt(ġȯ)
		System.out.println(stack.size()+"��Ұ� �����մϴ�.");
		// index�� 3��
		//stack.set(3, "������");
		stack.setElementAt("������", 3);
		System.out.println(stack);
		System.out.println("========================");
		
		
		//�ϳ��� ������ : ������for��, iterator() => ������ �״�� ���� / pop() => ������ ����
		for (String k : stack) {
			System.out.println(k);
		}
		System.out.println(stack.size()+"��Ұ� �����մϴ�.");
		System.out.println("========================");
		
		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			String msg = (String) it.next();
			System.out.println(msg);
		}
		System.out.println(stack.size()+"��Ұ� �����մϴ�.");
		System.out.println("========================");
		
		while (! stack.isEmpty()) {
			String k = stack.pop();
			System.out.println(k + "������, ũ��� " + stack.size());
		}
		
		
	}
	
	
	

}
