package com.ict06.Thread;

public class Ex18_Producer implements Runnable {
	// Ŭ������ �ڷ������� ��� => �����ڷ���
	private Ex17_Car car;
	
	// ������
	public Ex18_Producer(Ex17_Car car) {
		// ���������� ���������� �̸��� ���� ��
		// �������� �տ� this�� ���δ�.
		this.car = car;
	}
	
	@Override
	public void run() {
		String carName = null;
		
		for (int i = 0; i < 20; i++) {
			// �ڵ��� �����ϸ� �ڵ��� �̸��� �޾Ƽ�
			carName = car.getCar();
			// ����� �ڵ����� â�� �ִ´�
			car.push(carName);
			
			try {
				Thread.sleep((int)(Math.random() * 2000)); // ���ð�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
