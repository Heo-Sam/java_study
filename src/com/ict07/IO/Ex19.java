package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		// �����ϴ� ��ġ�� ���� ���� �ް�
		// ���� ��ġ�� ���ϸ��� �޾Ƽ� ���̱� ����
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����ϴ� ��ġ�� ���� �̸� : ");
		String pathname_copy = scan.next();
		System.out.print("�ٿ��ֱ� �� ��ġ�� ���� �̸� : ");
		String pathname_paste = scan.next();
		
		
		File file1 = new File(pathname_copy);
		File file2 = new File(pathname_paste);
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			// �б�
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();			
			while ((msg=br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			
			//����			
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			//bw.write(sb.toString());
			
			String str = sb.toString();
			str = str.replace("���ѹα�", "��������");
			bw.write(str);
			
			bw.flush();
			
			//System.out.println(sb.toString());
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				fr.close();
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
		
	}

}
