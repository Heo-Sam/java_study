package com.ict06.Thread;

public class Ex14 implements Runnable {

	// wait() : 동기화 처리할 때 실행 중인 스레드를 강제로 대기 상태로 변경
	// 		=> 재워버림.
	//		=> 한 번 wait()된 스레드는 풀어주지 않으면 그대로 대기 상태에서 프로그램이 종료된다.
	// notify() : wait()된 스레드를 "하나만" 풀어주는 메소드
	// notifyAll() : wait()된 스레드를 "모두" 풀어주는 메소드
	
	
		
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
				// x == 26 될 때 깨어짐
				notify();
			}
		}
	}
}
