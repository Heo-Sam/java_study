package com.ict03.class01;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {
		// 5���� �̸�, ����, ����, ���� ������ �޾Ƽ�
		// �̸�, ����, ���, ����, ������ ���ϰ� ��������
		
		// �Է� �޾Ƽ� 
		Scanner scan = new Scanner(System.in);
		// Ŭ���� �迭�� ����
		Ex12[] arr = new Ex12[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�̸� : ");
			String name = scan.next();
			System.out.print("���� : ");
			int kor = scan.nextInt();
			System.out.print("���� : ");
			int eng = scan.nextInt();
			System.out.print("���� : ");
			int math = scan.nextInt();
			
			Ex12 person = new Ex12(name, kor, eng, math);
			arr[i] = person;

		}
		
		// ���� ���ϱ�
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) continue;
				if (arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank()+1);
				}
			}
		}
		
		// �����ϱ�
		// �ڸ��� �����ϱ� ���� �ӽ������� ������ �������
		Ex12 temp = new Ex12();
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		// ����ϱ�
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + " ");
			System.out.print(arr[i].getSum() + " ");
			System.out.print(arr[i].getAvg() + " ");
			System.out.print(arr[i].getHak() + " ");
			System.out.println(arr[i].getRank() + " ");
		}
	}

}
