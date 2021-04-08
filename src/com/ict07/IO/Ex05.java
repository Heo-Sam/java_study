package com.ict07.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		// 1. FileOutputStream : 파일을 대상으로 1byte씩 데이터 쓰기를 할 수 있는 스트림
		//	- 생성자: FileOutputStream(File file), FileOutputStream(File file, boolean append)
		//			  FileOutputStream(String name), FileOutputStream(String name, boolean append)
		//		File file, String name => 특정 위치 + 파일 이름
		// 	 	boolean append: false or 생략 => 덮어쓰기, true => 이어쓰기 
		
		//	- 주요 메소드
		//	  write(int b): 한 글자 쓰기 가능(영문 대소문자, 숫자, 일부 특수문자만)
		//	  write(byte[] b): 여러 글자를 byte[]에 넣어서 쓰기 가능
		//	  flush(): write 후 반드시 실행하자
		//	  close(): open오픈 된 스트림 닫기(사용 후 닫기), 보통 finally(무조건 실행돼야 하는 문장)로 처리
		
		// 특정 위치의 파일까지 지정
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		
		try {
			//  기존 파일이 있으면 덮어쓰기 하고, 없으면 생성한다.
			fos = new FileOutputStream(file);
			
			
			//  기존 파일이 있으면 이어쓰기 하고, 없으면 생성한다.
			// fos = new FileOutputStream(file, true);
			
			// write(int b)이기 때문에 char 사용 가능
			fos.write(65); // A
			fos.write(97); // a
			fos.write('j');
			fos.write('a');
			fos.write('v');
			fos.write('a');
			
			// 자바에서 줄 변경 - 13 (ASCII코드에서 Carriage return = CR = \r) 이다
			// 다른 언어중에는 (\r\n(Linefeed = 10)을 같이 사용하는 경우도 있다.)
			fos.write(13);
			
			// 배열을 이용해서 여러글자 쓰기
			byte[] b = {'b','o','y','s',13,'g','i','r','l','s',13};
			fos.write(b);
			
			// String을 이용하면 영어이외의 문자도 가능핟
			String str = "Hello\r안녕\r123\r★☆★\r許";
			byte[] b2 = str.getBytes();
			fos.write(b2);
			
			
			
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close(); // if() 제외가능
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
