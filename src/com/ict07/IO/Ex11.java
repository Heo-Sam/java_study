package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex11 {
	public static void main(String[] args) {
		// C:\\sammy_study\\util\\java_1.png파일을
		// C:\\sammy_study\\util\\res 안에 복사하는 코딩
		
		// 읽는 위치
		String pathname1 = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"video.mp4";
		File read_file = new File(pathname1);
		
		// 쓰는 위치
		String pathname2 = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"res"+File.separator+"video.mp4";
		File write_file2 = new File(pathname2);
		
		// 먼저 읽어 (InputStream)
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		// 그다음 써 (OutputStream)
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(read_file); // 먼저 읽고(Input)
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(write_file2); // 쓰고 (Output)
			bos = new BufferedOutputStream(fos);
			
			// 그림, 소리, 동영상 파일들을 처리(복사,이동)할 때는 무조건 1byte씩 처리해야 된다.
			int k = 0;
			while ((k=bis.read()) != -1) {
				// 1byte 쓰기
				bos.write(k);
			}
			bos.flush();
			
		} catch (Exception e) {
		} finally {
			try {  // 버퍼를 먼저 닫고 스트림을 닫아줘야 함
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
		
	}

}
