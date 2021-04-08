package com.ict07.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		// 1. FileInputStream: ������ ������� 1byte�� ������ �б⸦ �� �� �ִ� ��Ʈ��
		// - ������: FileInputStream(File file), FileInputStream(String name)
		//		File file, String name => Ư����ġ + �����̸�
		
		// - �ֿ� �޼ҵ�
		//	  read(): int -> ����� ����(ASCII)�� ���´� ..
		//					char������ ����ȯ �ؾ� �� ..
		//					�� �̻� ���� ���� ���� ��� -1�� ���´�.
		//					�񿵾�� ���ڴ� ���� �� ����.
		//	  read(byte[] b): int -> �迭�� ���� ���ڿ� ������ �迭 ũ�⸸ŭ ���ڸ� ���� �� �ִ�.
		//					= (byte[] b)�� ���� ���ڵ��� �迭 ũ�⸸ŭ ����ȴ�. 
		//	  close(): open�� ��Ʈ�� �ݱ�(��� �� �ݱ�), ���� finally���� ó��
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			
/*			 �� ���� �о����: read() -> ���ڷ� ����(�ƽ���) -> ����ȯ
			int k = fis.read();
			System.out.println(k + " : " + (char)(k));
			
			���� ���ھ� ��� �б�: �׸�, �Ҹ�, ������, ������ ���� ���� ������ �ش� ��� ���.
									��, �񿵾�� ���ڵ��� ���� �� ����.
			int k = 0;
			while(true) {
				k = fis.read();
				if(k == -1) break;
				System.out.println(k + " : " + (char)(k));
			}
*/			
			//���� ���ھ� ��� �б�: �׸�, �Ҹ�, ������, ������ ���� ���� ������ �ش� ��� ���.
			//						��, �񿵾�� ���ڵ��� ���� �� ����.
/*			int k = 0;
			// fis�� �̿��ؼ� �� ���ڸ� �о��� �� -1�� ���� ������ �����ض� = -1�̸� �������� ����
			while ((k=fis.read()) != -1) { 
				System.out.println(k + " : " + (char)(k));
			}
*/			
			
/*			// �迭�� �̿��ؼ� �б�
			byte[] b = new byte[(int)(file.length())]; // file.length() ->  ������ ũ��, long��
			fis.read(b);
			for (byte k : b) {
				System.out.println(k + " : " + (char)(k));
			}
*/
			// String�� �̿�(�񿵾�� �̿� ���ڵ� ����)
			// String�����ڿ��� byte[]�� �޴� �����ڰ� �ִ�.
			byte[] b = new byte[(int)(file.length())];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);

			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
