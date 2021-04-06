package com.ict03.class03;

public class Ex15 extends Ex14 {
	
	String name = "홍일점";
	int id = 2410;
	
	public Ex15() {
		super("일지매", 30); // 기본생성자에는 숨겨져있음
		System.out.println("자식 클래스 생성자 : " + this);
		name = "홍두께";
		id = 1004;
	}

	public Ex15(String name) {
		super("태권브이", 19);
		this.name = name;
	}
	
	public void prn() {
		String name = "홍시";
		
		// 지역, 전역, 부모 모두 같은 변수이름을 가지고 있다.
		//	=> 이때는 반드시 구분해야 함
		System.out.println("지역변수 이름 : " + name);
		System.out.println("전역변수 이름 : " + this.name);
		System.out.println("부모변수 이름 : " + super.name);
		
		// 부모만 가지고 있는 변수
		//	=> 구분하지 않아도 됨
		System.out.println("부모만 가지고 있는 변수 : " + age);
		System.out.println("부모만 가지고 있는 변수 : " + this.age);
		System.out.println("부모만 가지고 있는 변수 : " + super.age);
		
		// 자식만 가지고 있는 변수
		System.out.println("자식만 가지고 있는 변수 : " + id);
		System.out.println("자식만 가지고 있는 변수 : " + this.id);
		// System.out.println("자식만 가지고 있는 변수 : " + super.id);
		// 							=> 오류: 부모에는 id변수가 없음
	}
	
	

}
