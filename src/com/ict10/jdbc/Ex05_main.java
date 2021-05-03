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
			
			System.out.println("������ �����ϼ���.");
			System.out.println("1. �����ϱ�");
			System.out.println("2. �����ϱ�");
			System.out.println("3. �����ϱ�");
			System.out.println("4. �˻��ϱ�");
			System.out.print("���ù�ȣ: ");
			String su = scan.next();
			
			// next() ���� x
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
				
				// �����ϴ� �޼ҵ�
				Ex05_DAO i_dao = new Ex05_DAO();
				i_dao.getInsert(i_bookid, i_bookname, i_publisher, i_price);
				break;
				
			case "2":
				System.out.print("���� �� bookid : ");
				int del_bookid = scan.nextInt();
				// �����ϴ� �޼ҵ�
				
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
				// �����ϴ� �޼ҵ�
				Ex05_DAO u_dao = new Ex05_DAO();
				u_dao.getUpdate(u_bookname, u_publisher, u_price, u_bookid);
				break;
				
			case "4": 
				System.out.print("�˻� �� bookid : ");
				int sel_bookid = scan.nextInt();
				// �˻��ϴ� �޼ҵ�
				Ex05_DAO sel_dao = new Ex05_DAO();
				sel_dao.getSelect(sel_bookid);
				break;
			default: System.out.println("����� �����ϼ���."); continue esc;
			}
						
			while (true) {
				System.out.print("����ұ��? (Y/N) >> ");
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
		
		System.out.println("����� ����");
		Ex05_DAO dao = new Ex05_DAO();
		dao.getList();

	}

}
