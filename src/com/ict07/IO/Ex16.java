package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex16 {
	public static void main(String[] args) {
		// BufferedWrite: �ӵ� ����� ���� ���, �� �ٲٱ� �޼ҵ尡 ������
		
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict06.txt";
		File file = new File(pathname);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// �� ���� ����
			bw.write(97); // a
			bw.write(65); // A
			
			// int�̹Ƿ� char�� ��ü
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			
			// FileOutputStream�� �ѱ� ���Ⱑ �ȵ�����
			// FileWriter�� ����
			bw.write('��');
			bw.write('��');
			bw.write('��');
			bw.write('��');
			bw.write(13);
			
			char[] c = {'k','o','r','e','a',13,'��','��','��','��',13};
			bw.write(c);
			
			bw.write("�ѱ�ICT���簳�߿�\n");
			bw.newLine();// �ٹٲ�
			bw.write("1������\n");
			bw.write("�ڹټ���\n");
			
			
			
			bw.flush();			
		} catch (Exception e) {
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
	}

}
