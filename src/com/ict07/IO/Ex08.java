package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {
	public static void main(String[] args) {
		// �ӵ� ����� ���� BufferedInputStream�� ����Ѵ�.
		// ȥ�ڼ��� ����� �� ���� �ݵ�� InputStream�� �޾Ƽ� ����Ѵ�.
		// - ������: BufferedInputStream(InputStream in)
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
/*			 �� ���� �о����: read() -> ���ڷ� ����(�ƽ���) -> ����ȯ
			int k = bis.read();
			System.out.println(k + " : " + (char)(k));
			
			���� ���ھ� ��� �б�: �׸�, �Ҹ�, ������, ������ ���� ���� ������ �ش� ��� ���.
									��, �񿵾�� ���ڵ��� ���� �� ����.
			int k = 0;
			while(true) {
				k = bis.read();
				if(k == -1) break;
				System.out.println(k + " : " + (char)(k));
			}
*/			
			//���� ���ھ� ��� �б�: �׸�, �Ҹ�, ������, ������ ���� ���� ������ �ش� ��� ���.
			//						��, �񿵾�� ���ڵ��� ���� �� ����.
/*			int k = 0;
			// fis�� �̿��ؼ� �� ���ڸ� �о��� �� -1�� ���� ������ �����ض� = -1�̸� �������� ����
			while ((k=bis.read()) != -1) { 
				System.out.println(k + " : " + (char)(k));
			}
*/			
			
/*			// �迭�� �̿��ؼ� �б�
			byte[] b = new byte[(int)(file.length())]; // file.length() ->  ������ ũ��, long��
			bis.read(b);
			for (byte k : b) {
				System.out.println(k + " : " + (char)(k));
			}
*/
			// String�� �̿�(�񿵾�� �̿� ���ڵ� ����)
			// String�����ڿ��� byte[]�� �޴� �����ڰ� �ִ�.
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			String str = new String(b);
			System.out.println(str);

			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
