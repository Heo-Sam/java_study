package com.ict04.exception;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Ex01 {
	// �ڹٿ��� ������ �߻��ϸ� ������ ���α׷��� �����Ų��.
	// �׷��� ������ ���ܳ� ����� ���ܸ� ������ ó���ϴ� ����� ����ϸ�
	// ������ ���α׷��� ����Ǵ� ���� �ƴ϶�, ���������� ���Ḧ ����
	// *�������� ���Ḧ �� �� �ֵ���* �ϴ� ����� ����ó����� �Ѵ�.
	
	// �߰��߰� 
	
	public static void main(String[] args) {
		// ����ó�� : Exception.
		//			  try ~ catch ~
		// ���� : ���������� ���Ḧ �������� ����� ����,
		//		  ���� �߻� �� ���ܿ� ���� ó���� ���ش�.
		// ���� : try {
		//			���ܰ� �߻��� �� �ִ� ����;
		//			���ܰ� �߻��� �� �ִ� ����;
		//			���ܰ� �߻��� �� �ִ� ����;
		//		  } catch (���ܹ߻���ü e) {
		//			���� �߻� �� ó���ϴ� ����;
		//		  }
		
		try {
			int[] var = {10,20,30};
			for(int i = 0; i <= var.length; i++) {
				System.out.println(1);
				System.out.println(2);
				System.out.println("var[" + i + "] = " + var[i]);
				System.out.println(3);
				System.out.println(4);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.println("�����ϼ̽��ϴ�.");
		
	}

}