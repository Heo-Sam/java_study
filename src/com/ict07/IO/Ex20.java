package com.ict07.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		// 바이트-문자 결합: 체인방식
		// 입력: InpuStreamReader: InputStream -> Reader
		//		InputStream -> InputStreamReader -> Reader -> BufferedReader
		
	/*	
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 문자 입력 : ");
		String msg = scan.next();
		System.out.println("받은 문자 : " + msg);
	*/
		System.out.print("원하는 문자 입력 : ");
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(System.in); // 입력할 장소 System.in = 키보드
			br = new BufferedReader(isr);
			
			String msg = br.readLine(); // br.readLine()입력받은 문자를 한 줄씩 읽음
			System.out.println("받은 문자 : " + msg);			
		} catch (IOException e) {
			e.printStackTrace();
		}  finally {
			try {
				br.close();
				isr.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
	}
}
