package com.ict02.array;

public class Ex09 {
	public static void main(String[] args) {
		int[][] persons = new int[5][];
		
		// 번호[0], 총점[1], 평균[2], 학점[3], 순위[4]
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
		
		//순위를 구하려면 총점을 비교한 후 순위를 구함
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons.length; j++) {
				if (persons[i][1] < persons[j][1]) { 
					persons[i][4]++;
				}
			}
		}
		
		
		// 순위에 따라 정렬하기
		// 임시저장할 배열이 필요하다
		int[] tmp = new int[5]; // 순위 정렬을 위해 임시 저장할 배열 생성
		for (int i = 0; i < tmp.length-1; i++) {
			for (int j = i+1; j < tmp.length; j++) {
				// i가 클 때 순위 변동
				if (persons[i][4] > persons[j][4]) {
					tmp = persons[i];
					persons[i] = persons[j];
					persons[j] = tmp;
				}
			}
		}
		
		
		//출력
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons[i].length; j++) {
				//학점 형변환
				if (j == 3) {
					System.out.print((char)persons[i][j] + "  "); //j가 3일때 형 변환
				} else {					
					System.out.print(persons[i][j] + "  "); //3이 아닐 경우 그냥 출력
				}
			}
			System.out.println();
		}
		
		
	}

}
