package com.ict06.Thread;

public class Ex19_Customer implements Runnable {
	// 클래스를 자료형으로 사용 => 참조자료형
	private Ex17_Car car;
	
	// 생성자
	public Ex19_Customer(Ex17_Car car) {
		// 전역변수와 지역변수의 이름이 같을 때
		// 전역변수 앞에 this를 붙인다.
		this.car = car;
	}

	@Override
	public void run() {
		String carName = null;
		
		for (int i = 0; i < 20; i++) {
			// 자동차를 소비함
			carName = car.pop();		
			
			try {
				Thread.sleep((int)(Math.random() * 500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
