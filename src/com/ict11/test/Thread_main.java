package com.ict11.test;

public class Thread_main {
	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest();
		
		Thread thread_1 = new Thread(t1, "dog");
		thread_1.start();
		
		Thread thread_2 = new Thread(t1, "cat");
		thread_2.start();
	}

}
