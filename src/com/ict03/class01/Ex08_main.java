package com.ict03.class01;

import java.util.Scanner;

public class Ex08_main {

	public static void main(String[] args) {
		Ex08 coffee = new Ex08();
		coffee.setName("Ŀ������");
		coffee.setPrice(1800);
		
		Ex08 ion = new Ex08();
		ion.setName("�̿�����");
		ion.setPrice(1500);
		
		Ex08 cola = new Ex08();
		cola.setName("ź������");
		cola.setPrice(2000);
		
		Ex08 juice = new Ex08();
		juice.setName("��������");
		juice.setPrice(2200);
		
		// �迭�� ����
		//�ڷ���[] �̸� = new �ڷ���[����];
		Ex08[] arr = {coffee, ion, cola, juice};
		
		/*
		Ex08[] arr = new Ex08[4];
		arr[0] = coffee;
		arr[1] = ion;
		arr[2] = cola;
		arr[3] = juice;
		*/
		
		
		
		/*
		// arr[]�� �����ִ� �̸�, ���ݵ��� �������
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + ", " + arr[i].getPrice());
		}
		*/
		
		// ���� ����
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int input = scan.nextInt();
		if(input < 1500) {
			System.out.println("�ݾ� ����");
		}else {
			System.out.println("1.Ŀ ��\t2.�� ��\t3.ź ��\t4.�� ��");
			for (int i = 0; i < arr.length; i++) {
				// ������ �ݾ��� ũ�ų� ���ƾ� ���Ḧ ���� �� ����!!
				if(arr[i].getPrice() <= input) {
					System.out.print("O\t");
				}else {
					System.out.print("X\t");
				}
			}
		}
		System.out.println();
		
		
	}

}
