package com.ict03.class01;

public class Ex11_main {

	public static void main(String[] args) {
		//Ex11���� �⺻�����ڰ� �ƴ� �ٸ� �����ڰ� ����.
		//�׷��Ƿ� �ٸ� �����ڷ� ��ü ������ �ؾߵȴ�.
		Ex11 test1 = new Ex11(17,"�Ӳ���");
		
		// �����ڿ� ���� ���� ����Ǿ� ����.
		//Ex11 test1 = new Ex11();
		System.out.println("�̸� : " + test1.getName());
		System.out.println("���� : " + test1.getAge());
		System.out.println("���� : " + test1.isGender());
		System.out.println();
		
/*		//Ex11 test2 = new Ex11();
		System.out.println("�̸� : " + test2.getName());
		System.out.println("���� : " + test2.getAge());
		System.out.println("���� : " + test2.isGender());
		System.out.println();
		
		// setter�� �̿��ؼ� ����ʵ��� ���� ����
		test2.setName("���̾�");
		System.out.println("�̸� : " + test2.getName());
		System.out.println("���� : " + test2.getAge());
		System.out.println("���� : " + test2.isGender());
 */
	}
}