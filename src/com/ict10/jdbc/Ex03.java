package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex03 {
	public static void main(String[] args) {
		// JDBC(Java Database Connectivity): �ڹٿ��� �����ͺ��̽��� ������ �� �ֵ��� �����ϴ� �ڹ� API
		
		// 1. DBó���� �ʿ��� Ŭ���� 3��
		Connection conn = null;
		// Statement�� ��ӹ��� �������̽�
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select�� ����� �޴� Ŭ���� cursor�� ����ؼ� ������ ����
		int result = 0; //  select���� ������ ������ ����� ���� �� ���
		
		
		try {
			// 1. ����̹� �ε� 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. �������� 3����
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. ���ε� ���� ����ؼ� ������ �ۼ�(CRUD = SELECT, INSERT, UPDATE, DELETE)
			String sql = "INSERT INTO Book VALUES (?, ?, ?, ?)";
			
			// 4. ���� ���� ����
			pstmt = conn.prepareStatement(sql);
			  
			// 5. ���ε� ���� ó��
			pstmt.setInt(1, 15);
			pstmt.setString(2, "�� ���̺�");
			pstmt.setString(3, "���ѹ̵��");
			pstmt.setInt(4, 19000);
			
			// 6. ���� DB�� �����ϰ� ��� �ޱ�
			// ��������
			result = pstmt.executeUpdate(); // SELECT�� ������ ��� ���
			
			// 7. ��� ������
			if (result > 0) {
				sql = "SELECT * FROM Book ORDER BY bookid asc";
				pstmt = conn.prepareStatement(sql);
				while (rs.next()) {
					System.out.print(rs.getInt("bookid")+"\t");
					System.out.print(rs.getString("bookname")+"\t");
					System.out.print(rs.getString("publisher")+"\t");
					System.out.println(rs.getInt("price"));
				}
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
