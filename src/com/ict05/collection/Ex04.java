package com.ict05.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex04 {
	public static void main(String[] args) {
		// 로또 번호 추첨 1~45 (6자리, 랜덤, 중복x)

		HashSet<Integer> lotto = new HashSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int k = (int) (Math.random() * 45) + 1; // 1~45

			boolean b = lotto.add(k);
			
			if (!b) { // 중복되었을 때
				i--;
			}

		}
		System.out.println(lotto);
		
		// TreeSet은 내부에서 항상 오름 차순 정렬 상태를 유지
		TreeSet<Integer> lotto2 = new TreeSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int k = (int) (Math.random() * 45) + 1; // 1~45

			boolean b = lotto2.add(k);
			
			if (!b) { // 중복되었을 때
				i--;
			}

		}
		System.out.println(lotto2);
	}
}
