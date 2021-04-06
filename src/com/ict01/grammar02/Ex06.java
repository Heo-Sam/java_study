package com.ict01.grammar02;

class Ex06 {
	public static void main(String[] args) {
		// 산술연산자: + , - , * , / , %(나머지)
		// 작은 자료형과 큰 자료형을 연산하면 큰 자료형으로 변경
		// byte < short < char > int < long < float < double

		// 원 단위 절삭
		int k1 = 21755;  // => 21750
		int s1 = k1 / 10;  // => 2175
		int s2 = s1 *10;  // => 21750
		int s3 = (k1 / 10) * 10;  // 21750

		int s4 = (21755 / 10) * 10;
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);


		//소숫점 첫째자리까지 구하기
		double k2 = 24.6843;  // => 24.6
		int s5 = (int)(k2 * 10);  // => 246  
		double s6 = s5 / 10.0; // => 24.6
		double s7 = (int)(k2 * 10) / 10.0;
		double s8 = (int)(24.6843 * 10) / 10.0;

		System.out.println("s7 = " + s7);
		System.out.println("s8 = " + s8);

		// % 나눈 나머지를 말한다
		// / 결과가 int 이면 몫
		int su1 = 7;
		int su2 = 3;
		int res1 = 7 / 3;
		int res2 = 7 % 3;


		// 어떤 수를 2로 나눈 나머지가 1과 같으면 홀수
		// 어떤 수를 2로 나눈 나머지가 0과 같으면 짝수
		// 어떤 수를 k로 나눈 나머지가 0이면 k의 배수
	}
}