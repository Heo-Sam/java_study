package com.ict03.class02;

import java.util.Calendar;

public class Ex01 {

	public static void main(String[] args) {
		// String 클래스
		String str1 = "abc";

		char[] data = { 'a', 'b', 'c' };
		String str2 = new String(data);

		byte[] data2 = { 97, 98, 99 };
		String str3 = new String(data2);

		String str4 = new String("abc");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		System.out.println("===주요 메소드===");
		String msg = "한국 ICT 인재 개발원 1강의장";
		// 1. charAt(int index) : char(반환형)
		// 위치값을 받아서 그 위치에 존재하는 문자를 반환한다.
		// 이 때 위치값(index는 0부터이다.)
		char c1 = msg.charAt(7); // 인
		System.out.println(c1);

		// 문제) 다음 문자들 중에 소문자를 대문자로 변경하시오.
		// 힌트) a = 97, A = 65이다.
		msg = "대한 I Love You 123";
		// 문자열의 길이를 구하자 : length() : int
		System.out.println(msg.length());
		for (int i = 0; i < msg.length(); i++) {
			char c2 = msg.charAt(i);
			// 소문자가 if문에 걸려지면서 대문자로 바뀌게 됨
			if (c2 >= 'a' && c2 <= 'z') {
				// char와 int를 계산하면 int로 계산됨
				c2 = (char) (c2 - 32); // char로 형변환을 해주지 않으면 오류
			}
			System.out.print(c2);
		}
		System.out.println();
		System.out.println();

		// 2. concat(String str) : String
		// 지정한 문자열을 이 문자열 끝에 연결
		String msg1 = "대한민국";
		String msg2 = "KOREA";
		String msg3 = msg1.concat(msg2);
		System.out.println(msg3);
		System.out.println(msg1 + msg2);
		System.out.println();

		// 3. contains(String s) : boolean
		// 받은 문자열이 해당 문자열에 존재하면 true, 존재하지 않으면 false
		msg = "대한 I Love You 123";
		boolean b1 = msg.contains("You");
		if (b1) {
			System.out.println("포함되어 있다.");
		} else {
			System.out.println("포함되어 있지 않다.");
		}
		System.out.println();

		// 4. equals(Object anObject) : boolean
		// 받은 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자 구별)
		// 5. equalsIgnoreCase(String anotherString) : boolean
		// 받은 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자 구별X)
		// ** 주의) 문자열이나 객체를 비교할 때 == 는 사용하면 주소가 같냐는 뜻 (내용이 같다가 아님)
		// 문자열에는 ' == ' 사용 불가, equals, equalsIgnoreCase를 사용해야 한다
		String s1 = "Korea";
		String s2 = "KOREA";
		String s3 = new String("Korea");
		String s4 = new String("Korea");

		System.out.println(s1 == s2); // false
		System.out.println(s2 == s3); // false
		System.out.println(s3 == s4); // false -> 주소가 다름
		System.out.println();
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println();

		s1 = "seoul";
		s2 = "seoul";
		System.out.println(s1 == s2); // 주소가 같냐
		System.out.println(s1.equalsIgnoreCase(s2)); // 내용이 같냐
		System.out.println();

		// 6. format(String format, Object... args) : static String
		// 형식을 지정하고 형식에 맞게 생성
		// %s는 문자열, %d는 정수, %f는 실수(반올림된다)
		String msg4 = "한국 ICT 인재 개발원";
		int s5 = 14;
		double s6 = 89.167;
		String msg5 = msg4.format("%s의 시작년도는 %d년이고 평균점수는 %.2f이다.", msg4, s5, s6);
		System.out.println(msg5);
		System.out.println();

		// 7. getBytes() : byte[]
		// 해당 문자열을 byte[]로 변경시킨다.
		// 보통 입/출력 스트림할 때 사용한다. (영문 대소문자와 숫자만 가능. 한글/한자 불가)
		String msg6 = "java";
		byte[] b = msg6.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println((char) (b[i]) + ":" + b[i]);
		}
		// 반대로 해당 byte배열을 문자열로 만들 수도 있다.(String 생성자 이용)
		String msg7 = new String(b);
		System.out.println(msg7);
		System.out.println();

