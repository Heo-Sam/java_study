package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		// DB접속에 필요한 클래스 3개
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 접속 정보
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. 쿼리문
			// Customer 테이블에서 custid가 7인 사람의 이름을 '박찬호', 주소를 '대한민국 서울'로 변경
			String sql = "UPDATE Customer SET name = '박찬호', address = '대한민국 서울' WHERE custid = 7";
			
			// 4. 실제 DB에 보낼 준비
			stmt = conn.createStatement();
			
			// 5. 실제 DB에 보내고 결과 받기
			// System.out.println(result);
			result = stmt.executeUpdate(sql);
			
			if (result > 0) {
				System.out.println("갱신 성공");
				
				sql = "SELECT * FROM Customer";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getInt("custid")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("address")+"\t");
					System.out.println(rs.getString("phone"));
				}
				
			} else {
				System.out.println("갱신 실패 -1");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		
	}

}
