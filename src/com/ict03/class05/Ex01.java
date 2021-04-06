package com.ict03.class05;


public interface Ex01 {
	// 인터페이스(interface): 서비스를 제공하는 목록과 같은 것이다.
	//						상수와 추상메소드들로 이루어져 있다.
	//						생성자가 없다.(객체생성 불가) => 실제 사용 못함 => 다중상속 가능
	//						실제 사용하기 위해서는 인터페이스를 상속받은 클래스가 있고
	//						상속받은 클래스를 사용하는 것이다.
	//	** '인터페이스가 같다'라는 말은 '대체(호환)가 가능하다'라는 뜻이다.
	
	//	인터페이스는 상수와 추상메소드만 가지고 있다.
	final int su1 = 10;
	static final int su2 = 20;
	int su3 = 30;
	static int su4 = 40;
	// 위 멤머필드들은 모두 static final이다.
	
	// 추상메소드가 아니므로 오류 발생함
	// public void prn(){};
	
	// 일반적인 추상메소드 형태
	public abstract void like();
	
	// abstract 예약어 생략 가능 (인터페이스 안에서만)
	public void sound();
	
}
