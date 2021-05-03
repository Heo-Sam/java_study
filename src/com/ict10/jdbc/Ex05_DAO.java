package com.ict10.jdbc;

import java.nio.file.attribute.AclEntry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DAO란 Data Access Object의 약어로서 실질적으로 DB에 접근하는 객체를 말한다.
// DAO의 사용 이유는 효율적인 커넥션 관리와 보안성 때문이다.
// DAO는 DB를 사용해 데이터를 조화하거나 조자갛는 기능을 전담하도록 만든 오브젝트를 말한다.

public class Ex05_DAO {
	// DB처리
	 Connection conn = null;
	 PreparedStatement pstmt = null;
	 ResultSet rs = null;
	 int result = 0;
	 
	 // DB에 접속하는 역할을 수행 (생성자)
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
	 
	 // 전체 정보 출력하는 메소드
	 public void getList() {
		 try {
			 String sql = "SELECT * FROM Book ORDER BY bookid";
			 pstmt = conn.prepareStatement(sql);
			 rs = pstmt.executeQuery();
			 System.out.println("도서번호\t도서명\t출판사\t가격");
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
	 } // getList() 끝
	 
	// 삽입하는 메소드
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
				 System.out.println("삽입성공");
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
	 } // getInsert() 끝
	 
	// 삭제하는 메소드
	 public void getDelete(int del_bookid) {
		 try {
			 String sql = "DELETE FROM Book WHERE bookid=?";
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setInt(1, del_bookid);
			 
			 result = pstmt.executeUpdate();
			 
			 if (result > 0) {
				 System.out.println("삭제성공");
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
	 } // getDelete() 끝
	 
		 
	 
	// 수정하는 메소드
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
			 System.out.println("수정성공");
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
		
	 
	// 출력하는 메소드 
	public void getSelect(int sel_bookid) {
		try {
			String sql = "SELECT ? FROM Book ORDER BY bookid";
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setInt(1, sel_bookid);
			 rs = pstmt.executeQuery();
			 System.out.println("도서번호\t도서명\t출판사\t가격");
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
