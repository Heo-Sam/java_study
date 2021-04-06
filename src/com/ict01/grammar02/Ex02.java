package com.ict01.grammar02;

class Ex02 {
	public static void main(String[] args) {
		// 문자형: char, "한 글자"만 저장할 수 있음(한글,한자,특수문자 등 처리가 가능함)
		// 문자를 사용하기 위해서는 ' '(홑따옴표) 사용
		// 숫자를 사용할 수 있으며 최종 저장은 숫자로 저장된다.(연산가능)
		// 호출하면 문자로 나옴
		
		char k1;
		k1 = 'a'+1;
		System.out.println(k1);
		
		
		k1 = 97;
		System.out.println(k1);
		
		//문자를 표현하는 코드: ASCII(영어와 숫자), 유니코드(영어를 제외한 모든 언어)
		char k2 = '대';
		System.out.println(k2);
	}
}