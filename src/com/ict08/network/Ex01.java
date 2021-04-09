package com.ict08.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {
	public static void main(String[] args) {
		// InetAddress: 자바에서 IP주소를 표현하는 클래스
		//				생성자가 존재하지만 사용하지 않는다.
		//				 ==> 6개의 static메소드를 이용한다.
		
		// ** localhost : 현재 자신이 사용하고 있는 컴퓨터
		
		try {
			InetAddress addr = InetAddress.getByName("www.naver.com");
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
			System.out.println("===============================");
			
			// 내 컴퓨터에 관한 정보
			addr = InetAddress.getLocalHost();
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
			System.out.println("===============================");
			
			InetAddress[] addrs = InetAddress.getAllByName("m.naver.com");
			for (InetAddress k : addrs) {
				addr = InetAddress.getLocalHost();
				System.out.println("이름 : " + k.getHostName());
				System.out.println("주소 : " + k.getHostAddress());
				System.out.println("===============================");
			}
			
			// 223.130.195.101\
			byte[] b = {(byte)223,(byte)130,(byte)195,101};
			addr = InetAddress.getByAddress(b);
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
			
			System.out.println("===============================");
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
