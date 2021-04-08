package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex14 {
	public static void main(String[] args) {
		// PrintStream: 모든 기본 자료형을 출력할 수 있다.
		//				화면에 출력하려면 System.out 을 사용
		//				파일에 출력하려면 FileOutputStream과 BufferedOutputStream 을 활용
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict04.txt";
		
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
			
			
			// 화면에 출력
			System.out.println(24.1);
			System.out.println(20);
			System.out.println('S');
			System.out.println(true);
			System.out.println("대한민국");
			
			
			// 파일(메모장)에 출력
			ps.println(24.1);
			ps.println(20);
			ps.println('S');
			ps.println(true);
			ps.println("대한민국");
			
		} catch (Exception e) {
			
		} finally {
			try {
				// ps는 close할 필요x
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
	}
}
