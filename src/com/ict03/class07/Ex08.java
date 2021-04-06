package com.ict03.class07;

interface Test {
	int data = 1000;
	
	void printData();
}

// ��� �ް� data ���
class Test02 implements Test {
	@Override
	public void printData() {
		System.out.println("data : " + data);
	}
}

//��� �ȹް� data ���
class Test03 {
	Test t = new Test() {
		@Override
		public void printData() {
			System.out.println("data : " + data);			
		}
	};
}

//��� �ȹް� �޼ҵ� �ȿ� ��
class Test04 {
	public void play() {
		new Test() {
			@Override
			public void printData() {
				System.out.println("data : " + data);
			}
		}.printData(); // new Test() ����Ŭ���� ��
		
	} // play() �޼ҵ� ��
}

//��ӹ��� �ʰ� �޼ҵ� ���ڿ� �ֱ�
class Test05 {
	public void sound(Test test) {
		test.printData();
	}
}

public class Ex08 {
	public static void main(String[] args) {
		//Test02�� ��ü�����ؼ� 
		Test02 t2 = new Test02();
		t2.printData();
		System.out.println();
		
		//Test03�� t ȣ��
		Test03 t3 = new Test03();
		t3.t.printData();
		System.out.println();
		
		//Test04�� play()�޼ҵ带 ȣ��
		Test04 t4 = new Test04();
		t4.play();
		
		//Test05�� ���ڿ��� Anonymous����ؼ� �̺�Ʈ ó��
		Test05 t5 = new Test05();
		t5.sound(new Test() {
			
			@Override
			public void printData() {
				System.out.println("data : " + data);				
			}
		});
	}

}
