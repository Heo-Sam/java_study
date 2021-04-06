package com.ict03.class01;

public class Ex07 {
	// 전역변수
	private String name = "둘리";
	private int age = 13;
	private double height = 135.15;
	private boolean gender = true;
	private char rank = 'A';
	
	
	
	// getter. setter 호출 => 메뉴 => Source => Generate Getters and Setters
	
	public String getName() {
		return name;
	}
	
	// 지역변수 이름과 전역변수 이름이 같을 때 전역변수에는 this를 붙인다
	// 지역변수 이름과 전역변수 이름이 같을 때 우선순위는 지역변수가 먼저다.
	public void setName(String name) {
		this.name = name; // 전역변수를 변경하기 위해서 this를 붙임
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	//boolean형은 getter가 is로 나옴
	public boolean isGender() {
		return gender;
	}
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public char getRank() {
		return rank;
	}
	
	public void setRank(char rank) {
		this.rank = rank;
	}

}
