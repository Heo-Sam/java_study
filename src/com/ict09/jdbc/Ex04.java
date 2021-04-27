package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
	public static void main(String[] args) {
		// DB���ӿ� �ʿ��� Ŭ���� 3�� ����
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			// 1. ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. ���� ����
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&severTimezone=UTC";
			String user = "test01";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. �����ۼ�(����)
			// �̸��� ������� ��� ����
			String sql = "DELETE FROM Customer WHERE name='�����'";
			
			// 4. ���� DB�� ���� �غ�
			stmt = conn.createStatement();
			
			// 5. ���� DB�� ������ ��� �ޱ�
			result = stmt.executeUpdate(sql);
			
			if (result > 0) {
				System.out.println("���� ����");
				
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
				System.out.println("���� ����-1");
			}
			
		} catch (Exception e) {
			System.out.println("���� ����-2");
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