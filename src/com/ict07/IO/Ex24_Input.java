package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// 객체 역직렬화 : ObjectInputStream : readObject()
public class Ex24_Input {
	public static void main(String[] args) {
		// 객체 역직렬화:  직렬화된 파일이나 정보를 원래 내용으로 복원하는 역할을 함
		// Ex24_Output에서 저장했던 파일을 읽어와야 한다.
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict08.ser";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			// 역직렬화 과정
			// 원래 객체로 돌아가는 과정

			ArrayList<Ex24_VO> list = (ArrayList<Ex24_VO>)(ois.readObject()); // 자료형이 맞지 않아서 오류가 나기 때문에 형변환
			
			// for문이나 Iterator사용
			System.out.println("이름\t나이\t몸무게\t성별");
			for (Ex24_VO k : list) {
				System.out.print(k.getName()+"\t");
				System.out.print(k.getAge()+"\t");
				System.out.print(k.getWeight()+"\t");
				boolean b = k.isGender();
				if(b) {
					System.out.println("남성");
				} else {
					System.out.println("여성");				
				}
			}
			
			
			
		} catch (Exception e) {
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
		
	}

}
