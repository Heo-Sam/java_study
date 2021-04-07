package com.ict06.Thread;

public class Ex20_main {
	public static void main(String[] args) {
		// Car클래스는 공통자원 ==> 임계영역.
		//		=> 동기화처리 필요 (Synchronized)
		Ex17_Car car = new Ex17_Car();
		
		// 참조할 스레드를 만들기 위해서는
		Ex18_Producer producer = new Ex18_Producer(car);
		Thread tProducer = new Thread(producer);
		// new Thread(producer).start();
		
		Ex19_Customer customer = new Ex19_Customer(car);
		Thread tCustomer = new Thread(customer);
		// new Thread(customer).start(); 
		
		
		// 실행
		tProducer.start();
		tCustomer.start();
		
	}

}
