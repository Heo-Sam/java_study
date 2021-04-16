package com.ict11.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


// ���������� �����ϴ� ���
public class CopyTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ��ҿ� ���ϸ�: ");
		String pathname1 = scan.next();
		
		System.out.print("���̱� ��ҿ� ���ϸ�: ");
		String pathname2 = scan.next();
		
		File file1 = new File(pathname1);
		File file2 = new File(pathname2);
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			// �б�			
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			String msg = null ;
			StringBuffer sb = new StringBuffer();
			while ((msg=br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			
			// ����
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);			
			
			// String str = sb.toString();
			// bw.write(str);
			bw.write(sb.toString());
			bw.flush();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
	}

}
