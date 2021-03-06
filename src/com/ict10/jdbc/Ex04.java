package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 삭제  bookid를 받기 위해서 Scannerㅅ ㅏ용
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 idx를 입력하세요: ");
		int del_id = scan.nextInt();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0; 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "DELETE FROM Book WHERE bookid = ?";
			
			pstmt = conn.prepareStatement(sql);
			  
			pstmt.setInt(1, del_id);
			
			result = pstmt.executeUpdate(); // SELECT를 제외한 모든 결과
			
			if (result > 0) {
				sql = "SELECT * FROM Book ORDER BY bookid asc";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					System.out.print(rs.getInt("bookid")+"\t");
					System.out.print(rs.getString("bookname")+"\t");
					System.out.print(rs.getString("publisher")+"\t");
					System.out.println(rs.getInt("price"));
				}
			} else {
				System.out.println("삭제할 id가 존재하지 않습니다.");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}

}
