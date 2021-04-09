package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// ��ü ����ȭ: ObjectOutputStream : WriteObject()�� ���
public class Ex24_Output {
	public static void main(String[] args) {
		// ��ü ����ȭ: Ư�� Ŭ����(VO)�� ��ü�� ���� Ư�� ��ġ�� .ser�� ����� �����Ѵ�.
		//				��ü���� ������ �ִ� ������ ����ȭ �Ǿ��ִ�.(����� ������ ����� �� �� ����.)
		// ��������: Ư�� ��ġ�� ������ �����Ͽ� .serȮ���ڷ� ����� ����
		//		=> FileOutputStrea, BufferedOutPutStream �ʿ�
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict08.ser";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			// ��Ʈ�� ü�ι��
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// ��ü ����ȭ�� �ϱ� ���� ��ü�� �������
			Ex24_VO vo1 = new Ex24_VO("��浿", 37, 67.3, true); // �����ڸ� �޾Ƽ� �ٷ� ���� �Է�
			Ex24_VO vo2 = new Ex24_VO("������", 28, 77.1, true); // �����ڸ� �޾Ƽ� �ٷ� ���� �Է�
			Ex24_VO vo3 = new Ex24_VO("����", 3, 8.6, false); // �����ڸ� �޾Ƽ� �ٷ� ���� �Է�
			Ex24_VO vo4 = new Ex24_VO("�����", 10, 14.9, true); // �����ڸ� �޾Ƽ� �ٷ� ���� �Է�
			Ex24_VO vo5 = new Ex24_VO("��ġ", 17, 57.4, false); // �����ڸ� �޾Ƽ� �ٷ� ���� �Է�
			
			// ��ü�� �迭�̳� �÷��ǿ� ���� �� �ִ�.
			ArrayList<Ex24_VO> list = new ArrayList<Ex24_VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			
			// ��ü ����ȭ ����
			oos.writeObject(list);
			oos.flush();
			} catch (Exception e) {
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
		
	}

}
