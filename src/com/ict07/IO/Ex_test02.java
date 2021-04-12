package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex_test02 {
	public static void main(String[] args) {
		String pathname1 = "C:" + File.separator + "sammy_study" + File.separator + "util" + File.separator
				+ "Test.txt";
		File read_file = new File(pathname1);

		String pathname2 = "C:" + File.separator + "sammy_study" + File.separator + "util" + File.separator + "res"
				+ File.separator + "Test.txt";
		File write_file = new File(pathname2);
		
		// 복사할 파일을 먼저 읽어오기
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		// 붙여넣기 하려면 써야겠지 (새파일 생성하는거랑 비슷)
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;	
		
		try {
			// 파일 읽어오기
			fis = new FileInputStream(read_file);
			bis = new BufferedInputStream(fis);
			
			// 파일 쓰기
			fos = new FileOutputStream(write_file);
			bos = new BufferedOutputStream(fos);
			
			int k = 0;
			while ((k=bis.read()) != -1) {
				bos.write(k);
			}
			bos.flush();
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				bis.close();
				fis.close();
				bos.close();
				fos.close();
				
				read_file.delete();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}

	}

}
