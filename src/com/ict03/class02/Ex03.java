package com.ict03.class02;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		// 랜덤: Math.random(), Random()
		
		// 1. Random 클래스
		Random ran = new Random();
		
		// 각종 자료형의 데이터를 무작위로 추출
		System.out.println("boolean형 : " + ran.nextBoolean());
		System.out.println("int형 : " + ran.nextInt());
		System.out.println("long형 : " + ran.nextLong());
		
		// 실수 형태는 0.0 이상 ~ 1.0 미만
		System.out.println("float형 : " + ran.nextFloat());
		System.out.println("double형 : " + ran.nextDouble());
		System.out.println();
		
		// 특정 범위를 지정해서 사용하는 방법
		//  1) nextInt(정수) : 0 ~ 정수 전까지 난수 발생
		int s1 = ran.nextInt(3); //0~2
		System.out.println(s1);
		
		//  2) (int)(nextDouble() * 숫자) : 0 ~ 정수 전까지 난수 발생
		int s2 = (int)(ran.nextDouble() * 3); // 0~2
		System.out.println(s2);
		System.out.println();
		
		
		// 2. Math 클래스 : 생성자가 없다.
		//					메소드들이 static이다.
		//					객체생성 없이 호출가능
		//	1) random() : 0.0 ~ 1.0 미만
		System.out.println(Math.random());
		
		//	2) 특정 범위를 지정하는 경우
		int s3 = (int)(Math.random() * 3);
		System.out.println(s3);
		
		//	3) abs : 절대값 반환
		System.out.println(Math.abs(100)); // 100
		System.out.println(Math.abs(-100)); // 100
		
		//	4) ceil(올림), round(반올림), floor(버림)
		System.out.println("올림 : " + Math.ceil(3.34));
		System.out.println("올림 : " + Math.ceil(3.55));
		
		System.out.println("버림 : " + Math.floor(3.34));
		System.out.println("버림 : " + Math.floor(3.55));
		
		System.out.println("반올림 : " + Math.round(3.34));
		System.out.println("반올림 : " + Math.round(3.55));
		System.out.println();
		
		// 5) max : 둘 중 큰 값 찾기
		//	  min : 둘 중 작은 값 찾기
		System.out.println("max : " + Math.max(44.9, 45));
		System.out.println("min : " + Math.min(-44.9, -45));
		
		// 6) pow(double a, double b) : 제곱
		System.out.println(Math.pow(2, 3)); // 2의 3승
		System.out.println(Math.pow(3, 2)); // 3의 2승
		
		
	}
	
}
