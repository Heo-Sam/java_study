package com.ict03.class02;

import java.util.Calendar;

public class Ex01 {

	public static void main(String[] args) {
		// String Ŭ����
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

		System.out.println("===�ֿ� �޼ҵ�===");
		String msg = "�ѱ� ICT ���� ���߿� 1������";
		// 1. charAt(int index) : char(��ȯ��)
		// ��ġ���� �޾Ƽ� �� ��ġ�� �����ϴ� ���ڸ� ��ȯ�Ѵ�.
		// �� �� ��ġ��(index�� 0�����̴�.)
		char c1 = msg.charAt(7); // ��
		System.out.println(c1);

		// ����) ���� ���ڵ� �߿� �ҹ��ڸ� �빮�ڷ� �����Ͻÿ�.
		// ��Ʈ) a = 97, A = 65�̴�.
		msg = "���� I Love You 123";
		// ���ڿ��� ���̸� ������ : length() : int
		System.out.println(msg.length());
		for (int i = 0; i < msg.length(); i++) {
			char c2 = msg.charAt(i);
			// �ҹ��ڰ� if���� �ɷ����鼭 �빮�ڷ� �ٲ�� ��
			if (c2 >= 'a' && c2 <= 'z') {
				// char�� int�� ����ϸ� int�� ����
				c2 = (char) (c2 - 32); // char�� ����ȯ�� ������ ������ ����
			}
			System.out.print(c2);
		}
		System.out.println();
		System.out.println();

		// 2. concat(String str) : String
		// ������ ���ڿ��� �� ���ڿ� ���� ����
		String msg1 = "���ѹα�";
		String msg2 = "KOREA";
		String msg3 = msg1.concat(msg2);
		System.out.println(msg3);
		System.out.println(msg1 + msg2);
		System.out.println();

		// 3. contains(String s) : boolean
		// ���� ���ڿ��� �ش� ���ڿ��� �����ϸ� true, �������� ������ false
		msg = "���� I Love You 123";
		boolean b1 = msg.contains("You");
		if (b1) {
			System.out.println("���ԵǾ� �ִ�.");
		} else {
			System.out.println("���ԵǾ� ���� �ʴ�.");
		}
		System.out.println();

		// 4. equals(Object anObject) : boolean
		// ���� ���ڿ��� ���� ���ڿ��� ������ true, �ٸ��� false (��ҹ��� ����)
		// 5. equalsIgnoreCase(String anotherString) : boolean
		// ���� ���ڿ��� ���� ���ڿ��� ������ true, �ٸ��� false (��ҹ��� ����X)
		// ** ����) ���ڿ��̳� ��ü�� ���� �� == �� ����ϸ� �ּҰ� ���Ĵ� �� (������ ���ٰ� �ƴ�)
		// ���ڿ����� ' == ' ��� �Ұ�, equals, equalsIgnoreCase�� ����ؾ� �Ѵ�
		String s1 = "Korea";
		String s2 = "KOREA";
		String s3 = new String("Korea");
		String s4 = new String("Korea");

		System.out.println(s1 == s2); // false
		System.out.println(s2 == s3); // false
		System.out.println(s3 == s4); // false -> �ּҰ� �ٸ�
		System.out.println();
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println();

		s1 = "seoul";
		s2 = "seoul";
		System.out.println(s1 == s2); // �ּҰ� ����
		System.out.println(s1.equalsIgnoreCase(s2)); // ������ ����
		System.out.println();

		// 6. format(String format, Object... args) : static String
		// ������ �����ϰ� ���Ŀ� �°� ����
		// %s�� ���ڿ�, %d�� ����, %f�� �Ǽ�(�ݿø��ȴ�)
		String msg4 = "�ѱ� ICT ���� ���߿�";
		int s5 = 14;
		double s6 = 89.167;
		String msg5 = msg4.format("%s�� ���۳⵵�� %d���̰� ��������� %.2f�̴�.", msg4, s5, s6);
		System.out.println(msg5);
		System.out.println();

		// 7. getBytes() : byte[]
		// �ش� ���ڿ��� byte[]�� �����Ų��.
		// ���� ��/��� ��Ʈ���� �� ����Ѵ�. (���� ��ҹ��ڿ� ���ڸ� ����. �ѱ�/���� �Ұ�)
		String msg6 = "java";
		byte[] b = msg6.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println((char) (b[i]) + ":" + b[i]);
		}
		// �ݴ�� �ش� byte�迭�� ���ڿ��� ���� ���� �ִ�.(String ������ �̿�)
		String msg7 = new String(b);
		System.out.println(msg7);
		System.out.println();

