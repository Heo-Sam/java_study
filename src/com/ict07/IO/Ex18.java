package com.ict07.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex18 {
	public static void main(String[] args) {
		// BufferedReader: 속도향상을 위해서 사용, 한 줄씩 읽는 메소드가 있다.
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict06.txt";
		File file = new File(pathname);
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
/*			// ict06.txt의 맨 첫 글자 => 한 글자 읽기
			int k = br.read();
			System.out.println((char)(k));
*/
/*			// 전체 읽기..
			int k = 0;
			while ((k=br.read())  !=  -1) {
				System.out.print((char)(k));
			}
*/			
/*			// char[] 사용하기
			char[] c = new char[(int)(file.length())];
			br.read(c);
			
			for (char k : c) {
				System.out.print(k);
			}
*/			
/*			char[] c = new char[(int)(file.length())];
			br.read(c);
			String msg = new String(c);
			System.out.println(msg);
*/			
			// 한 줄 읽기
			// String msg = br.readLine(); // 첫 줄을 읽어온다
			// System.out.println(msg);
			
			// 파일 전체 읽기
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg=br.readLine()) != null) { 
				sb.append(msg+"\n");
				// 한 줄 실행->msg대입->null이 아니면 append실행 --> 계속 반복
			}
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
