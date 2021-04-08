package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex09 {
	public static void main(String[] args) {
		// C:\\sammy_study\\util\\test100.txt 안에
		// 이름: ㅇㅇㅇ
		// 나이: ㅇㅇ
		// 전화번호: ㅇㅇㅇ-ㅇㅇㅇㅇ-ㅇㅇㅇㅇ
		// 작성하는 코딩을 하시요

		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"test100.txt";
		 
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String msg = "이름 : 허샘\n나이 : 26\n전화번호 : 010-2465-9592";
			byte[] b = msg.getBytes();
			fos.write(b);
			bos.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				bos.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