		// 8. toCharArray() : char[]
		// �ش� ���ڿ��� char[]�� �����Ų��.
		// ���� ��/��� ��Ʈ���� �� ����Ѵ�.(�� ���� ��� ���� ����)
		String msg8 = "�ѱ�8 java8 �������� 123";
		char[] c = msg8.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		// �ݴ�� �ش� char�迭�� ���ڿ��� ���� ���� �ִ�.(String ������ �̿�)
		String msg9 = new String(c);
		System.out.println(msg9);
		System.out.println();

		// 9. indexOf(int ch) : int
		// ���ڸ� �޾Ƽ� �ش� ������ ��ġ ���� ǥ��
		// ���� ��ġ�� ó������, ã�� ���ڰ� ������ -1�̴�.

		// 10. indexOf(int ch, int fromIndex) : int
		// ���ڿ� ���� ��ġ�� �޾Ƽ� �ش� ������ ��ġ ���� ǥ��
		// ã�� ���ڰ� ������ -1�̴�.

		// 11. indexOf(String str) : int
		// �ش� ���ڿ��� �޾Ƽ� �ش� ���ڿ��� ��ġ���� ǥ��
		// ���� ��ġ�� ó������, ã�� ���ڰ� ������ -1�̴�.

		// 12. indexOf(String str, int fromIndex) : int
		// ���ڿ��� ������ġ�� �޾Ƽ� �ش� ���ڿ��� ��ġ���� ǥ��
		// ã�� ���ڰ� ������ -1�̴�.

		String msg10 = "BufferedReader";
		// e�� ã�ƶ�
		int k1 = msg10.indexOf('e'); // 4
		System.out.println(k1);

		// �ι�° 'e'�� ã�ƶ�
		// ù��° 'e'�� 4�̹Ƿ� 5���� ã�ƾ� �ι�° 'e'�� ã�� �� ����
		// k1 = msg10.indexOf('e', 5);
		k1 = msg10.indexOf('e', msg10.indexOf('e') + 1);
		System.out.println(k1);

		// ����° 'e'�� ã�ƶ�
		// �ι�° 'e'�� 6�̹Ƿ� 7���� ã�ƾ� ����° 'e'�� ã�� �� ����
		k1 = msg10.indexOf('e', (msg10.indexOf('e', msg10.indexOf('e') + 1)) + 1);
		System.out.println(k1);

		// ���� ���� ã��('A')
		k1 = msg10.indexOf('A');
		System.out.println(k1); // -1
		b1 = msg10.contains("A"); // ���ԵƳ� �ȵƳ�
		System.out.println(b1); // false

		// char���� String���� ã��
		k1 = msg10.indexOf("er");
		System.out.println(k1); // 4 (4��° �ڸ��� �ִ�)

		// �ι�° erã��
		k1 = msg10.indexOf("er", (msg10.indexOf("er") + 1));
		System.out.println(k1); // 12 (12��° �ڸ��� �ִ�)
		System.out.println();

		// 11. lastIndexOf(int ch) : int
		// lastIndexOf(String str) : int
		// ������ ���� ã��
		k1 = msg10.lastIndexOf('e');
		System.out.println(k1); // 12
		k1 = msg10.lastIndexOf("ea");
		System.out.println(k1); // 9
		System.out.println();

		// 12. isEmpty() : boolean
		// ���ڿ��� ���̰� 0�̸� true, �ƴϸ� false
		// ���ڰ� ��������� true, �ƴϸ� false
		// 13. length() : int
		// ���ڿ��� ���̸� ���Ѵ�
		String msg11 = ""; // null���� �ٸ� �ǹ�. null�� �������� �ʾҴٴ� ��
		String msg12 = "Java";
		System.out.println(msg11.isEmpty()); // true
		System.out.println(msg12.isEmpty()); // false
		System.out.println(msg11.length()); // 0
		System.out.println(msg12.length()); // 4
		System.out.println();

