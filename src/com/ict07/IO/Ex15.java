package com.ict07.IO;

import java.io.File;
import java.io.FileWriter;

public class Ex15 {
	public static void main(String[] args) {
		// 문자 스트림(사람중심): 모든 처리를 2byte씩 처리
		// 대상: 전 세계의 모든 언어로 구성된 문서파일들
		// 최상위 클래스: Reader(입력). Writer(출력)
		
		// FileOutputStream(바이트): 1byte처리, write(int b), write(byte[] b)
		// FileWriter(문자)	: 2byte처리, write(int b), write(char[] b), write(String str)
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict05.txt";
		File file = new File(pathname);
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			
			// 한 글자 쓰기
			fw.write(97); // a
			fw.write(65); // A
			
			// int이므로 char로 대체
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			
			// FileOutputStream은 한글 쓰기가 안되지만
			// FileWriter는 가능
			fw.write('대');
			fw.write('한');
			fw.write('민');
			fw.write('국');
			fw.write(13);
			
			char[] c = {'k','o','r','e','a',13,'한','국','사','람',13};
			fw.write(c);
			
			fw.write("한국ICT인재개발원\n");
			fw.write("1강의장\n");
			fw.write("자바수업\n");
			
			
			
			fw.flush();			
		} catch (Exception e) {
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
	}

}
