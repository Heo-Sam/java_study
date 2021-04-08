package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		// �ӵ� ����� ���ؼ� BufferedOutputStream�� ����Ѵ�.
		// ȥ�ڼ��� ����� �� ���� �ݵ�� OutputStream�� �޾Ƽ� ���.
		//  - ������: BufferedOutputStream(OutputStream out)
		
		// Ư�� ��ġ�� ���ϱ��� ����
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict02.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			//  ���� ������ ������ ����� �ϰ�, ������ �����Ѵ�.
			fos = new FileOutputStream(file);
			// �ܵ���� �Ұ��� fos�� �޾Ƽ� ���
			bos = new BufferedOutputStream(fos); 
			
			
			//  ���� ������ ������ �̾�� �ϰ�, ������ �����Ѵ�.
			// fos = new FileOutputStream(file, true);
			
			// write(int b)�̱� ������ char ��� ����
			bos.write(65); // A
			bos.write(97); // a
			bos.write('j');
			bos.write('a');
			bos.write('v');
			bos.write('a');
			
			// �ڹٿ��� �� ���� - 13 (ASCII�ڵ忡�� Carriage return = CR = \r) �̴�
			// �ٸ� ����߿��� (\r\n(Linefeed = 10)�� ���� ����ϴ� ��쵵 �ִ�.)
			bos.write(13);
			
			// �迭�� �̿��ؼ� �������� ����
			byte[] b = {'S','a','m','m','y',13,'H','e','l','l','o',13};
			bos.write(b);
			
			// String�� �̿��ϸ� �����̿��� ���ڵ� ������
			String str = "HI\r����\r1117\r�ڡ١�\r��3";
			byte[] b2 = str.getBytes();
			bos.write(b2);
			
			
			
			bos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close(); 
				// if(bos != null) fos.close(); // if() ���ܰ���
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
