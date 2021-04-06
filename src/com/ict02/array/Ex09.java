package com.ict02.array;

public class Ex09 {
	public static void main(String[] args) {
		int[][] persons = new int[5][];
		
		// ��ȣ[0], ����[1], ���[2], ����[3], ����[4]
		int[] person01 = {1, 270, 90, 'A', 1};
		int[] person02 = {2, 210, 70, 'C', 1};
		int[] person03 = {3, 180, 60, 'F', 1};
		int[] person04 = {4, 300, 100, 'A', 1};
		int[] person05 = {5, 285, 95, 'A', 1};
		
		persons[0] = person01;
		persons[1] = person02;
		persons[2] = person03;
		persons[3] = person04;
		persons[4] = person05;
		
		//������ ���Ϸ��� ������ ���� �� ������ ����
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons.length; j++) {
				if (persons[i][1] < persons[j][1]) { 
					persons[i][4]++;
				}
			}
		}
		
		
		// ������ ���� �����ϱ�
		// �ӽ������� �迭�� �ʿ��ϴ�
		int[] tmp = new int[5]; // ���� ������ ���� �ӽ� ������ �迭 ����
		for (int i = 0; i < tmp.length-1; i++) {
			for (int j = i+1; j < tmp.length; j++) {
				// i�� Ŭ �� ���� ����
				if (persons[i][4] > persons[j][4]) {
					tmp = persons[i];
					persons[i] = persons[j];
					persons[j] = tmp;
				}
			}
		}
		
		
		//���
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons[i].length; j++) {
				//���� ����ȯ
				if (j == 3) {
					System.out.print((char)persons[i][j] + "  "); //j�� 3�϶� �� ��ȯ
				} else {					
					System.out.print(persons[i][j] + "  "); //3�� �ƴ� ��� �׳� ���
				}
			}
			System.out.println();
		}
		
		
	}

}