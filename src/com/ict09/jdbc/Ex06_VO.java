package com.ict09.jdbc;

public class Ex06_VO {
	// DB 컬럼명과 똑같이 만든다.
	private int no;
	private String name, det, addr, tel;
	
	public Ex06_VO() {	}

	public Ex06_VO(int no, String name, String det, String addr, String tel) {
		super();
		this.no = no;
		this.name = name;
		this.det = det;
		this.addr = addr;
		this.tel = tel;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDet() {
		return det;
	}

	public void setDet(String det) {
		this.det = det;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
