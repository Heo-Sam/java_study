package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// �����͸� �޾Ƽ� VO�� ����
		Scanner scan = new Scanner(System.in);
		ArrayList<Ex06_VO> list = new ArrayList<Ex06_VO>();
				
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://203.236.220.92:3306/test02db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test02";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			esc:
			while (true) {
				System.out.print("��ȣ: ");
				int no = scan.nextInt();
				System.out.print("�̸�: ");
				String name = scan.next();
				System.out.print("�а�: ");
				String det = scan.next();
				System.out.print("�ּ�: ");
				String addr = scan.next();
				System.out.print("��ȭ��ȣ: ");
				String tel= scan.next();
				
				// ���� ���� ����
				list.add(new Ex06_VO(no, name, det, addr, tel));
				
				while (true) {
					System.out.print("����ұ��? (Y/N)  ");
					String msg = scan.next();
					if (msg.equalsIgnoreCase("y")) {
						continue esc;
					} else if (msg.equalsIgnoreCase("n")) {
						break esc;
					} else {
						continue;
					}
				}
			}
			
			for (int i = 0; i < list.size(); i++) {
				String sql = "INSERT INTO student_tb(no, name, det, addr, tel) "
						+ "VALUES ("+ list.get(i).getNo() +",'"+ list.get(i).getName() +"', '"+ list.get(i).getDet() 
						+"', '"+ list.get(i).getAddr()+"', '"+list.get(i).getTel()+"')";
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
				if (result < 0) {
					System.out.println("���� �߻�");
				}
			}
			
			String sql = "SELECT * FROM student_tb";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("��ȣ\t�̸�\t�а�\t�ּ�\t��ȭ");
			while (rs.next()) {
				System.out.print(rs.getInt("no")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("det")+"\t");
				System.out.print(rs.getString("addr")+"\t");
				System.out.println(rs.getString("tel"));
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
