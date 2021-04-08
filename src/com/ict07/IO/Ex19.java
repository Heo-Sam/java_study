package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		// 복사하는 위치와 파일 명을 받고
		// 붙일 위치와 파일명을 받아서 붙이기 하자
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("복사하는 위치와 파일 이름 : ");
		String pathname_copy = scan.next();
		System.out.print("붙여넣기 할 위치와 파일 이름 : ");
		String pathname_paste = scan.next();
		
		
		File file1 = new File(pathname_copy);
		File file2 = new File(pathname_paste);
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			// 읽기
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();			
			while ((msg=br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			
			//쓰기			
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			//bw.write(sb.toString());
			
			String str = sb.toString();
			str = str.replace("대한민국", "大韓民國");
			bw.write(str);
			
			bw.flush();
			
			//System.out.println(sb.toString());
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				fr.close();
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
		
	}

}
