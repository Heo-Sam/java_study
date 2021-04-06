package com.ict03.class02;

public class Ex05 {
	public static void main(String[] args) {
		// StringBuffer / SringBuilder => 문자열을 빈번히 수정,추가,삭제할 경우 사용을 권장한다
		
		String msg = "hello";
		System.out.println(msg);
		
		// String은 불변의 속성을 가지고 있어서 메모리에 새로운 영역을 차지해서 hello java를 새로 만든다 => 메모리에 쓰레기들이 생김
		msg = msg + "java";
		System.out.println(msg);
		
		StringBuffer sb = new StringBuffer("welcome");
		System.out.println(sb);
		
		// StringBuffer는 가변의 속성을 가지고 있어서 현재 영역에서 내용을 추가한다. 		
		// 내용추가: append("문자열");
		sb.append("JAVA");
		
		System.out.println(sb.toString());
		
		
	}

}
