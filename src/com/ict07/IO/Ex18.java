package com.ict07.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex18 {
	public static void main(String[] args) {
		// BufferedReader: �ӵ������ ���ؼ� ���, �� �پ� �д� �޼ҵ尡 �ִ�.
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict06.txt";
		File file = new File(pathname);
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
/*			// ict06.txt�� �� ù ���� => �� ���� �б�
			int k = br.read();
			System.out.println((char)(k));
*/
/*			// ��ü �б�..
			int k = 0;
			while ((k=br.read())  !=  -1) {
				System.out.print((char)(k));
			}
*/			
/*			// char[] ����ϱ�
			char[] c = new char[(int)(file.length())];
			br.read(c);
			
			for (char k : c) {
				System.out.print(k);
			}
*/			
/*			char[] c = new char[(int)(file.length())];
			br.read(c);
			String msg = new String(c);
			System.out.println(msg);
*/			
			// �� �� �б�
			// String msg = br.readLine(); // ù ���� �о�´�
			// System.out.println(msg);
			
			// ���� ��ü �б�
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg=br.readLine()) != null) { 
				sb.append(msg+"\n");
				// �� �� ����->msg����->null�� �ƴϸ� append���� --> ��� �ݺ�
			}
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}