package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex11 {
	public static void main(String[] args) {
		// C:\\sammy_study\\util\\java_1.png������
		// C:\\sammy_study\\util\\res �ȿ� �����ϴ� �ڵ�
		
		// �д� ��ġ
		String pathname1 = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"video.mp4";
		File read_file = new File(pathname1);
		
		// ���� ��ġ
		String pathname2 = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"res"+File.separator+"video.mp4";
		File write_file2 = new File(pathname2);
		
		// ���� �о� (InputStream)
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		// �״��� �� (OutputStream)
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(read_file); // ���� �а�(Input)
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(write_file2); // ���� (Output)
			bos = new BufferedOutputStream(fos);
			
			// �׸�, �Ҹ�, ������ ���ϵ��� ó��(����,�̵�)�� ���� ������ 1byte�� ó���ؾ� �ȴ�.
			int k = 0;
			while ((k=bis.read()) != -1) {
				// 1byte ����
				bos.write(k);
			}
			bos.flush();
			
		} catch (Exception e) {
		} finally {
			try {  // ���۸� ���� �ݰ� ��Ʈ���� �ݾ���� ��
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
		
	}

}