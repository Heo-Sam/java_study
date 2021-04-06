package com.ict02.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Ex03 {
	public static void main(String[] args) {
		// 배열 정렬하기
		int[] su = {3,4,9,5,6,1,7,2,10,8};
		int temp = 0; // 자리변경을 위한 변수
		
		for (int i = 0; i < su.length-1; i++) { //배열의 마지막 전까지가야 마지막 데이터와 비교할 수 있음
			for (int j = i+1; j < su.length; j++) {
				//i보다 j가 크면 자리를 변경해야함(내림차순): su[i] <  su[j]
				//i보다 j가 작으면 자리를 변경해야함(오름차순): su[i] >  su[j]
				if(su[i] >  su[j]) {
					temp = su[j];
					su[j] = su[i];
					su[i] = temp;
				}
			}
		}
		
		//출력
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		
	    System.out.println("=======================================");
		
		int[] su2 = {3,4,9,5,6,1,7,2,10,8};
		//sort메소드는 해당 배열을 오름차순하는 기능이당
		Arrays.sort(su2);
		
		for (int i = 0; i < su2.length; i++) {
			System.out.println(su2[i]);
		}
		
		System.out.println("=======================================");
		
		
		// Arrays.sort(배열, Collections.reversOrder());
		// Integer[] => 나중에 배움!
		// 클래스를 자료형 배열로 사용 (참조 자료형 배열일 때 내림차순 가능)
		Integer[] su3 = {3,4,9,5,6,1,7,2,10,8};
		Arrays.sort(su3, Collections.reverseOrder());
		for (int i = 0; i < su3.length; i++) {
			System.out.println(su3[i]);
		}
		
	}

}
