package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex14 {
	public static void main(String[] args) {
		// PrintStream: ��� �⺻ �ڷ����� ����� �� �ִ�.
		//				ȭ�鿡 ����Ϸ��� System.out �� ���
		//				���Ͽ� ����Ϸ��� FileOutputStream�� BufferedOutputStream �� Ȱ��
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict04.txt";
		
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
			
			
			// ȭ�鿡 ���
			System.out.println(24.1);
			System.out.println(20);
			System.out.println('S');
			System.out.println(true);
			System.out.println("���ѹα�");
			
			
			// ����(�޸���)�� ���
			ps.println(24.1);
			ps.println(20);
			ps.println('S');
			ps.println(true);
			ps.println("���ѹα�");
			
		} catch (Exception e) {
			
		} finally {
			try {
				// ps�� close�� �ʿ�x
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
	}
}
