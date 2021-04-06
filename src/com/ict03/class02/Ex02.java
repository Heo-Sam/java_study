package com.ict03.class02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02 {
	public static void main(String[] args) {
		// ��¥ ���� Ŭ���� : ���� ����ϰ� �ִ� ��ǻ�� ����
		// Date Ŭ���� 
		// Calendar Ŭ����
		
		//Date Ŭ����
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.  HH:mm:ss. E");
		System.out.println(dateFormat.format(date));
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yy.M.d.  HH:mm:ss. E");
		System.out.println(dateFormat2.format(date));
		
		// ��, ��, ��, ��, ��, ��, ���� ���� ���ϱ�
		System.out.println(date.getYear()+1900 + "�⵵"); // Calendar.get(Calendar.YEAR) = 2021-1900
		System.out.println(date.getMonth()+1 + "��"); // 0-11
		System.out.println(date.getDate()+"��");
		System.out.println(date.getHours()+"��");
		System.out.println(date.getMinutes()+"��");
		System.out.println(date.getSeconds()+"��");
		System.out.println(date.getDay()); // Calendar.get(Calendar.DAY_OF_WEEK) ����(0=>�Ͽ���, 6=>�����)
		
		System.out.println("==================================");
		
		// Calendar Ŭ����
		// ���� ��¥�� �ð��� ���� ���� new���� ������� �ʰ� ��ü�����Ѵ�.
		// ��,��,��,��,��,�ʸ� ���� �� Calendar.getInstance().get(Calendar.���) ���
		System.out.println(Calendar.getInstance().get(Calendar.YEAR)+"�⵵1");
		System.out.println();
		Calendar now = Calendar.getInstance(); // ��ǻ���� ���� ��¥�� �ð�, ������ ���Ѵ�.
		System.out.println(now.get(Calendar.YEAR)+"�⵵2");
		System.out.println(now.get(Calendar.MONTH)+1+"��");
		System.out.println(now.get(Calendar.DATE) + "��1");
		System.out.println(now.get(Calendar.DAY_OF_MONTH) + "��2");
		
		// �ð�: 12�ð���, 24�ð���
		System.out.println(now.get(Calendar.HOUR)+"��1"); //12�ð�
		System.out.println(now.get(Calendar.HOUR_OF_DAY)+"��2"); //24�ð�
		
		// 12�ð����� �������İ� �ʿ��ϴ�
		// AM = 0, PM = 1
		int res = now.get(Calendar.AM_PM);
		if (res == 0) {
			System.out.println("AM " + now.get(Calendar.HOUR) + "��");
		} else if (res == 1) {
			System.out.println("PM " + now.get(Calendar.HOUR) + "��");
		}
		
		// ���� (1=�Ͽ��� ~ 7=�����)
		int res2 = now.get(Calendar.DAY_OF_WEEK);
		switch (res2) {
		case 1: System.out.println("�Ͽ���"); break;
		case 2: System.out.println("������"); break;
		case 3: System.out.println("ȭ����"); break;
		case 4: System.out.println("������"); break;
		case 5: System.out.println("�����"); break;
		case 6: System.out.println("�ݿ���"); break;
		case 7: System.out.println("�����"); break;
		}
		
		
		

		
	}

}
