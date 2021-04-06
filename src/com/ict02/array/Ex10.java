package com.ict02.array;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 번호, 국어, 영어, 수학점수를 입력받아서 (5명)
		// 번호, 총점, 평균, 학점, 순위를 구하고 정렬하자
		
		int[][] arr = new int[5][5];

		
		//입력
		for (int i = 0; i < arr.length; i++) {
			System.out.print("번호 입력 : ");
			int num = scan.nextInt();
			System.out.print("국어 점수 : ");
			int kor = scan.nextInt();
			System.out.print("영어 점수 : ");
			int eng = scan.nextInt();
			System.out.print("수학 점수 : ");
			int math = scan.nextInt();
			
			int sum = kor + eng + math;
			int avg = sum / 3;
			
			int hak = 0;
			if (avg >= 90) {
				hak = 'A';
			} else if (avg >= 80){
				hak = 'B';
			} else if (avg >= 70){
				hak = 'C';
			} else {
				hak = 'F';
			}
			
			int rank = 1;
			
		/*	//2차원 배열에 바로 데이터 입력
			arr[i][0] = num;
			arr[i][1] = sum;
			arr[i][2] = avg;
			arr[i][3] = hak;
			arr[i][4] = rank; */
			
			//1차원 배열을 만들어서 데이터 입력
			int[] person = new int[5];
			person[0] = num;
			person[1] = sum;
			person[2] = avg;
			person[3] = hak;
			person[4] = rank;
			arr[i] = person;
			
		}
		
		//순위구하기 총점 비교 후 rank 데이터++
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i==j) continue;
				if (arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		}
		
		//순위로 정렬
		int[] temp = new int[5];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 3) {
					System.out.print((char)arr[i][j]+" ");
				} else {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
