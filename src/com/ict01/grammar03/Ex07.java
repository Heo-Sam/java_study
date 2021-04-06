package com.ict01.grammar03;

import java.util.Scanner;

class Ex07 {
	public static void main(String[] args) {
	// Scanner 클래스 알아보기
	// Scanner 의 소속은 java.util.Scanner 이다
	// java.lang 안에 소속된 클래스들은 마음대로 사용했지만
	// 이외의 클래스는 소속표시를 해야한다. (import)

	// 클래스 안에는 Constructor(생성자), Methods(메소드), Field(필드)
	// method => 동작, 기능, 하는 것 

	// 키보드에 입력된 내용이 sc에 저장된다,
	   Scanner sc = new Scanner(System.in);
	   System.out.print("너의 이름은 : ");

	// 저장된 정보를 가져오자(가지고 온 정보를 String으로 만들자)
	   String name = sc.next();

	// 저장된 정보를 가져오자(가지고 온 정보를 int으로 만들자)
	   System.out.print("국어 점수 : ");
	   int kor = sc.nextInt();

	   System.out.print("영어 점수 : ");
	   double eng = sc.nextInt ();

	   System.out.print("수학 점수 : ");
	   int math = sc.nextInt();

	   double sum = kor + eng + math;
	   System.out.println("총점수 : " + sum);

	
	// 들어온 정보를 double로 기억
	   System.out.print("당신의 키 : ");
	   double height = sc.nextDouble();
	   System.out.println(height);

	// 들어온 정보를 boolean으로 기억
	   System.out.print("당신은 남성입니까?(true/false)");
	   boolean gender = sc.nextBoolean();
	   String str = gender ? "남성입니다." : "여성입니다";
	   System.out.println(str);
	}

}