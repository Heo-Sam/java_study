package com.ict10.jdbc;

import java.nio.file.attribute.AclEntry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DAO�� Data Access Object�� ���μ� ���������� DB�� �����ϴ� ��ü�� ���Ѵ�.
// DAO�� ��� ������ ȿ������ Ŀ�ؼ� ������ ���ȼ� �����̴�.
// DAO�� DB�� ����� �����͸� ��ȭ�ϰų� ���ڰ��� ����� �����ϵ��� ���� ������Ʈ�� ���Ѵ�.

public class Ex05_DAO {
	// DBó��
	 Connection conn = null;
	 PreparedStatement pstmt = null;
	 ResultSet rs = null;
	 int result = 0;
	 
	 // DB�� �����ϴ� ������ ���� (������)
	 public Ex05_DAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF8&serverTimezone=UTC";
			String user = "test01";
			String password ="1111";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	 
	 // ��ü ���� ����ϴ� �޼ҵ�
	 public void getList() {
		 try {
			 String sql = "SELECT * FROM Book ORDER BY bookid";
			 pstmt = conn.prepareStatement(sql);
			 rs = pstmt.executeQuery();
			 System.out.println("������ȣ\t������\t���ǻ�\t����");
			 while (rs.next()) {
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.println(rs.getInt("price")+"\t");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	 } // getList() ��
	 
	// �����ϴ� �޼ҵ�
	 public void getInsert(int i_bookid, String i_bookname, String i_publisher, int i_price ) {
		 try {
			 String sql = "INSERT INTO Book VALUES (?,?,?,?)";
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setInt(1, i_bookid);
			 pstmt.setString(2, i_bookname);
			 pstmt.setString(3, i_publisher);
			 pstmt.setInt(4, i_price);
			 
			 result = pstmt.executeUpdate();
			 
			 if (result > 0) {
				 System.out.println("���Լ���");
			 }
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	 } // getInsert() ��
	 
	// �����ϴ� �޼ҵ�
	 public void getDelete(int del_bookid) {
		 try {
			 String sql = "DELETE FROM Book WHERE bookid=?";
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setInt(1, del_bookid);
			 
			 result = pstmt.executeUpdate();
			 
			 if (result > 0) {
				 System.out.println("��������");
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
	 } // getDelete() ��
	 
		 
	 
	// �����ϴ� �޼ҵ�
	public void getUpdate(String u_bookname, String u_publisher, int u_price, int u_bookid) {
		try {
			String sql = "UPDATE Book SET bookname=?, publisher=?, price=? WHERE bookid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u_bookname);
			pstmt.setString(2, u_publisher);
			pstmt.setInt(3, u_price);
			pstmt.setInt(4, u_bookid);
					 
			result = pstmt.executeUpdate();
					 
			if (result > 0) {
			 System.out.println("��������");
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
		
	 
	// ����ϴ� �޼ҵ� 
	public void getSelect(int sel_bookid) {
		try {
			String sql = "SELECT ? FROM Book ORDER BY bookid";
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setInt(1, sel_bookid);
			 rs = pstmt.executeQuery();
			 System.out.println("������ȣ\t������\t���ǻ�\t����");
			 while (rs.next()) {
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.println(rs.getInt("price")+"\t");
			 }
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
						
	   	 }
	}
}
