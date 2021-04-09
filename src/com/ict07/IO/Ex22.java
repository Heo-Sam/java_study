package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex22 {
	public static void main(String[] args) {
		
	/*	
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 문자 입력 : ");
		String msg = scan.next();
		System.out.println("받은 문자 : " + msg);
	*/
		// InputStreamReader 와 OutputStreamWriter 이용
		
		//모니터에 출력
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		// 키보드를 통해 입력
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			
			bw.write("원하는 문자 입력 : ");
			bw.flush();
			
			String msg = br.readLine();
			
			
			//int k = Integer.parseInt(msg); //받은 문자를 숫자로 바꿈

			bw.write("받은 문자 : " + msg);		
			
			bw.flush();
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				osw.close();
				br.close();
				isr.close();				
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
		
	}

}
