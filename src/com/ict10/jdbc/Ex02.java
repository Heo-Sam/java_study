package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex02 {
	public static void main(String[] args) {
		// JDBC(Java Database Connectivity): 자바에서 데이터베이스에 접속할 수 있도로 지원하는 자바 API
		
		// 1. DB처리에 필요한 클래스 3개
		Connection conn = null;
		// Statement를 상속받은 인터페이스
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select문 결과를 받는 클래스 cursor를 사용해서 정보를 추출
		int result = 0; //  select문을 제외한 나머지 결과를 받을 때 사용
		
		
		try {
			// 1. 드라이버 로딩 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 접속정보 3가지
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. 바인딩 변수 사용해서 쿼리문 작성(CRUD = SELECT, INSERT, UPDATE, DELETE)
			String sql = "SELECT * FROM Book WHERE publisher LIKE ?";
			
			// 4. 쿼리 구문 적용
			pstmt = conn.prepareStatement(sql);
			  
			// 5. 바인딩 변수 처리
			pstmt.setString(1, "%이상%");
			
			// 6. 실제 DB에 적용하고 결과 받기
			rs = pstmt.executeQuery(); // SELECT문 => rs
			
			// 7. 결고 ㅏ보기
			while (rs.next()) {
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.println(rs.getInt("price"));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}

}
