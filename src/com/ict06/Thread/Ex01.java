package com.ict06.Thread;

public class Ex01 {
	public static void main(String[] args) {
		// Thread 생성자
		//  - Thread() : 기본생서자
		//	- Thread(Runnable target) : Runnable 인터페이스를 인자로 받아서 처리
		//								익명 내부클래스 사용할 수 있다(Anonymous)
		//	- Thread(Runnable target, String name) : Runnable 인터페이스를 인자로 받아서 처리
		// 											이때 name은 스레드의 이름
		//	- Thread(String name): name은 스레드의 이름
		
		// 주요 메서드
		//	- join() : 현재 스레드는 join()을 호출한 스레드가 끝날 때까지 대기상태에 빠져있다가
		//				join()을 호출한 스레드가 끝나야 다시 실행한다.
		//				즉, join()을 호출한 스레드가 끝날 때까지 실행할 수 없다.
		//	- start() : start()를 실행하면 run()을 호출한다. (만약 start()가 있으면 start()로 감. => run()xx)
		//	- run() : start()가 호출해서 run()가 실행되면 이 때 스레드 처리를 했다고 한다.
		//	- sleep(long millis) : 1000이 1초를 의미, 잠시 대기상태로 빠져있는 상태를 말함.
		//	- yield : 수행 중인 스레드 중 우선순위가 같은 다른 스레드에게 제어권을 넘긴다.
		//	- getName() : 스레드 이름 구하기
		//	- setName(String name) : 스레드 이름 지정하기
		//	- currentThread() : 현재 수행되는 스레드 객체를 리턴(static 메소드)
		
		
		// 앞에서 만든 모든 처리는 main스레드가 혼자서 다 처리해왔음 ㅠ_ㅠ 
		// => 이러한 것을 싱글스레드라고 한다.
		// 스레드 = 일꾼! 이라고 생각하자 !
		
		// JVM이 main()호출하면 무조건 main스레드가 일처리를 한다.
		// System.out.println(Thread.currentThread().getName()); // main
		
		Ex02 test = new Ex02();
		System.out.println("1" + Thread.currentThread().getName());
		test.add(5, 8);
		System.out.println("4" + Thread.currentThread().getName());
		
		int result = test.sub(8, 5);
		System.out.println("7" + Thread.currentThread().getName());
		System.out.println(result);
	}

}
