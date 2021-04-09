package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Ex21 {
	public static void main(String[] args) {
		// 바이트-문자 결합: 체인방식
		// 출력: OutputStreamWriter : OutputStream -> Writer
		//		OutputStream -> OutputStreamWriter -> Writer -> BufferedWriter
		
		
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		
		try {
			osw = new OutputStreamWriter(System.out);  // 입력받을 장소 System.out = 모니터
			bw = new BufferedWriter(osw);
			
			bw.write("Welcome");
			bw.newLine(); // 줄 바꾸기
			bw.write("JavaWorld");
			
			bw.flush();			
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				osw.close();
			} catch (Exception e2) {
			}
		}
	}

}
