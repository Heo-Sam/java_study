package com.ict02.array;

public class Ex04 {
	public static void main(String[] args) {
		// �������ϱ�
		// 1. ��� ����� ������ 1������ �ʱ�ȭ�Ѵ�.
		// 2. ��� ������ ���ؾ� �Ѵ�.
		//	��, �ڱ� �ڽ��� ���� �ʿ䰡 ����.(i=j) => continue ����ϸ� ��
		// 3. ��(i)���� ��(j)�� ũ�� �� ����(i)�� �����Ѵ�.
		
		int[] su = {270, 265, 280, 290, 285};
		int[] rank = {1, 1, 1, 1, 1}; // 1������ �ʱ�ȭ
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				if(su[i] == su[j]) continue; // �ڱ� �ڽ��� ���� �ʿ䰡 ����. continue�� ���� ����Ƚ���� �پ��
				if(su[i] < su[j]) {
					rank[i]++;
				}
			}
		}
		
		// ���
		for (int i = 0; i < rank.length; i++) {
			System.out.println(rank[i]);
		}
	}

}