		// 8. toCharArray() : char[]
		// 해당 문자열을 char[]로 변경시킨다.
		// 보통 입/출력 스트림할 때 사용한다.(전 세계 모든 문자 가능)
		String msg8 = "한국8 java8 大韓民國 123";
		char[] c = msg8.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		// 반대로 해당 char배열을 문자열로 만들 수도 있다.(String 생성자 이용)
		String msg9 = new String(c);
		System.out.println(msg9);
		System.out.println();

		// 9. indexOf(int ch) : int
		// 문자를 받아서 해당 문자의 위치 값을 표시
		// 시작 위치는 처음부터, 찾는 문자가 없으면 -1이다.

		// 10. indexOf(int ch, int fromIndex) : int
		// 문자와 시작 위치를 받아서 해당 문자의 위치 값을 표시
		// 찾는 문자가 없으면 -1이다.

		// 11. indexOf(String str) : int
		// 해당 문자열을 받아서 해당 문자열의 위치값을 표시
		// 시작 위치는 처음부터, 찾는 문자가 없으면 -1이다.

		// 12. indexOf(String str, int fromIndex) : int
		// 문자열과 시작위치를 받아서 해당 문자열의 위치값을 표시
		// 찾는 문자가 없으면 -1이다.

		String msg10 = "BufferedReader";
		// e를 찾아랑
		int k1 = msg10.indexOf('e'); // 4
		System.out.println(k1);

		// 두번째 'e'를 찾아라
		// 첫번째 'e'가 4이므로 5부터 찾아야 두번째 'e'를 찾을 수 있음
		// k1 = msg10.indexOf('e', 5);
		k1 = msg10.indexOf('e', msg10.indexOf('e') + 1);
		System.out.println(k1);

		// 세번째 'e'를 찾아라
		// 두번째 'e'가 6이므로 7부터 찾아야 세번째 'e'를 찾을 수 있음
		k1 = msg10.indexOf('e', (msg10.indexOf('e', msg10.indexOf('e') + 1)) + 1);
		System.out.println(k1);

		// 없는 글자 찾기('A')
		k1 = msg10.indexOf('A');
		System.out.println(k1); // -1
		b1 = msg10.contains("A"); // 포함됐냐 안됐냐
		System.out.println(b1); // false

		// char말고 String으로 찾기
		k1 = msg10.indexOf("er");
		System.out.println(k1); // 4 (4번째 자리에 있다)

		// 두번째 er찾기
		k1 = msg10.indexOf("er", (msg10.indexOf("er") + 1));
		System.out.println(k1); // 12 (12번째 자리에 있다)
		System.out.println();

		// 11. lastIndexOf(int ch) : int
		// lastIndexOf(String str) : int
		// 마지막 글자 찾기
		k1 = msg10.lastIndexOf('e');
		System.out.println(k1); // 12
		k1 = msg10.lastIndexOf("ea");
		System.out.println(k1); // 9
		System.out.println();

		// 12. isEmpty() : boolean
		// 문자열의 길이가 0이면 true, 아니면 false
		// 문자가 비어있으면 true, 아니면 false
		// 13. length() : int
		// 문자열의 길이를 구한다
		String msg11 = ""; // null과는 다른 의미. null은 정해지지 않았다는 뜻
		String msg12 = "Java";
		System.out.println(msg11.isEmpty()); // true
		System.out.println(msg12.isEmpty()); // false
		System.out.println(msg11.length()); // 0
		System.out.println(msg12.length()); // 4
		System.out.println();

