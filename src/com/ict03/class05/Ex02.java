package com.ict03.class05;

public class Ex02 {

	public static void main(String[] args) {
		// Ex01 멤버필드들이 static이라는 증거
		// 객체생성없이 클래스 이름으로 접근가능
		
		System.out.println(Ex01.su1);
		System.out.println(Ex01.su2);
		System.out.println(Ex01.su3);
		System.out.println(Ex01.su4);
		
/*		// 값 변경이 안됨 => final
		System.out.println(Ex01.su1++);
		System.out.println(Ex01.su2++);
		System.out.println(Ex01.su3++);
		System.out.println(Ex01.su4++);
*/
		
	}

}
