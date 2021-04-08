package com.ict07.IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex02 {
	public static void main(String[] args) {
		// File클래스를 사용하기 전에 특정 위치를 지정해야 함(~에서 ~하겠다)
		String pathname_1 = "C:\\sammy_study\\util"; // 운영체제가 windows일 때 
		String pathname_2 = "C:/sammy_study/util";  // 운영체제가 Linux, Unix일 때
		
		// 운영체제와 상관없이 사용하는 방법 (FM)
		String pathname_3 = "C:"+File.separator+"sammy_study"+File.separator+"util";
		
		File file = new File(pathname_3);
		//					↗
		// ** list(): 지정한 위치의 파일 및 디렉토리를 String[]에 담는다.
		String[] arr = file.list();
		
		for (String k : arr) {
			// System.out.println(k);
			
			File file2 = new File(pathname_3, k); // 생성자
			// System.out.println(file2); // 절대경로 출력
			
			// 날짜 형식 지정
			SimpleDateFormat day = new SimpleDateFormat("yyyy-MM-dd hh:mm");
			
			
			// 컴퓨터에 저장할 수 있는 종류는 only 디렉토리 or 파일
			// 디렉토리 => 크기가 존재하지 않음
			// 파일 => 크기가 존재함.
			if(file2.isDirectory()) {
				System.out.println("디렉토리 : " + file2 + " / 크기가 존재하지 않음\n"
						+ "수정한 날짜: " + day.format(file.lastModified()));
				System.out.println();
			} else {
				System.out.println("파일 : " + file2 + ", 크기 : " + (int)(file2.length()/1024) + "KB\n"
						+ "수정한 날짜: " + day.format(file.lastModified()));
				System.out.println();
			}
		}
		
	}
}
