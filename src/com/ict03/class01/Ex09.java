package com.ict03.class01;

public class Ex09 {
	private String name;
	private int sum;
	private String hak;
	private double avg;
	private int rank = 1;
	
	// 모든 메소드가 void이다
	// 이름 받기 ; setName을 통해서 받으면 된다 
	// 총점 구하기
	public void p_sum(int kor, int eng, int math) {
		this.sum = kor + eng + math;  // 전역변수 앞에 this는 지역변수랑 다를 땐 안써도 된다
		p_avg();
	}
	
	// 평균 구하기
	public void p_avg() {
		avg = (int)(sum / 3.0 * 10 )/10.0;
		p_hak();
	}
	
	// 학점 구하기
	public void p_hak() {
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
	}
	
	// 순위와 정렬은 여기서 할 수 없음
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	

}
