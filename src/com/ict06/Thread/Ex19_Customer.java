package com.ict06.Thread;

public class Ex19_Customer implements Runnable {
	// Ŭ������ �ڷ������� ��� => �����ڷ���
	private Ex17_Car car;
	
	// ������
	public Ex19_Customer(Ex17_Car car) {
		// ���������� ���������� �̸��� ���� ��
		// �������� �տ� this�� ���δ�.
		this.car = car;
	}

	@Override
	public void run() {
		String carName = null;
		
		for (int i = 0; i < 20; i++) {
			// �ڵ����� �Һ���
			carName = car.pop();		
			
			try {
				Thread.sleep((int)(Math.random() * 500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
