package com.ict06.Thread;

public class Ex14_main {
	public static void main(String[] args) {
		
		Ex14 t1 = new Ex14();
		new Thread(t1, "Dog").start();
		new Thread(t1, "Kitty").start();
		new Thread(t1, "Tiger").start();
	}

}
