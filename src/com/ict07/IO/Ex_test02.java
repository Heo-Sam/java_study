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
		
		// ������ ������ ���� �о����
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		// �ٿ��ֱ� �Ϸ��� ��߰��� (������ �����ϴ°Ŷ� ���)
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;	
		
		try {
			// ���� �о����
			fis = new FileInputStream(read_file);
			bis = new BufferedInputStream(fis);
			
			// ���� ����
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
