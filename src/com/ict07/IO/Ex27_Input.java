package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex27_Input {
	public static void main(String[] args) {
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict11.ser";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
		
		// ★★★★★	
			ArrayList<Ex27_VO> list = (ArrayList<Ex27_VO>) ois.readObject(); // 형변환
			for (Ex27_VO k : list) {
				k.setSum(k.getKor()+k.getEng()+k.getMath());
				k.setAvg((int)(k.getSum()/3.0*10)/10.0);
				if (k.getAvg() >= 90) {
					k.setHak("A학점");
				} else if (k.getAvg() >= 80) {
					k.setHak("B학점");
				} else if (k.getAvg() >= 70) {
					k.setHak("C학점");
				} else {
					k.setHak("F학점");
				}
			}
			
			System.out.println("이름\t총점\t평균\t학점");
			for (Ex27_VO k : list) {
				System.out.print(k.getName()+"\t");
				System.out.print(k.getSum()+"\t");
				System.out.print(k.getAvg()+"\t");
				System.out.println(k.getHak()+"\t");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		
	}

}
