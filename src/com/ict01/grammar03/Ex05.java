package com.ict01.grammar03;

class Ex05 {
	public static void main(String[] args) {
	// 자료형 저장변수 = (조건식) ? (참일 때) : (거짓일 때);

	// int k1이 60이상이면 합격 아니면 불합격

	   int k1 = 58;
	   String res1 = (k1 >= 60) ? "합격" : "불합격";  
	   System.out.println("결과1 : " + res1);


	// int k2가 홀수인지 짝수인지 판별
	   
	   int k2 = 26;
	   String res2 = (k2 % 2 == 0) ? ("짝수") : ("홀수");
	   System.out.println("결과2 : " + res2);


	// char k3가 대문자인지 아닌지 판별

	   char k3 = 'S';
	   String res3 = (k3 >= 'A' && k3 <= 'Z') ? ("대문자") : ("대문자가 아님");
	   System.out.println("결과3 : " + res3);


	// 근무시간이 8시간까지는 시간당 8,720원이고
	// 8시간을 초과한 시간만큼은 1.5배이다.
	// 현재 근무시간은 10시간이다. 얼마를 받아야하는가 ?
/*
	   int time = 1;
	   int dan = 8720;
	   int pay = (time > 8) ? (dan * 8) + (int)((time - 8) * dan* 1.5) : (time * dan);
   	   System.out.println("결과4 : " + pay);
*/

	//내가한 것
	   int time = 8;
	   int wage = 8720;
	   int work = 10;
	   double addwage = wage * 1.5;
	   int money = (work  < time) ? (wage * work) 
			: (((work - time) * (int)(addwage)) + (wage * 8));
	   System.out.println("결과4 : " + money);



	}
}