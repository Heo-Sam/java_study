package com.ict11.test;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[5][5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("번호: ");
			int no = scan.nextInt();
			System.out.print("국어: ");
			int kor = scan.nextInt();
			System.out.print("영어: ");
			int eng = scan.nextInt();
			System.out.print("수학: ");
			int math = scan.nextInt();
			
			int sum = kor + eng + math;
			
			int avg = sum / 3;
			int hak = 0;
			if (avg >= 90) {
				hak = 'A';
			} else if (avg >= 80) {
				hak = 'B';
			} else if (avg >= 70) {
				hak = 'C';
			} else {
				hak = 'D';
			}
			
			int rank = 1;
			int[] person = new int [5];
			person[0] = no;
			person[1] = sum;
			person[2] = avg;
			person[3] = hak;
			person[4] = rank;
			
			arr[i] = person;
		}
		
		// 문제해결 시나리오
		
		// 1. 순위 rank
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				// if(i==j) continue;
				if(arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		}

		// 2. 총점으로 정렬
		int[] temp = new int[5];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j > arr.length; j++) {
				if (arr[i][1] < arr[j][1]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		

		// 3. 출력하기
		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
