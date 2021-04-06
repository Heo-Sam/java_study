package com.ict03.class03;

public class Ex11_Dog extends Ex09_Animal {
	String name = "´ó´óÀÌ";
	int age = 3;
	
	public void hobby() {
		System.out.println("½Å¹ß ¹°¾î ¶âƒ‡¤»¤»¤»");
	}
	
	@Override
	public void sound() {
		System.out.println("¿Ð¿Ð¤©¿Õ¤©¿Ð¿Ð!!!!");
		// super.sound();
	}

}
