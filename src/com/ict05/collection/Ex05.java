package com.ict05.collection;

import java.util.Iterator;
import java.util.Stack;

public class Ex05 {
	// * List 인터페이스를 구현한 클래스들: Stack, ArrayList, Vector;
	
	// * Stack(스택): LIFO (Last In First Out) : 마지막에 들어온 데이터가 맨 처음으로 나간다.
	// 주요 메소드
	// add, push, addElement => 추가
	// add(index, E) => 삽입(중간에 끼어 들어가는 것)
	
	// pop : 맨 위에 존재하는 객체를 반환하고 *삭제*
	// peek : 맨 위에 존재하는 객체를 반환하고 삭제하지 않음(무한루프 조심)
	
	// search : 검색(오른쪽, 1부터)
	// indexOf : 검색(왼쪽, 0부터) => 배열방식
	// elementAt(index) : 위치값을 받아서 해당 객체 추출 
	// get(index) : 위치값을 받아서 해당 객체 추출 
	
	// firstElement : 맨 처음 요소 추출
	// lastElement : 맨 마지막 요소 추출
	// setElement(Element, index) : 치환
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.add("둘리");
		stack.addElement("공실");
		stack.push("마이콜");
		System.out.println(stack);
		
		 // 삽입
		stack.add(1, "도우너");
		System.out.println(stack);
		
		stack.add(0, "또치");
		System.out.println(stack);
		
		stack.add(1, "꾸꾸"); // 위에 도우너와 중복x
		System.out.println(stack);
		
		stack.add(1,"둘리"); // 뒤에 데이터가 중복이면 값이 중복 됨
		System.out.println(stack);
		System.out.println("========================");
		
		
		// 마지막에 들어온 객체 보기(처음으로 나갈 객체 보기)
		//					: pop(삭제), peek(삭제x => for문 사용하면 무한루프)
		System.out.println(stack.peek()); // 마지막꺼 머야?
		System.out.println(stack); // 마이콜이얌
		
		System.out.println(stack.pop() + "이고 이거 삭제할거야"); // 마지막꺼 머야?
		System.out.println(stack); // 마이콜인데 알려주고 삭제할꺼얌
		
		// contains, indexOf, search, get, elementAt, firstElement, lastElement
		if (stack.contains("둘리")) { // 둘리있니?
			System.out.println("존재함");		
			// 해당 객체의 위치값
			System.out.println(stack.indexOf("둘리") + "번째 위치"); // 왼쪽에서부터 0,1,2...
			System.out.println(stack.search("둘리") + "번째 위치"); // 오른쪽에서부터 1,2,3...
			// 해당 위치의 객체 꺼내기
			System.out.println("get(1)" + stack.get(1)); // get은 배열방식으로 index값은 왼쪽에서부터 0,1,2...
			System.out.println("get(stack.indexOf()) : " + stack.get(stack.indexOf("둘리")) ); 
			System.out.println("elementAt(stack.indexOf()) : " + stack.elementAt(stack.indexOf("둘리")) );
			System.out.println(stack.firstElement());
			System.out.println(stack.lastElement());
		} else {
			System.out.println("존재하지 않음");
		}
		System.out.println("========================");
		
		// size(갯수), set(치환), setElementAt(치환)
		System.out.println(stack.size()+"요소가 존재합니다.");
		// index가 3인
		//stack.set(3, "마이콜");
		stack.setElementAt("마이콜", 3);
		System.out.println(stack);
		System.out.println("========================");
		
		
		//하나씩 꺼내기 : 개선된for문, iterator() => 데이터 그대로 존재 / pop() => 데이터 삭제
		for (String k : stack) {
			System.out.println(k);
		}
		System.out.println(stack.size()+"요소가 존재합니다.");
		System.out.println("========================");
		
		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			String msg = (String) it.next();
			System.out.println(msg);
		}
		System.out.println(stack.size()+"요소가 존재합니다.");
		System.out.println("========================");
		
		while (! stack.isEmpty()) {
			String k = stack.pop();
			System.out.println(k + "삭제됨, 크기는 " + stack.size());
		}
		
		
	}
	
	
	

}
