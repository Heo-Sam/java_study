package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex_test03 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "sammy_study" + File.separator + "util" + File.separator
				+ "Test_01.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps =  null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
			
			String msg = "mang,go, apple,lemon";
			byte[] b = msg.getBytes();
			bos.write(b);
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
