package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// 객체 직렬화: ObjectOutputStream : WriteObject()를 사용
public class Ex24_Output {
	public static void main(String[] args) {
		// 객체 직렬화: 특성 클래스(VO)를 객체로 만들어서 특정 위치에 .ser로 만들어 저장한다.
		//				객체들이 가지고 있는 내용이 직렬화 되어있다.(사람은 정보를 제대로 볼 수 없다.)
		// 전제조건: 특정 위치에 파일을 생성하여 .ser확장자로 만들어 저장
		//		=> FileOutputStrea, BufferedOutPutStream 필요
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict08.ser";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			// 스트림 체인방식
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 객체 직렬화를 하기 위한 객체를 만들었음
			Ex24_VO vo1 = new Ex24_VO("고길동", 37, 67.3, true); // 생성자를 받아서 바로 정보 입력
			Ex24_VO vo2 = new Ex24_VO("마이콜", 28, 77.1, true); // 생성자를 받아서 바로 정보 입력
			Ex24_VO vo3 = new Ex24_VO("희동이", 3, 8.6, false); // 생성자를 받아서 바로 정보 입력
			Ex24_VO vo4 = new Ex24_VO("도우너", 10, 14.9, true); // 생성자를 받아서 바로 정보 입력
			Ex24_VO vo5 = new Ex24_VO("또치", 17, 57.4, false); // 생성자를 받아서 바로 정보 입력
			
			// 객체는 배열이나 컬렉션에 담을 수 있다.
			ArrayList<Ex24_VO> list = new ArrayList<Ex24_VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			
			// 객체 직렬화 과정
			oos.writeObject(list);
			oos.flush();
			} catch (Exception e) {
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
		
	}

}
