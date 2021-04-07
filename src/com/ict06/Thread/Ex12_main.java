package com.ict06.Thread;

public class Ex12_main {
	public static void main(String[] args) {
		System.out.println("main ����");
		Ex12 t1 = new Ex12();
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		// join(): ���� ������� join()�� ȣ���� �����尡 ���� ������ �����¿� �����ִٰ�
		//			join()�� ȣ���� �����尡 ������ �ٽ� �����Ѵ�.
		//			��, join()�� ȣ���� �����尡 ���� ������ ������ �� ����.
		
		try {
			thread1.join(); // �켱������ �ο�
			// run()�� ���� ������ main�� ������
			// run()�� ������ �Ʒ� for�� ����
			for (int i = 0; i < 51; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
				System.out.println("main ��");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}