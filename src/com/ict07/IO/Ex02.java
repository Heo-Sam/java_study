package com.ict07.IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex02 {
	public static void main(String[] args) {
		// FileŬ������ ����ϱ� ���� Ư�� ��ġ�� �����ؾ� ��(~���� ~�ϰڴ�)
		String pathname_1 = "C:\\sammy_study\\util"; // �ü���� windows�� �� 
		String pathname_2 = "C:/sammy_study/util";  // �ü���� Linux, Unix�� ��
		
		// �ü���� ������� ����ϴ� ��� (FM)
		String pathname_3 = "C:"+File.separator+"sammy_study"+File.separator+"util";
		
		File file = new File(pathname_3);
		//					��
		// ** list(): ������ ��ġ�� ���� �� ���丮�� String[]�� ��´�.
		String[] arr = file.list();
		
		for (String k : arr) {
			// System.out.println(k);
			
			File file2 = new File(pathname_3, k); // ������
			// System.out.println(file2); // ������ ���
			
			// ��¥ ���� ����
			SimpleDateFormat day = new SimpleDateFormat("yyyy-MM-dd hh:mm");
			
			
			// ��ǻ�Ϳ� ������ �� �ִ� ������ only ���丮 or ����
			// ���丮 => ũ�Ⱑ �������� ����
			// ���� => ũ�Ⱑ ������.
			if(file2.isDirectory()) {
				System.out.println("���丮 : " + file2 + " / ũ�Ⱑ �������� ����\n"
						+ "������ ��¥: " + day.format(file.lastModified()));
				System.out.println();
			} else {
				System.out.println("���� : " + file2 + ", ũ�� : " + (int)(file2.length()/1024) + "KB\n"
						+ "������ ��¥: " + day.format(file.lastModified()));
				System.out.println();
			}
		}
		
	}
}
