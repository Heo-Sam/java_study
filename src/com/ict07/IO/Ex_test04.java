package com.ict07.IO;

import java.io.File;
import java.io.FileWriter;

public class Ex_test04 {
	public static void main(String[] args) {
		// ���ڽ�Ʈ��
		String pathname = "C:" + File.separator + "sammy_study" + File.separator + "util" + File.separator
				+ "Test_02.txt";
		File file = new File(pathname);
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			
			fw.write("��ﾲ ������ξ�\n");
			fw.write("�ϳ��� ������?");
			
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
