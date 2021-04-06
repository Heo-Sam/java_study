package com.ict03.class01;

public class Ex06_main {

	public static void main(String[] args) {
		Ex06 test = new Ex06();
		
		//getter
		String s1 = test.k1();
		System.out.println("이름 : " + s1);
		
		int s2 = test.k2();
		System.out.println("나이 : " + s2);
		
		double s3 = test.k3();
		System.out.println("키 : " + s3);
		
		char s4 = test.k4();
		System.out.println("랭크 : " + s4);
		
		
		//setter
		test.m1("고길동");
		System.out.println("변경된 이름 : " + test.k1());
		
		test.m2(26);
		System.out.println("변경된 나이 : " + test.k2());
		
		test.m3(183.7);
		System.out.println("변경된 키 : " + test.k3());
		
		test.m4('B');
		System.out.println("변경된 랭크 : " + test.k4());
		
		
	}

}
