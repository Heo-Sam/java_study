package com.ict07.IO;

import java.io.File;
import java.io.FileWriter;

public class Ex15 {
	public static void main(String[] args) {
		// ���� ��Ʈ��(����߽�): ��� ó���� 2byte�� ó��
		// ���: �� ������ ��� ���� ������ �������ϵ�
		// �ֻ��� Ŭ����: Reader(�Է�). Writer(���)
		
		// FileOutputStream(����Ʈ): 1byteó��, write(int b), write(byte[] b)
		// FileWriter(����)	: 2byteó��, write(int b), write(char[] b), write(String str)
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict05.txt";
		File file = new File(pathname);
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			
			// �� ���� ����
			fw.write(97); // a
			fw.write(65); // A
			
			// int�̹Ƿ� char�� ��ü
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			
			// FileOutputStream�� �ѱ� ���Ⱑ �ȵ�����
			// FileWriter�� ����
			fw.write('��');
			fw.write('��');
			fw.write('��');
			fw.write('��');
			fw.write(13);
			
			char[] c = {'k','o','r','e','a',13,'��','��','��','��',13};
			fw.write(c);
			
			fw.write("�ѱ�ICT���簳�߿�\n");
			fw.write("1������\n");
			fw.write("�ڹټ���\n");
			
			
			
			fw.flush();			
		} catch (Exception e) {
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
	}

}