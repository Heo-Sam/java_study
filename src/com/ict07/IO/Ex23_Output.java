package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// 객체 직렬화: ObjectOutputStream : WriteObject()를 사용
public class Ex23_Output {
	public static void main(String[] args) {
		// 객체 직렬화: 특성 클래스(VO)를 객체로 만들어서 특정 위치에 .ser로 만들어 저장한다.
		//				객체들이 가지고 있는 내용이 직렬화 되어있다.(사람은 정보를 제대로 볼 수 없다.)
		// 전제조건: 특정 위치에 파일을 생성하여 .ser확장자로 만들어 저장
		//		=> FileOutputStrea, BufferedOutPutStream 필요
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict07.ser";
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
			Ex23_VO vo = new Ex23_VO("둘리", 28, 67.3, true); // 생성자를 받아서 바로 정보 입력
			
			//객체 직렬화 과정
			oos.writeObject(vo);
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
