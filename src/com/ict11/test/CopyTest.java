package com.ict11.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CopyTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("복사 장소와 파일명: ");
		String pathname1 = scan.next();
		
		System.out.print("붙이기 장소와 파일명: ");
		String pathname2 = scan.next();
		
		File file1 = new File(pathname1);
		File file2 = new File(pathname2);
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			
			StringBuffer sb = new StringBuffer();
			String msg ;
			while ((msg=br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			System.out.println(sb.toString());
			
			
			bw.write(sb.toString());
			bw.flush();
		} catch (Exception e) {
			System.out.println(e);
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
	}

}
