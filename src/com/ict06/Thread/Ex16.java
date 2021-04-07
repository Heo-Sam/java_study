package com.ict06.Thread;

// 두 개의 스레드를 생성하여 첫 번째 스레드의 출력을 1-50까지 출력하고,
// 두 번째 스레드의 출력을 51-100까지 출력
// 다시 첫 번째 스레드가 101-150까지 출력
// 두 번째 스레드가 151-200 출력 (synchronized, wait(), notify())
public class Ex16 implements Runnable {

	int x = 0;
	
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (++x));
			
			if (x == 50 || x ==100) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				notify();
			}
/*		
			if (x == 50) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else if (x == 100) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				notify();
			}
*/			
		}
		
	}
	
	
	

}
