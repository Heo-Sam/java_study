package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// ��ǻ�Ϳ� ����,����,�� �����ϱ�
		// ���ʹ� �������� ����(0), ����(1), ��(2) �� ���´�.
		// ����ڰ� ����, ����, ���� �����ؼ� ��ǻ�Ϳ� ������ �Ѵ�.
		
		
		Scanner scan = new Scanner(System.in);
		int totalcount = 0; // ��üȽ��
		int vcount = 0; // �̱�Ƚ��
		Random ran = new Random();
		
		esc:
		while (true) {
			totalcount++; // ��üȽ�� +1�� ����
			
			// ���� ���� // Ư�� ������ �����ϴ� ���
			int comp = (int)(Math.random() * 3);
			
			System.out.print("�ϳ��� �����ϼ���(1.����  2.����  3.��) >>> ");
			int num = scan.nextInt();
			
			if (comp == 0) { // ����
				if (num ==1) {
					System.out.println("�����ϴ�");
				} else if (num ==2) {
					vcount++;
					System.out.println("�̰���ϴ�");
				} else if (num ==3) {
					System.out.println("�����ϴ�");
				}
				
			} else if (comp == 1) { // ����
				if (num ==1) {
					System.out.println("�����ϴ�");
				} else if (num ==2) {
					System.out.println("�����ϴ�");
				} else if (num ==3) {
					vcount++;
					System.out.println("�̰���ϴ�");
				}

			} else if (comp == 2) { // ��
				if (num ==1) {
					vcount++;
					System.out.println("�̰���ϴ�");
				} else if (num ==2) {
					System.out.println("�����ϴ�");
				} else if (num ==3) {
					System.out.println("�����ϴ�");
				}

			}
			
			
/*			int com = ran.nextInt(3)+1;
			if (num > com) {
				System.out.println("�̰���ϴ�");
			} else if (num < com) {
				System.out.println("�����ϴ�");
			} else if (num == com) {
				System.out.println("�����ϴ�");
			}
*/			
			while(true ) {
				System.out.print("��� �Ͻðڽ��ϱ�?(Y.����ϱ� / N.�׸��ϱ�) >>> ");
				String close = scan.next();
				if(close.equalsIgnoreCase("y")) {
					continue esc;
				} else if (close.equalsIgnoreCase("n")) {
					break esc;
				} else {
					continue;
				}
			}
		}
		
		System.out.println("[������ ����Ǿ����ϴ�.]");
		System.out.println("����� ���� Ƚ�� : " + totalcount + ", �·� : " + (vcount/(totalcount*1.0))*100 + "%");
		
		
		System.out.println("===================================================");
		
		
		// ����) 010-7777-9999 -> 010-XXXX-9999, 010-7777-XXXX
		String quiz = "010-7777-9999";
		String[] answer = quiz.split("-"); // - �������� �迭�� �����ؼ� �������
		
		answer[2] = answer[2].replace(answer[2], "XXXX");
		//answer[1] = answer[1].replace(answer[1], "-XXXX-");
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}
		System.out.println();
		
		
		
		
/*		//��ġ�� ã��
		String s1 = phone.substring(phone.indexOf('-')+1, phone.lastIndexOf('-'));
		String s2 = phone.replace(s1, "XXXX"); //XXXX-9999
		System.out.println(s2);
		
		String s3 = phone.substring(phone.indexOf(phone.indexOf('-')+1)+1, phone.lastIndexOf(12));
		String s4 = phone.replace(phone, "XXXX");//7777-XXXX
		
		//ġȯ
*/		//String s4 = phone.replace(phone, "XXXX");//7777-XXXX
		
	}
}