		// 13. replace(char oldChar, char newChar) : String
		//	   replace(String target, String replacement) : String
		//	문자나 문자열을 받아서 치환하기 (replace=치환)
		String msg13 = "대한민국";
		String msg14 = msg13.replace("대한민국", "korea");
		String msg15 = msg13.replace(msg13, "korea");
		String msg16 = msg13.replace('한', '韓');
		System.out.println(msg14);
		System.out.println(msg15);
		System.out.println(msg16);
		System.out.println();

		
		// 14. split(String regex) : String[]
		//	구분자를 받아서 배열로 나눈다.(배열크기는 자동으로)
		// 15. split(String regex, int limit) : String[]
		//	구분자를 받아서 배열로 나눈다.(limit이 배열의 크기)
		String msg17 = "사과,딸기,망고,오렌지,파인애플";
		String[] res = msg17.split(","); // ,(콤마)로 나눠달라
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		System.out.println();
		
		String[] res2 = msg17.split(",", 3); // 만나는 ,(콤마) 기준으로 배열 갯수가 생성됨
		System.out.println(res2[0]);
		System.out.println(res2[1]);
		System.out.println(res2[2]);
		
		String[] res3 = msg17.split(",", 10);
		for (int i = 0; i < res3.length; i++) {
			System.out.println("i=" +i+", res3=" +res3[i]);
		}
		
		
		// 16. subString(int beginIndex) : String
		//	시작 위치를 받아서 해당 문자열 끝까지 
		//	   substring(int beginIndex, int endIndex) " Stirng
		//	시작 위치와 끝 위치를 받아서 해당 문자열을 추출함 (끝 위치는 포함이 안된다)
		String msg18 = "010-1234-5678";
		String res4 = msg18.substring(4); // 1234-5678
		System.out.println(res4);
		String res5 = msg18.substring(4, 8);
		System.out.println(res5); //1234
		
		String res6 = msg18.substring(msg18.indexOf('-')+1, msg18.lastIndexOf('-'));
		System.out.println(res6); //1234
		
		String msg19= "961117";
		// 태어난 연도 추출
		String res7 = msg19.substring(0, 2);
		// 태어난 달 추출
		String res8 = msg19.substring(2, 4);
		System.out.println(res7);
		System.out.println(res8);
		System.out.println();
		
		// 퀴즈) 010-7777-9999 -> 010-XXXX-9999, 010-7777-XXXX
		
		
		// 17. toLowerCase() : String
		//	해당 문자열의 모든 대문자를 소문자로 변경
		// 18. toUpperCase() : String
		//	해당 문자열의 모든 소문자를 대문자로 변경
		String msg20 = "자바8 java8 JAVA8";
		String res9 = msg20.toLowerCase();
		String res10 = msg20.toUpperCase();
		System.out.println(res9);
		System.out.println(res10);
		System.out.println();
		
		
		// 19. toString() : String
		//	String의 toString() : 문자열 자체를 반환
		//	Object의 toString() : 모든 객체에서 사용가능
		//						객체가 가지고 있는 정보나 값들을 문자열로 return할 때 사용
		//						(오버라이딩할 때 다시배움)
		String msg21 = "java8 java8 자바8";
		String res11 = msg21.toString();
		System.out.println(msg21);
		System.out.println(res11);
		System.out.println();
		
		
		// 20. trim() : String
		//	해당 문자열의 앞, 뒤에 있는 공백 제거, 중간 공백은 제거 못 함(중간 공백은 문자취급)
		String msg22 = "   java 자바  JAVA   ";
		System.out.println(msg22);
		System.out.println(msg22.trim());
		System.out.println(msg22.length()); // 19
		System.out.println(msg22.trim().length()); // 13
		System.out.println();
		
		
		// 21. valueOf(각종 자료형) : static Stirng
		boolean p1 = true;
		char p2 = 'd';
		int p3 = 100;
		long p4 = 100L;
		float p5 = 100.0f;
		double p6 = 100.0;
		
		// 각종 자료형에 + 1; ( boolean 제외)
		// System.out.println(p1+1); // 오류발생: boolean은 연산할 수 없음
		System.out.println(p2+1); // char + 정수 = 정수
		System.out.println(p3+1);
		System.out.println(p4+1);
		System.out.println(p5+1);
		System.out.println(p6+1);
		System.out.println();
		
