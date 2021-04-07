package com.ict03.class07;

import java.util.Random;
import java.util.Scanner;

public class Baseball {
	/*
	 * 각자 3자리[1]의 숫자를 임의로 정한 뒤 서로에게 3자리의 숫자를 불러서 결과를 확인한다 그리고 그 결과를 토대로 상대가 적은 숫자를
	 * 예상한 뒤 맞힌다. 사용되는 숫자는 0~9까지 서로 다른 숫자 숫자는 맞지만 위치가 틀렸을 때는 볼 숫자와 위치가 전부 맞으면 스트라이크
	 * 숫자와 위치가 전부 틀리면 아웃
	 * 
	 * 종료조건: 9번까지 or 3아웃
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

		// com[]에 랜덤숫자 저장
		for (int i = 0; i < com.length; i++) {
			com[i] = ran.nextInt(10); // 0~9

			// 중복방지
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					// i값을 1 감소시켜 두번째 for문을 빠져나온 후
					// 첫번째 for문의 증감식으로 가서 i++되고
					// 다시 난수를 생성한 후 if문에서 조건식을 만남
					i--;
					break;
				}
			}
		}

		
		while (chance < 9) {
			chance++;
			
			ball = 0;
			strike = 0;
			
			System.out.println("**"+chance+"번째 도전**");
			// 숫자 입력받기
			for (int i = 0; i < input.length; i++) {
				System.out.print((i + 1) + "번째 수 입력: ");
				input[i] = scan.nextInt();
			}

			// * 숫자는 맞지만 위치가 틀렸을 때는 볼
			// * 숫자와 위치가 전부 맞으면 스트라이크
			// * 숫자와 위치가 전부 틀리면 아웃
			// 종료조건: 9번까지 or 3아웃

			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < input.length; j++) {
					if (com[i] == input[j]) {
						ball++;
						if (i == j) {
							strike++;
						}
					} // if 끝
				} // 안쪽 for 끝
			} // 바깥 for끝
			
			
			
			if (ball == 0 && strike == 0) {
				out++;
				System.out.println(out + "아웃입니다.");
				if (out == 3) break;
			} else if (strike != 0) {
				if(strike == 3) {
					System.out.println("정답입니다."); break;				
				} else {
					System.out.println(strike + "strike");					
				}
			} else if (ball != 0) {
				System.out.println(ball + "ball ");
			} else  { 
				System.out.println(ball + "ball, " + strike + "strike");
			} 
			System.out.println();
		} // while 끝
		
		
		System.out.println("========================");
		System.out.print("**끝났습니다.** 정답은 : ");
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i] + " ");
		}
		System.out.println("입니다.");
	}

}
