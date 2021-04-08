package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		// 속도 향상을 위해서 BufferedOutputStream을 사용한다.
		// 혼자서는 사용할 수 없고 반드시 OutputStream을 받아서 사용.
		//  - 생성자: BufferedOutputStream(OutputStream out)
		
		// 특정 위치의 파일까지 지정
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict02.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			//  기존 파일이 있으면 덮어쓰기 하고, 없으면 생성한다.
			fos = new FileOutputStream(file);
			// 단독사용 불가로 fos를 받아서 사용
			bos = new BufferedOutputStream(fos); 
			
			
			//  기존 파일이 있으면 이어쓰기 하고, 없으면 생성한다.
			// fos = new FileOutputStream(file, true);
			
			// write(int b)이기 때문에 char 사용 가능
			bos.write(65); // A
			bos.write(97); // a
			bos.write('j');
			bos.write('a');
			bos.write('v');
			bos.write('a');
			
			// 자바에서 줄 변경 - 13 (ASCII코드에서 Carriage return = CR = \r) 이다
			// 다른 언어중에는 (\r\n(Linefeed = 10)을 같이 사용하는 경우도 있다.)
			bos.write(13);
			
			// 배열을 이용해서 여러글자 쓰기
			byte[] b = {'S','a','m','m','y',13,'H','e','l','l','o',13};
			bos.write(b);
			
			// String을 이용하면 영어이외의 문자도 가능핟
			String str = "HI\r나는\r1117\r★☆★\r許3";
			byte[] b2 = str.getBytes();
			bos.write(b2);
			
			
			
			bos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close(); 
				// if(bos != null) fos.close(); // if() 제외가능
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
