package com.ict04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 다중 catch문 : try문의 예외 발생이 여러가지의 예외가 발생할 경우
		// 주의사항: Exception을 사용할 때는 반드시 아래쪽 catch문에서 사용한다.
		
		Scanner scan = new Scanner(System.in);
/*		
		try {
			int var = 27;
			System.out.print("정수 입력 : ");
			int su = scan.nextInt();
			System.out.println("정답 : " + (var/su));
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력하세요");
		} catch (Exception e) {
			System.out.println("0으로는 숫자를 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("제대로 입력하세요.");
		}
*/		
		try {
			int var = 27;
			System.out.print("정수 입력 : ");
			int su = scan.nextInt();
			System.out.println("정답 : " + (var/su));			
		} catch (Exception e) {
			System.out.println("제대로 입력하세요. " + e);
		}
		
		System.out.println("끝났습니다.");
	}

}
