package com.ict06.Thread;

import java.util.ArrayList;
import java.util.List;

public class Ex17_Car {
	// �÷��� : �ڵ������� �����ϴ� ����(���� â��)
	// List<String>  ==>  ���׸�Ÿ��
	private List<String> carList = null;
	
	// ������ : �ش� Ŭ������ ��ü�� �����Ǹ� carList�� �����Ѵ�.
	public Ex17_Car() {
		carList = new ArrayList<String>();
	}

	
	// getCar()�� ȣ���ϸ� �������� �ڵ����� ����	
	public String getCar() {
		String carName = null;
		
		// �������� 0,1,2�� ������ case�� ����� (�� ���� ����)
		switch ((int)(Math.random() * 3)) {
		case 0: carName = "SM5"; break;
		case 1: carName = "�ű׳ʽ�"; break;
		case 2: carName = "ī����"; break;
		}
		
		return carName;
	}
	
	// �Һ��ڰ� �ڵ����� ��� �޼ҵ�
	public synchronized String pop() {
		String carName = null;
		
		// â�� ��� ������ ~ 
		if (carList.size() == 0) {
			try {
				System.out.println("���� �����ϴ�. ����� ������ ��ٷ��ּ���!");
				// �Һ��ڰ� �Һ� �ϸ� �ȵǴ� �ð�!!!
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// ��� ���� ���
		carName = (String)carList.remove(carList.size() - 1); 
		// carList�� ���� ���߿� �� ������ ��� ������.(����)
		
		System.out.println("�մ��� ���� �簬���ϴ�.. �մ��� ������ �� �̸���=>\" "+ carName + "\"");
		
		return carName;
	}
	
	
	// �ڵ����� carList�� �ִ´�
	// push() ȣ���ϸ� carList(���� â��)�� ����
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("���� ����������ϴ�. �� �̸��� \" " + car + "\"");
		
		// â�� �ڵ����� 5���� �Ǹ� �Һ��ڿ��� �ǸŸ� ������.
		// ��� 0�϶� ����Ų ������(�Һ���)�� �غ����(����)�� �����Ŵ
		if (carList.size() == 5) {
			notify();
		}
	}

}
