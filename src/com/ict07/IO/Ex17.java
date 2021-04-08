package com.ict07.IO;

import java.io.File;
import java.io.FileReader;

public class Ex17 {
	public static void main(String[] args) {
		// FileInputStream: 1byteó��, read():int(�ƽ�Ű) -> char(����ȯ), ���� ��ҹ���, ���ڸ� ����
		//					read(byte[] b): , String�̿�
		// FileReader	: read(): int(�����ڵ�) -> char(����ȯ), �� ���� ���� ó�� ����
		//				  read(char[] b), String �̿�
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict06.txt";
		File file = new File(pathname);
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			
/*			// ict06.txt�� �� ù ���� => �� ���� �б�
			int k = fr.read();
			System.out.println(k+" : "+(char)(k));
*/
/*			// ��ü �б�..
			int k = 0;
			while ((k=fr.read())  !=  -1) {
				System.out.print((char)(k));
			}
*/			
/*			// char[] ����ϱ�
			char[] c = new char[(int)(file.length())];
			fr.read(c);
			
			for (char k : c) {
				System.out.print(k);
			}
*/			
			char[] c = new char[(int)(file.length())];
			fr.read(c);
			String msg = new String(c);
			System.out.println(msg);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