		// 13. replace(char oldChar, char newChar) : String
		//	   replace(String target, String replacement) : String
		//	���ڳ� ���ڿ��� �޾Ƽ� ġȯ�ϱ� (replace=ġȯ)
		String msg13 = "���ѹα�";
		String msg14 = msg13.replace("���ѹα�", "korea");
		String msg15 = msg13.replace(msg13, "korea");
		String msg16 = msg13.replace('��', '��');
		System.out.println(msg14);
		System.out.println(msg15);
		System.out.println(msg16);
		System.out.println();

		
		// 14. split(String regex) : String[]
		//	�����ڸ� �޾Ƽ� �迭�� ������.(�迭ũ��� �ڵ�����)
		// 15. split(String regex, int limit) : String[]
		//	�����ڸ� �޾Ƽ� �迭�� ������.(limit�� �迭�� ũ��)
		String msg17 = "���,����,����,������,���ξ���";
		String[] res = msg17.split(","); // ,(�޸�)�� �����޶�
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		System.out.println();
		
		String[] res2 = msg17.split(",", 3); // ������ ,(�޸�) �������� �迭 ������ ������
		System.out.println(res2[0]);
		System.out.println(res2[1]);
		System.out.println(res2[2]);
		
		String[] res3 = msg17.split(",", 10);
		for (int i = 0; i < res3.length; i++) {
			System.out.println("i=" +i+", res3=" +res3[i]);
		}
		
		
		// 16. subString(int beginIndex) : String
		//	���� ��ġ�� �޾Ƽ� �ش� ���ڿ� ������ 
		//	   substring(int beginIndex, int endIndex) " Stirng
		//	���� ��ġ�� �� ��ġ�� �޾Ƽ� �ش� ���ڿ��� ������ (�� ��ġ�� ������ �ȵȴ�)
		String msg18 = "010-1234-5678";
		String res4 = msg18.substring(4); // 1234-5678
		System.out.println(res4);
		String res5 = msg18.substring(4, 8);
		System.out.println(res5); //1234
		
		String res6 = msg18.substring(msg18.indexOf('-')+1, msg18.lastIndexOf('-'));
		System.out.println(res6); //1234
		
		String msg19= "961117";
		// �¾ ���� ����
		String res7 = msg19.substring(0, 2);
		// �¾ �� ����
		String res8 = msg19.substring(2, 4);
		System.out.println(res7);
		System.out.println(res8);
		System.out.println();
		
		// ����) 010-7777-9999 -> 010-XXXX-9999, 010-7777-XXXX
		
		
		// 17. toLowerCase() : String
		//	�ش� ���ڿ��� ��� �빮�ڸ� �ҹ��ڷ� ����
		// 18. toUpperCase() : String
		//	�ش� ���ڿ��� ��� �ҹ��ڸ� �빮�ڷ� ����
		String msg20 = "�ڹ�8 java8 JAVA8";
		String res9 = msg20.toLowerCase();
		String res10 = msg20.toUpperCase();
		System.out.println(res9);
		System.out.println(res10);
		System.out.println();
		
		
		// 19. toString() : String
		//	String�� toString() : ���ڿ� ��ü�� ��ȯ
		//	Object�� toString() : ��� ��ü���� ��밡��
		//						��ü�� ������ �ִ� ������ ������ ���ڿ��� return�� �� ���
		//						(�������̵��� �� �ٽù��)
		String msg21 = "java8 java8 �ڹ�8";
		String res11 = msg21.toString();
		System.out.println(msg21);
		System.out.println(res11);
		System.out.println();
		
		
		// 20. trim() : String
		//	�ش� ���ڿ��� ��, �ڿ� �ִ� ���� ����, �߰� ������ ���� �� ��(�߰� ������ �������)
		String msg22 = "   java �ڹ�  JAVA   ";
		System.out.println(msg22);
		System.out.println(msg22.trim());
		System.out.println(msg22.length()); // 19
		System.out.println(msg22.trim().length()); // 13
		System.out.println();
		
		
		// 21. valueOf(���� �ڷ���) : static Stirng
		boolean p1 = true;
		char p2 = 'd';
		int p3 = 100;
		long p4 = 100L;
		float p5 = 100.0f;
		double p6 = 100.0;
		
