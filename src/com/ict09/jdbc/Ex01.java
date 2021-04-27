package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01 {

	public static void main(String[] args) {
		// JDBC(Java Database Connectivity): 자바에서 데이터베이스에 접속할 수 있도록 하는 자바 API이다.
		// JDBC는 데이터베이스에서 자료를 쿼리하거나 업데이트하는 방법을 제공한다.
		// 각 DB들에게 접속할 수 있는 JDBC 드라이버가 필요하다.
		// MySQL 접속에 필요한 드라이버를 다운로드 받아서 해당 프로젝트에 참조해야 한다.
		// MyProject - 마우스 오른쪽 - Build path - Configure Build path - Add External jars... 해당 라이브러리 선택
		
		
		// DB처리에 필요한 클래스 3개 선언
		Connection conn = null; // DB에 접속
		Statement stmt = null; // DB에 다녀오는 칭구(쿼리정보를 저장하는 변수)
		ResultSet rs = null; // SELECT문 결과를 받아서 처리한다.
		int result = 0; // INSERT, UPDATE, DELETE의 결과
		
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 접속을 위한 정보(3가지)
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01"; // 사용자 계정
			String password = "1111"; // 계정 비밀번호
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. 쿼리문 작성(CRUD = 조작어(INSERT, UPDATE, DELETE, SELECT)
			String sql = "select * from customer";
			
			// 4. 실제 DB에 접속하는 정보를 가지고 Statement 클래스에 저장
			stmt = conn.createStatement();
			
			// 5. Statement 클래스에 쿼리 저장 후 DB에 결과를 받아서 처리한다.
			//	  이 때, 두 가지로 나뉘는데 SELECT문일 때와 아닐 때로 나눠진다.
			
			//  5-1) SELECT문일 때는 ResultSet 클래스가 받는다
			rs = stmt.executeQuery(sql);
			
			//  5-2) 아닐 때는 int 가 받는다.
			// result = stmt.executeUpdate(sql); // 현재 쿼리문이 SELECT임
			
			// 6. 결과보기
			// .next(): 다음 줄에 정보가 있으면 true
			while (rs.next()) {
				System.out.print(rs.getInt("custid")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("address")+"\t");
				System.out.println(rs.getString("phone"));
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
