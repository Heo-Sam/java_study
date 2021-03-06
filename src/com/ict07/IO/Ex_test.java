package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex_test {
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"Test.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String msg = "이름: 허샘\n나이:26\n주소:안양시\n전화번호:010-";
			byte[] b = msg.getBytes();
			fos.write(b);
			bos.flush();
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
	}

}
