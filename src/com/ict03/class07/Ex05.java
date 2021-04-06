package com.ict03.class07;

// 익명 내부클래스 (Anonymous) : 대상이 보통 추상클래스나 인터페이스에서 많이 사용

// 추상클래스
abstract class Car {
	abstract void run(); //추상메소드
}



// 추상클래스를 상속받은 일반클래스는 오버라이딩 필수
class Bus extends Car {
	@Override
	void run() {
		System.out.println("버스가 80km로 달린다");
	}
}

class Taxi extends Car {
	@Override
	void run() {
		System.out.println("택시가 160km로 달린다");
	}
}


class Ex05 {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		System.out.println();
		
		Car car = new Taxi();
		car.run();
		
		// Anonymous
		Car car2 = new Car() {
			@Override
			void run() {
				System.out.println("무조건 달린다");
			}
		};
		car2.run();
	}
}

