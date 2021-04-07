package com.ict06.Thread;

public class Ex14 implements Runnable {

	// wait() : ����ȭ ó���� �� ���� ���� �����带 ������ ��� ���·� ����
	// 		=> �������.
	//		=> �� �� wait()�� ������� Ǯ������ ������ �״�� ��� ���¿��� ���α׷��� ����ȴ�.
	// notify() : wait()�� �����带 "�ϳ���" Ǯ���ִ� �޼ҵ�
	// notifyAll() : wait()�� �����带 "���" Ǯ���ִ� �޼ҵ�
	
	
		
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (++x));
			
			if (x == 25) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				// x == 26 �� �� ������
				notify();
			}
		}
	}
}