		//String으로 변경시켜서 +1
		System.out.println(String.valueOf(p1)+1);
		System.out.println(String.valueOf(p2)+1);
		System.out.println(String.valueOf(p3)+1);
		System.out.println(String.valueOf(p4)+1);
		System.out.println(String.valueOf(p5)+1);
		System.out.println(String.valueOf(p6)+1);
		System.out.println();
		
		System.out.println(p1 + "1");
		System.out.println(p2 + "1");
		System.out.println(p3 + "1");
		System.out.println(p4 + "1");
		System.out.println(p5 + "1");
		System.out.println(p6 + "1");
		System.out.println();
		
		// 21의 반대개념 (각종 자료형 모양의 문자를 각종 자료형으로 변경)
		// Wrapper Class (Boolean, Byte, short, Integer, Long, Float, Double,Character)
		//					parseXXXXX(String s) 메소드를 이용해서 변경(Character 제외 => String.charAt();
		//  - 각 자료형의 형태를 가진 문자열을 진짜 자료형으로 변경시키는 클래스들
		//  - 원래 의미는 기본자료형을 객체로 만들 때 사용하는 클래스
		//	  기본자료형 => 객체형 자동으로 변경(오토박싱)
		//	  객체형 => 기본자료형 자동으로 변경(오토언박싱)
		
		// 1. boolean형태의 문자열을 Boolean형으로 변경
		//	Boolean.parseBoolean("true"); => boolean형을 String으로 변환 
		//	Boolean.parseBoolean("나머지글자"); -> false
		msg = "0";
		/*if(msg) {
			System.out.println("변경성공");
		} boolean형이 아니라서 오류 발생*/
		
		boolean a1 = Boolean.parseBoolean(msg);
		if (a1) {
			System.out.println("변경성공1");
		} else {
			System.out.println("변경성공2");
		}
		// 2. int형태의 문자열을 int형으로 변경 : Integer.parseInt(String s)
		msg = "100";
		int a2 = Integer.parseInt(msg);
		System.out.println(msg+10);
		System.out.println(a2+10); // int로 변경
		
		// 3. double형태의 문자열을 Double형으로 변경 : Double.parseDouble(String s)
		msg = "3.145";
		double a3 = Double.parseDouble(msg);
		System.out.println(msg+10);
		System.out.println(a3+10); // double로 변경
		
		// 4. char형태의 문자열을 Character형으로 변경
		//		(단, Character 클래스는 존재한다.)
		//		문자열에서 charAt(위치값) 이용하면 된다.
		msg = "c";
		char a4 = msg.charAt(0);
		System.out.println(msg+1);
		System.out.println(a4+1); // 100
		System.out.println((char)(a4+1)); // d / char로 형변환해서 출력 
		System.out.println();
		
		// 주민번호 앞자리를 받았다? 나이를 구하자
		String jumin = "961117";
		String gender = "1";
		
		// 앞자리 두 자리 구하고 추출한 두 자리 문자열을 숫자로 변경
		String year = jumin.substring(0, 2);
		int y_year = Integer.parseInt(year);
		// int y_year = Integer.parseInt(jumin.substring(0, 2)); //한줄로
		
		// 구한 두자리 앞에 19나 20을 붙이고 
		//	(gender가 1 또는 2이면 1900년대생, 3 또는 4이면 2000년대생)
		if (gender.equals("1") || gender.equals("2")) {
			y_year = 1900 + y_year ;
		} else if(gender.equals("3") || gender.equals("4")) {
			y_year = 2000 + y_year ;
		}
		
		
		// (올해년도 - 구한년도) + 1 
		Calendar now = Calendar.getInstance();
		int age = (now.get(Calendar.YEAR) - y_year) + 1;
		System.out.println("나이는 " + age + "입니다.");
	}

}
