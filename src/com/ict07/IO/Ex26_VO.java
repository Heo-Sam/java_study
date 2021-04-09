package com.ict07.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Override한 메소드 안에 객체 직렬화 할 멤버를 넣어준다.

public class Ex26_VO implements Externalizable {
	
	private String name;
	private int age;
	private double weight;
	private boolean gender;
	
	public Ex26_VO() {	}

	public Ex26_VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}
	
	@Override // 직렬화
	public void writeExternal(ObjectOutput out) throws IOException {
		// 직렬화 할 대상 입력
		out.writeObject(name); 
		out.writeObject(age);
		//out.writeObject(weight); 직렬화 대상에서 빠지면 역직렬화 대상에서도 제외해줘야한다.
		out.writeObject(gender);
	}

	@Override // 역직렬화
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// 역직렬화 할 대상 입력
		name = (String)in.readObject();
		age = (int)in.readObject();
		//weight = (double)in.readObject();
		gender = (boolean)in.readObject();
		
	}

	
	// getter/setter 는 직렬화,역직렬화 밑에 	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	

}
