package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 컴퓨터와 가위,바위,보 게임하기
		// 컴터는 랜덤으로 가위(0), 바위(1), 보(2) 를 갖는다.
		// 사용자가 가위, 바위, 보를 선택해서 컴퓨터와 게임을 한다.
		
		
		Scanner scan = new Scanner(System.in);
		int totalcount = 0; // 전체횟수
		int vcount = 0; // 이긴횟수
		Random ran = new Random();
		
		esc:
		while (true) {
			totalcount++; // 전체횟수 +1씩 증가
			
			// 컴터 랜덤 // 특정 범위를 지정하는 경우
			int comp = (int)(Math.random() * 3);
			
			System.out.print("하나를 선택하세요(1.가위  2.바위  3.보) >>> ");
			int num = scan.nextInt();
			
			if (comp == 0) { // 가위
				if (num ==1) {
					System.out.println("비겼습니다");
				} else if (num ==2) {
					vcount++;
					System.out.println("이겼습니다");
				} else if (num ==3) {
					System.out.println("졌습니다");
				}
				
			} else if (comp == 1) { // 바위
				if (num ==1) {
					System.out.println("졌습니다");
				} else if (num ==2) {
					System.out.println("비겼습니다");
				} else if (num ==3) {
					vcount++;
					System.out.println("이겼습니다");
				}

			} else if (comp == 2) { // 보
				if (num ==1) {
					vcount++;
					System.out.println("이겼습니다");
				} else if (num ==2) {
					System.out.println("졌습니다");
				} else if (num ==3) {
					System.out.println("비겼습니다");
				}

			}
			
			
/*			int com = ran.nextInt(3)+1;
			if (num > com) {
				System.out.println("이겼습니다");
			} else if (num < com) {
				System.out.println("졌습니다");
			} else if (num == com) {
				System.out.println("비겼습니다");
			}
*/			
			while(true ) {
				System.out.print("계속 하시겠습니까?(Y.계속하기 / N.그만하기) >>> ");
				String close = scan.next();
				if(close.equalsIgnoreCase("y")) {
					continue esc;
				} else if (close.equalsIgnoreCase("n")) {
					break esc;
				} else {
					continue;
				}
			}
		}
		
		System.out.println("[게임이 종료되었습니다.]");
		System.out.println("당신의 도전 횟수 : " + totalcount + ", 승률 : " + (vcount/(totalcount*1.0))*100 + "%");
		
		
		System.out.println("===================================================");
		
		
		// 퀴즈) 010-7777-9999 -> 010-XXXX-9999, 010-7777-XXXX
		String quiz = "010-7777-9999";
		String[] answer = quiz.split("-"); // - 기준으로 배열을 생성해서 집어넣음
		
		answer[2] = answer[2].replace(answer[2], "XXXX");
		//answer[1] = answer[1].replace(answer[1], "-XXXX-");
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}
		System.out.println();
		
		
		
		
/*		//위치값 찾기
		String s1 = phone.substring(phone.indexOf('-')+1, phone.lastIndexOf('-'));
		String s2 = phone.replace(s1, "XXXX"); //XXXX-9999
		System.out.println(s2);
		
		String s3 = phone.substring(phone.indexOf(phone.indexOf('-')+1)+1, phone.lastIndexOf(12));
		String s4 = phone.replace(phone, "XXXX");//7777-XXXX
		
		//치환
*/		//String s4 = phone.replace(phone, "XXXX");//7777-XXXX
		
	}
}