		// ���� �ڷ����� + 1; ( boolean ����)
		// System.out.println(p1+1); // �����߻�: boolean�� ������ �� ����
		System.out.println(p2+1); // char + ���� = ����
		System.out.println(p3+1);
		System.out.println(p4+1);
		System.out.println(p5+1);
		System.out.println(p6+1);
		System.out.println();
		
		//String���� ������Ѽ� +1
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
		
		// 21�� �ݴ밳�� (���� �ڷ��� ����� ���ڸ� ���� �ڷ������� ����)
		// Wrapper Class (Boolean, Byte, short, Integer, Long, Float, Double,Character)
		//					parseXXXXX(String s) �޼ҵ带 �̿��ؼ� ����(Character ���� => String.charAt();
		//  - �� �ڷ����� ���¸� ���� ���ڿ��� ��¥ �ڷ������� �����Ű�� Ŭ������
		//  - ���� �ǹ̴� �⺻�ڷ����� ��ü�� ���� �� ����ϴ� Ŭ����
		//	  �⺻�ڷ��� => ��ü�� �ڵ����� ����(����ڽ�)
		//	  ��ü�� => �⺻�ڷ��� �ڵ����� ����(�����ڽ�)
		
		// 1. boolean������ ���ڿ��� Boolean������ ����
		//	Boolean.parseBoolean("true"); => boolean���� String���� ��ȯ 
		//	Boolean.parseBoolean("����������"); -> false
		msg = "0";
		/*if(msg) {
			System.out.println("���漺��");
		} boolean���� �ƴ϶� ���� �߻�*/
		
		boolean a1 = Boolean.parseBoolean(msg);
		if (a1) {
			System.out.println("���漺��1");
		} else {
			System.out.println("���漺��2");
		}
		// 2. int������ ���ڿ��� int������ ���� : Integer.parseInt(String s)
		msg = "100";
		int a2 = Integer.parseInt(msg);
		System.out.println(msg+10);
		System.out.println(a2+10); // int�� ����
		
		// 3. double������ ���ڿ��� Double������ ���� : Double.parseDouble(String s)
		msg = "3.145";
		double a3 = Double.parseDouble(msg);
		System.out.println(msg+10);
		System.out.println(a3+10); // double�� ����
		
		// 4. char������ ���ڿ��� Character������ ����
		//		(��, Character Ŭ������ �����Ѵ�.)
		//		���ڿ����� charAt(��ġ��) �̿��ϸ� �ȴ�.
		msg = "c";
		char a4 = msg.charAt(0);
		System.out.println(msg+1);
		System.out.println(a4+1); // 100
		System.out.println((char)(a4+1)); // d / char�� ����ȯ�ؼ� ��� 
		System.out.println();
		
		// �ֹι�ȣ ���ڸ��� �޾Ҵ�? ���̸� ������
		String jumin = "961117";
		String gender = "1";
		
		// ���ڸ� �� �ڸ� ���ϰ� ������ �� �ڸ� ���ڿ��� ���ڷ� ����
		String year = jumin.substring(0, 2);
		int y_year = Integer.parseInt(year);
		// int y_year = Integer.parseInt(jumin.substring(0, 2)); //���ٷ�
		
		// ���� ���ڸ� �տ� 19�� 20�� ���̰� 
		//	(gender�� 1 �Ǵ� 2�̸� 1900����, 3 �Ǵ� 4�̸� 2000����)
		if (gender.equals("1") || gender.equals("2")) {
			y_year = 1900 + y_year ;
		} else if(gender.equals("3") || gender.equals("4")) {
			y_year = 2000 + y_year ;
		}
		
		
		// (���س⵵ - ���ѳ⵵) + 1 
		Calendar now = Calendar.getInstance();
		int age = (now.get(Calendar.YEAR) - y_year) + 1;
		System.out.println("���̴� " + age + "�Դϴ�.");
	}

}
