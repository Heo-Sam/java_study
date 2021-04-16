package com.ict11.test;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


// 모든 파일을 복붙하는 경우 (바이트스트림)
public class CopyTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("복사 장소와 파일명: ");
		String pathname1 = scan.next();
		
		System.out.print("붙이기 장소와 파일명: ");
		String pathname2 = scan.next();
		
		File file1 = new File(pathname1);
		FileInputStream fis = null;
		BufferedInputStream bis = null;

		
		File file2 = new File(pathname2);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fis = new FileInputStream(file1);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(file2);
			bos = new BufferedOutputStream(fos);
			
			int k = 0 ;
			while ((k=bis.read()) != -1) {
				bos.write(k);
			}
			
		} catch (Exception e) {
			System.out.println(e);
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
	}

}
