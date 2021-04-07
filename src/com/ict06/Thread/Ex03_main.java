package com.ict06.Thread;

public class Ex03_main {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex03 t1 = new Ex03();

		t1.go();
		System.out.println("수고하셨습니다.");
		System.out.println("====================");
		
		
		// 스레드 처리하기 위해서 start()를 실행하면
		// run()으로 가야지만 스레드 처리가 된다.
		// 하지만 Ex03에 start()가 있기때문에 start()로 가게 된다 => 스레드 처리 아님
		// Ex03에 있는 start()를 주석처리하면 start()에서 run()으로 가게된다.
		// > 이것을 [스레드 처리 했다]고 한다.
		System.out.println(Thread.currentThread().getName());
		t1.start(); // run()으로 이동
		System.out.println("수고하셨습니다.");
		System.out.println("====================");
	}

}
