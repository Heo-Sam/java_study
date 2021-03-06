package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
	public static void main(String[] args) {
		// DB접속에 필요한 클래스 3개 선언
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 접속 정보
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&severTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. 쿼리작성(삭제)
			// 이름이 손흥민인 사람 삭제
			String sql = "DELETE FROM Customer WHERE name='손흥민'";
			
			// 4. 실제 DB로 보낼 준비
			stmt = conn.createStatement();
			
			// 5. 실제 DB에 보내고 결과 받기
			result = stmt.executeUpdate(sql);
			
			if (result > 0) {
				System.out.println("삭제 성공");
				
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
				System.out.println("삭제 실패-1");
			}
			
		} catch (Exception e) {
			System.out.println("삭제 실패-2");
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
