package com.ict06.Thread;

public class Ex15_main {
	public static void main(String[] args) {
/*		Ex15 t1 = new Ex15();
		
		new Thread(t1, "Thread 1").start();
		new Thread(t1, "Thread 2").start();	
*/	
		Ex15 t1 = new Ex15();
		
		Thread thread_1 = new Thread(t1, "thread_1");
		thread_1.start();
		
		Thread thread_2 = new Thread(t1, "thread_2");
		thread_2.start();
	}

}
