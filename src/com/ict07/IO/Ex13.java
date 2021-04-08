package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex13 {
	public static void main(String[] args) {
		// DataOutputStream 과 DataInputStream
		// - 기본자료형을 주고 받을 때 사용 (기본자료형을 읽고 쓰는 메소드가 별도로 존재)
		
		// FileInputStream, FileOutputStream 과 다른점
		//	: 이진데이터(0,1)를 입출력할 때 사용한다.(타시스템과 입출력할 때 유리)
		//	** 입력 순서와 출력 순서가 다르면 데이터의 결과가 달라질 수 있다.
		//	BufferedInputStream, BufferedOutputStream 을 활용할 수 있다.
		
		String pathname = "C:"+File.separator+"sammy_study"+File.separator+"util"+File.separator+"ict03.txt";
		
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			
			// 쓰기 메소드 : writeXXX() => XXX는 기본자료형
			// 메모장으로 열기해도 읽을 수가 없음
			dos.writeLong(126L);
			dos.writeBoolean(true);
			dos.writeFloat(3.14F);
			dos.writeInt(256);
			dos.writeDouble(236.41);
			dos.writeChar('A');
			
			dos.flush();		
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			// 읽는 메소드가 따로 있다 : readXXX() => XXX는 기본자료형
			System.out.println(dis.readLong());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readFloat());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			
			
		} catch (Exception e) {
			
		} finally {
			try {
				dis.close();
				bis.close();
				fis.close();
				
				dos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
	}

}
