package com.ict02.array;

public class Ex04 {
	public static void main(String[] args) {
		// 순위구하기
		// 1. 모든 사람의 순위를 1등으로 초기화한다.
		// 2. 모든 사람들과 비교해야 한다.
		//	단, 자기 자신은 비교할 필요가 없다.(i=j) => continue 사용하면 됨
		// 3. 나(i)보다 남(j)이 크면 내 순위(i)를 증가한다.
		
		int[] su = {270, 265, 280, 290, 285};
		int[] rank = {1, 1, 1, 1, 1}; // 1등으로 초기화
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				if(su[i] == su[j]) continue; // 자기 자신은 비교할 필요가 없다. continue를 쓰면 실행횟수가 줄어듬
				if(su[i] < su[j]) {
					rank[i]++;
				}
			}
		}
		
		// 출력
		for (int i = 0; i < rank.length; i++) {
			System.out.println(rank[i]);
		}
	}

}
