package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex10 {
	public static void main(String[] args) {
		// C:\\sammy_study\\util\\test100.txt �ȿ�
		// �̸�: ������
		// ����: ����
		// ��ȭ��ȣ: ������-��������-��������
		// �о�� �ڵ��� �Ͻÿ�
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"test100.txt";
		
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] b = new byte[(int)(file.length())];
			fis.read(b);
			String msg = new String(b);
			System.out.println(msg);
			
		} catch (Exception e) {
		} finally {
			try {
				fis.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
