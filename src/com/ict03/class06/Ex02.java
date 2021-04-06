package com.ict03.class06;

enum Type {
	WALKING, RUNNING, TRACKING, HIKING
}

public class Ex02 {
	String name;
	int size;
	Type type;
	
	public static void main(String[] args) {
		//오 류
		// System.out.println(name); 
		//객체를 만들어서 사용할 수 있다
		
		Ex02 shoes = new Ex02();
		shoes.name = "나이키";
		shoes.size = 230;
		shoes.type = Type.RUNNING;
		System.out.println("브랜드 : " + shoes.name);
		System.out.println("사이즈 : " + shoes.size);
		System.out.println("타입 : " + shoes.type);
	}
}
