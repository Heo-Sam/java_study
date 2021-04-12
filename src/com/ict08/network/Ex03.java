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
			// 요즘은 openStream보다는 아래 방식으로 사용함!
			URL url = new URL("https://www.naver.com");
			URLConnection conn = url.openConnection();
		/*	is = url.openStream();
			isr = new InputStreamReader(is,"utf-8");
			br = new BufferedReader(isr);
		*/	
			// 3줄을 한 번에 한 줄로 선언하기
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
			
			System.out.println("인코딩 : " + conn.getContentEncoding());
			System.out.println("길이 : " + conn.getContentLength());
			System.out.println("문서 타입 : " + conn.getContentType());
			System.out.println("====================");
			
			// HTTP: 헤더와 바디로 나눠진다
			// 헤더 => HTTP바디 및 요청/응답에 대한 정보를 포함하고 있다.
			//		헤더 정보를 이용해서 웹 브라이더가 해석하고 실행한다.
			// 바디 => HTML 코드, 이미지, css, JAVAscript 
			
			Map<String, List<String>> list = conn.getHeaderFields();
			for (String k : list.keySet()) { // list의 key값을 가져옴
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
