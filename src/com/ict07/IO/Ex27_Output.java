package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex27_Output {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict11.ser";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			ArrayList<Ex27_VO> list = new ArrayList<Ex27_VO>();
			
			esc:
			while (true) {
				System.out.print("�̸� : ");
				String name = scan.next();
				System.out.print("���� : ");
				int kor  = scan.nextInt();
				System.out.print("���� : ");
				int eng  = scan.nextInt();
				System.out.print("���� : ");
				int math  = scan.nextInt();
				
		/*		int sum = kor + eng + math;
				double avg = (int)(sum/3.0*10)/10;
				
				String hak = "";
				if (avg >= 90) {
					hak = "A����";
				} else if (avg >= 80) {
					hak = "B����";
				} else if (avg >= 70) {
					hak = "C����";
				} else {
					hak = "F����";
				}
		*/		
				Ex27_VO vo = new Ex27_VO(name, kor, eng, math);
				list.add(vo);
				
				while (true) {
					System.out.print("����ұ��?(Y/N)");
					String answer = scan.next();
					if (answer.equalsIgnoreCase("Y")) {
						continue esc;
					} else if (answer.equalsIgnoreCase("N")) {
						break esc;
					} else {
						continue;
					}
				}// 2 while end
			} // 1 while end
			
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}

}
