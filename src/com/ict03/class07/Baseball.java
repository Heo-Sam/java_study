package com.ict03.class07;

import java.util.Random;
import java.util.Scanner;

public class Baseball {
	/*
	 * ���� 3�ڸ�[1]�� ���ڸ� ���Ƿ� ���� �� ���ο��� 3�ڸ��� ���ڸ� �ҷ��� ����� Ȯ���Ѵ� �׸��� �� ����� ���� ��밡 ���� ���ڸ�
	 * ������ �� ������. ���Ǵ� ���ڴ� 0~9���� ���� �ٸ� ���� ���ڴ� ������ ��ġ�� Ʋ���� ���� �� ���ڿ� ��ġ�� ���� ������ ��Ʈ����ũ
	 * ���ڿ� ��ġ�� ���� Ʋ���� �ƿ�
	 * 
	 * ��������: 9������ or 3�ƿ�
	 */

	public static void main(String[] args) {

		int[] com = new int[3];
		int[] input = new int[3];

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int ball = 0;
		int strike = 0;
		int out = 0;
		int chance = 0;

		// com[]�� �������� ����
		for (int i = 0; i < com.length; i++) {
			com[i] = ran.nextInt(10); // 0~9

			// �ߺ�����
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					// i���� 1 ���ҽ��� �ι�° for���� �������� ��
					// ù��° for���� ���������� ���� i++�ǰ�
					// �ٽ� ������ ������ �� if������ ���ǽ��� ����
					i--;
					break;
				}
			}
		}

		
		while (chance < 9) {
			chance++;
			
			ball = 0;
			strike = 0;
			
			System.out.println("**"+chance+"��° ����**");
			// ���� �Է¹ޱ�
			for (int i = 0; i < input.length; i++) {
				System.out.print((i + 1) + "��° �� �Է�: ");
				input[i] = scan.nextInt();
			}

			// * ���ڴ� ������ ��ġ�� Ʋ���� ���� ��
			// * ���ڿ� ��ġ�� ���� ������ ��Ʈ����ũ
			// * ���ڿ� ��ġ�� ���� Ʋ���� �ƿ�
			// ��������: 9������ or 3�ƿ�

			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < input.length; j++) {
					if (com[i] == input[j]) {
						ball++;
						if (i == j) {
							strike++;
						}
					} // if ��
				} // ���� for ��
			} // �ٱ� for��
			
			
			
			if (ball == 0 && strike == 0) {
				out++;
				System.out.println(out + "�ƿ��Դϴ�.");
				if (out == 3) break;
			} else if (strike != 0) {
				if(strike == 3) {
					System.out.println("�����Դϴ�."); break;				
				} else {
					System.out.println(strike + "strike");					
				}
			} else if (ball != 0) {
				System.out.println(ball + "ball ");
			} else  { 
				System.out.println(ball + "ball, " + strike + "strike");
			} 
			System.out.println();
		} // while ��
		
		
		System.out.println("========================");
		System.out.print("**�������ϴ�.** ������ : ");
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i] + " ");
		}
		System.out.println("�Դϴ�.");
	}

}
