package com.ict06.Thread;

import java.util.ArrayList;
import java.util.List;

public class Ex17_Car {
	// 컬렉션 : 자동차들을 저장하는 공간(저장 창고)
	// List<String>  ==>  제네릭타입
	private List<String> carList = null;
	
	// 생성자 : 해당 클래스가 객체로 생성되면 carList를 생성한다.
	public Ex17_Car() {
		carList = new ArrayList<String>();
	}

	
	// getCar()를 호출하면 랜덤으로 자동차를 생산	
	public String getCar() {
		String carName = null;
		
		// 랜덤으로 0,1,2가 나오는 case가 생긴다 (차 종류 생성)
		switch ((int)(Math.random() * 3)) {
		case 0: carName = "SM5"; break;
		case 1: carName = "매그너스"; break;
		case 2: carName = "카렌스"; break;
		}
		
		return carName;
	}
	
	// 소비자가 자동차를 사는 메소드
	public synchronized String pop() {
		String carName = null;
		
		// 창고에 재고가 없으면 ~ 
		if (carList.size() == 0) {
			try {
				System.out.println("차가 없습니다. 생산될 때까지 기다려주세요!");
				// 소비자가 소비를 하면 안되는 시간!!!
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// 재고가 있을 경우
		carName = (String)carList.remove(carList.size() - 1); 
		// carList에 가장 나중에 들어간 차부터 재고가 빠진다.(삭제)
		
		System.out.println("손님이 차를 사갔습니다.. 손님이 구입한 차 이름은=>\" "+ carName + "\"");
		
		return carName;
	}
	
	
	// 자동차를 carList에 넣는다
	// push() 호출하면 carList(저장 창고)에 저장
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("차가 만들어졌습니다. 차 이름은 \" " + car + "\"");
		
		// 창고에 자동차가 5개가 되면 소비자에게 판매를 시작함.
		// 재고가 0일때 대기시킨 스레드(소비자)를 준비상태(깨움)로 변경시킴
		if (carList.size() == 5) {
			notify();
		}
	}

}
