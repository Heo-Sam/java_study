package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex09 {
	public static void main(String[] args) {
		// C:\\sammy_study\\util\\test100.txt 照拭
		// 戚硯: ししし
		// 蟹戚: しし
		// 穿鉢腰硲: ししし-しししし-しししし
		// 拙失馬澗 坪漁聖 馬獣推

		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"test100.txt";
		 
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String msg = "戚硯 : 買児\n蟹戚 : 26\n穿鉢腰硲 : 010-2465-9592";
			byte[] b = msg.getBytes();
			fos.write(b);
			bos.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				bos.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
