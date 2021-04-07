package com.ict06.Thread;

public class Ex09_main {
	public static void main(String[] args) {
		
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
		// Ex07,Ex08,Ex09는 Runnable을 상속받았기 때문에
		// start()가 없다
		// t1.start();
		
		// 실행 할 run()를 가진 클래스, 즉 타겟을 지정해야 한다.
		// 기본생성자로는 불가, target(t1)을 가진 생성자를 사용한다.
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		new Thread(t2).start(); // 다시 호출할 수 없음. 객체 생성을 안해서
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		
		
		// 안드로이드에서 많이 쓰이는 방법 (익명 내부클래스)
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + "삼삼삼");
				}
			}
		}).start();
	}

}
