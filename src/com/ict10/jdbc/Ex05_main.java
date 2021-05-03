package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex05_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		esc:
		while (true) {
			Ex05_DAO dao = new Ex05_DAO();
			dao.getList();
			System.out.println("=============================================");
			
			System.out.println("다음을 선택하세요.");
			System.out.println("1. 삽입하기");
			System.out.println("2. 삭제하기");
			System.out.println("3. 수정하기");
			System.out.println("4. 검색하기");
			System.out.print("선택번호: ");
			String su = scan.next();
			
			// next() 띄어스기 x
			switch (su) {
			case "1": 
				System.out.print("bookid: ");
				int i_bookid = scan.nextInt();
				System.out.print("bookname: ");
				String i_bookname = scan.next();
				System.out.print("publisher: ");
				String i_publisher = scan.next();
				System.out.print("price: ");
				int i_price = scan.nextInt();
				
				// 삽입하는 메소드
				Ex05_DAO i_dao = new Ex05_DAO();
				i_dao.getInsert(i_bookid, i_bookname, i_publisher, i_price);
				break;
				
			case "2":
				System.out.print("삭제 할 bookid : ");
				int del_bookid = scan.nextInt();
				// 삭제하는 메소드
				
				Ex05_DAO del_dao = new Ex05_DAO();
				del_dao.getDelete(del_bookid);
				 break;
				 
			case "3": 
				System.out.print("bookname: ");
				String u_bookname = scan.next();
				System.out.print("publisher: ");
				String u_publisher = scan.next();
				System.out.print("price: ");
				int u_price = scan.nextInt();
				System.out.print("bookid: ");
				int u_bookid = scan.nextInt();
				// 수정하는 메소드
				Ex05_DAO u_dao = new Ex05_DAO();
				u_dao.getUpdate(u_bookname, u_publisher, u_price, u_bookid);
				break;
				
			case "4": 
				System.out.print("검색 할 bookid : ");
				int sel_bookid = scan.nextInt();
				// 검색하는 메소드
				Ex05_DAO sel_dao = new Ex05_DAO();
				sel_dao.getSelect(sel_bookid);
				break;
			default: System.out.println("제대로 선택하세요."); continue esc;
			}
						
			while (true) {
				System.out.print("계속할까요? (Y/N) >> ");
				String msg = scan.next();
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				} else if (msg.equalsIgnoreCase("n")) {
					break esc;
				} else {
					continue;
				}
					
			} // while 2
		}// while 1
		
		System.out.println("변경된 내용");
		Ex05_DAO dao = new Ex05_DAO();
		dao.getList();

	}

}
