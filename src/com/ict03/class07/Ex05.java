package com.ict03.class07;

// �͸� ����Ŭ���� (Anonymous) : ����� ���� �߻�Ŭ������ �������̽����� ���� ���

// �߻�Ŭ����
abstract class Car {
	abstract void run(); //�߻�޼ҵ�
}



// �߻�Ŭ������ ��ӹ��� �Ϲ�Ŭ������ �������̵� �ʼ�
class Bus extends Car {
	@Override
	void run() {
		System.out.println("������ 80km�� �޸���");
	}
}

class Taxi extends Car {
	@Override
	void run() {
		System.out.println("�ýð� 160km�� �޸���");
	}
}


class Ex05 {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		System.out.println();
		
		Car car = new Taxi();
		car.run();
		
		// Anonymous
		Car car2 = new Car() {
			@Override
			void run() {
				System.out.println("������ �޸���");
			}
		};
		car2.run();
	}
}

