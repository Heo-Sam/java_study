package com.ict01.grammar02;

class Ex08 {
	public static void main(String[] args) {
		// 아메리카노가 2500원이다. 칭구와 둘이서 10000원을 내고 주문했다
		// 잔돈은 얼마뇽? (부가세 10%가 추가)

	   // 입력 정보
	   String coffee = "아메리카노";
	   int ameri = 2500;
	   int human = 2;
	   int pay = 10000;

	   // 받은 정보 가공
	   int total = ameri * human;
	   int vat = (int)(total * 0.1);
	   
	   int jandon = pay - (total + vat);
	   System.out.println("쟌돈 : " + jandon );


	   int total2 = (int)((ameri * human) * 1.1);
	   int jandon2 = pay - total2;
	   System.out.println("쟌돈2 : " + jandon2 );

	}
}