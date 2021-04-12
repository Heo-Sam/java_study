package com.ict08.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Ex03 {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			// ������ openStream���ٴ� �Ʒ� ������� �����!
			URL url = new URL("https://www.naver.com");
			URLConnection conn = url.openConnection();
		/*	is = url.openStream();
			isr = new InputStreamReader(is,"utf-8");
			br = new BufferedReader(isr);
		*/	
			// 3���� �� ���� �� �ٷ� �����ϱ�
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
			
			System.out.println("���ڵ� : " + conn.getContentEncoding());
			System.out.println("���� : " + conn.getContentLength());
			System.out.println("���� Ÿ�� : " + conn.getContentType());
			System.out.println("====================");
			
			// HTTP: ����� �ٵ�� ��������
			// ��� => HTTP�ٵ� �� ��û/���信 ���� ������ �����ϰ� �ִ�.
			//		��� ������ �̿��ؼ� �� ����̴��� �ؼ��ϰ� �����Ѵ�.
			// �ٵ� => HTML �ڵ�, �̹���, css, JAVAscript 
			
			Map<String, List<String>> list = conn.getHeaderFields();
			for (String k : list.keySet()) { // list�� key���� ������
				System.out.println(list.get(k));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}

}
