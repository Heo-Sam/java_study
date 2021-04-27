package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01 {

	public static void main(String[] args) {
		// JDBC(Java Database Connectivity): �ڹٿ��� �����ͺ��̽��� ������ �� �ֵ��� �ϴ� �ڹ� API�̴�.
		// JDBC�� �����ͺ��̽����� �ڷḦ �����ϰų� ������Ʈ�ϴ� ����� �����Ѵ�.
		// �� DB�鿡�� ������ �� �ִ� JDBC ����̹��� �ʿ��ϴ�.
		// MySQL ���ӿ� �ʿ��� ����̹��� �ٿ�ε� �޾Ƽ� �ش� ������Ʈ�� �����ؾ� �Ѵ�.
		// MyProject - ���콺 ������ - Build path - Configure Build path - Add External jars... �ش� ���̺귯�� ����
		
		
		// DBó���� �ʿ��� Ŭ���� 3�� ����
		Connection conn = null; // DB�� ����
		Statement stmt = null; // DB�� �ٳ���� Ī��(���������� �����ϴ� ����)
		ResultSet rs = null; // SELECT�� ����� �޾Ƽ� ó���Ѵ�.
		int result = 0; // INSERT, UPDATE, DELETE�� ���
		
		try {
			// 1. ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. ������ ���� ����(3����)
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01"; // ����� ����
			String password = "1111"; // ���� ��й�ȣ
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. ������ �ۼ�(CRUD = ���۾�(INSERT, UPDATE, DELETE, SELECT)
			String sql = "select * from customer";
			
			// 4. ���� DB�� �����ϴ� ������ ������ Statement Ŭ������ ����
			stmt = conn.createStatement();
			
			// 5. Statement Ŭ������ ���� ���� �� DB�� ����� �޾Ƽ� ó���Ѵ�.
			//	  �� ��, �� ������ �����µ� SELECT���� ���� �ƴ� ���� ��������.
			
			//  5-1) SELECT���� ���� ResultSet Ŭ������ �޴´�
			rs = stmt.executeQuery(sql);
			
			//  5-2) �ƴ� ���� int �� �޴´�.
			// result = stmt.executeUpdate(sql); // ���� �������� SELECT��
			
			// 6. �������
			// .next(): ���� �ٿ� ������ ������ true
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
