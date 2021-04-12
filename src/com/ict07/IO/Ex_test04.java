package com.ict07.IO;

import java.io.File;
import java.io.FileWriter;

public class Ex_test04 {
	public static void main(String[] args) {
		// 문자스트림
		String pathname = "C:" + File.separator + "sammy_study" + File.separator + "util" + File.separator
				+ "Test_02.txt";
		File file = new File(pathname);
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			
			fw.write("허삼쓰 시험공부쓰\n");
			fw.write("하나도 안했쥬?");
			
			fw.flush();			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
