package com.ict06.Thread;

public class Ex20_main {
	public static void main(String[] args) {
		// CarŬ������ �����ڿ� ==> �Ӱ迵��.
		//		=> ����ȭó�� �ʿ� (Synchronized)
		Ex17_Car car = new Ex17_Car();
		
		// ������ �����带 ����� ���ؼ���
		Ex18_Producer producer = new Ex18_Producer(car);
		Thread tProducer = new Thread(producer);
		// new Thread(producer).start();
		
		Ex19_Customer customer = new Ex19_Customer(car);
		Thread tCustomer = new Thread(customer);
		// new Thread(customer).start(); 
		
		
		// ����
		tProducer.start();
		tCustomer.start();
		
	}

}
