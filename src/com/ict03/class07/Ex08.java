package com.ict03.class07;

interface Test {
	int data = 1000;
	
	void printData();
}

// 상속 받고 data 사용
class Test02 implements Test {
	@Override
	public void printData() {
		System.out.println("data : " + data);
	}
}

//상속 안받고 data 사용
class Test03 {
	Test t = new Test() {
		@Override
		public void printData() {
			System.out.println("data : " + data);			
		}
	};
}

//상속 안받고 메소드 안에 들어가
class Test04 {
	public void play() {
		new Test() {
			@Override
			public void printData() {
				System.out.println("data : " + data);
			}
		}.printData(); // new Test() 내부클래스 끝
		
	} // play() 메소드 끝
}

//상속받지 않고 메소드 인자에 넣기
class Test05 {
	public void sound(Test test) {
		test.printData();
	}
}

public class Ex08 {
	public static void main(String[] args) {
		//Test02는 객체생성해서 
		Test02 t2 = new Test02();
		t2.printData();
		System.out.println();
		
		//Test03은 t 호출
		Test03 t3 = new Test03();
		t3.t.printData();
		System.out.println();
		
		//Test04는 play()메소드를 호출
		Test04 t4 = new Test04();
		t4.play();
		
		//Test05는 인자에서 Anonymous사용해서 이벤트 처리
		Test05 t5 = new Test05();
		t5.sound(new Test() {
			
			@Override
			public void printData() {
				System.out.println("data : " + data);				
			}
		});
	}

}
