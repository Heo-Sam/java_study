package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {
	public static void main(String[] args) {
		// 속도 향상을 위해 BufferedInputStream을 사용한다.
		// 혼자서는 사용할 수 없고 반드시 InputStream을 받아서 사용한다.
		// - 생성자: BufferedInputStream(InputStream in)
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
/*			 한 글자 읽어오기: read() -> 숫자로 나옴(아슥히) -> 형변환
			int k = bis.read();
			System.out.println(k + " : " + (char)(k));
			
			★한 글자씩 계속 읽기: 그림, 소리, 동영상, 파일을 읽을 때는 무조건 해당 방식 사용.
									단, 비영어권 문자들은 읽을 수 없다.
			int k = 0;
			while(true) {
				k = bis.read();
				if(k == -1) break;
				System.out.println(k + " : " + (char)(k));
			}
*/			
			//★한 글자씩 계속 읽기: 그림, 소리, 동영상, 파일을 읽을 때는 무조건 해당 방식 사용.
			//						단, 비영어권 문자들은 읽을 수 없다.
/*			int k = 0;
			// fis를 이용해서 한 글자를 읽었을 때 -1과 같지 않으면 실행해라 = -1이면 실행하지 마셈
			while ((k=bis.read()) != -1) { 
				System.out.println(k + " : " + (char)(k));
			}
*/			
			
/*			// 배열을 이용해서 읽기
			byte[] b = new byte[(int)(file.length())]; // file.length() ->  파일의 크기, long형
			bis.read(b);
			for (byte k : b) {
				System.out.println(k + " : " + (char)(k));
			}
*/
			// String을 이용(비영어권 이외 문자도 가능)
			// String생성자에는 byte[]을 받는 생성자가 있다.
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			String str = new String(b);
			System.out.println(str);

			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
