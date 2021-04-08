package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex16 {
	public static void main(String[] args) {
		// BufferedWrite: 속도 향상을 위해 사용, 줄 바꾸기 메소드가 존재함
		
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict06.txt";
		File file = new File(pathname);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// 한 글자 쓰기
			bw.write(97); // a
			bw.write(65); // A
			
			// int이므로 char로 대체
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			
			// FileOutputStream은 한글 쓰기가 안되지만
			// FileWriter는 가능
			bw.write('대');
			bw.write('한');
			bw.write('민');
			bw.write('국');
			bw.write(13);
			
			char[] c = {'k','o','r','e','a',13,'한','국','사','람',13};
			bw.write(c);
			
			bw.write("한국ICT인재개발원\n");
			bw.newLine();// 줄바꿈
			bw.write("1강의장\n");
			bw.write("자바수업\n");
			
			
			
			bw.flush();			
		} catch (Exception e) {
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
	}

}
