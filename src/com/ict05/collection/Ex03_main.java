package com.ict05.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_main {
	public static void main(String[] args) {
		
		//setter를 이용해서 이름과 값을 정함
		Ex03 coffee = new Ex03();
		coffee.setName("커피음료");
		coffee.setPrice(2500);
		
		// 생성자를 이용해서 이름과 값을 정함
		Ex03 cola = new Ex03("콜라",1600);
		Ex03 juice = new Ex03("과일음료", 2300);
		
		// 객체를 저장하고 관리하는 방법: 배열, 컬렉션
		
		// 1. 배열
		// Ex03이 자료형이됨
		Ex03[] arr = new Ex03[3];
		arr[0] = coffee;
		arr[1] = cola;
		arr[2] = juice;
		
		// 이름과 가격을 꺼내서 쓰기 (?)
		for (Ex03 k : arr) {
			System.out.println("이름 : " + k.getName());
			System.out.println("가격 : " + k.getPrice());
		}
		System.out.println("=================");
		
		
		// 2. 컬렉션
		// h1은 Ex03으로만 만들어진 객체들이 필요한 것이다
		// Ex03이 제네릭타입
		
		HashSet<Ex03> h1 = new HashSet<>();
		//추가, h1은 Ex03에서 만들어진 객체만 받아옴
		h1.add(coffee);
		h1.add(cola);
		h1.add(juice);
		//새로 추가도 가능(배열은 불가)
		h1.add(new Ex03("이온음료", 1500));
		
		//이름,.가격 꺼내기
		// 1). 개선된 for문 사용
		for (Ex03 k : h1) { 
			System.out.println("이름 : " + k.getName());
			System.out.println("가격 : " + k.getPrice());
		}
		System.out.println("=================");
		
		
		
		// 2). iterator()
		Iterator<Ex03> it = h1.iterator(); // h1에 차례대로 접근
		while (it.hasNext()) {
			Ex03 s1 = (Ex03) it.next();
			System.out.println("이름 : " + s1.getName());
			System.out.println("가격 : " + s1.getPrice());
			}
		System.out.println("=================");
		
		
		// 포함여부: contains(Object o)
		if(h1.contains(coffee)) {
			System.out.println("있다.");
		}else {
			System.out.println("없다.");
		}
		
		// 갯수: size()
		System.out.println(h1.size());
		
		// 삭제: remove(Object o) , clear()
		// 컬렉션 안에 해당 객체가 있으면 삭제, 없으면 삭제안함
		// cola가 있으면 삭제해라
		if (h1.contains(cola)) {
			h1.remove(cola);
			System.out.println(cola.getName() + " 삭제");
		} else {
			System.out.println("존재하지 않습니다");
		}
		System.out.println("=================");
		
		// 전체 삭제 후, 비었는지 확인하기 : isEmpty()
		System.out.println("---전체 삭제 전---");
		if (h1.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("비어있지 않음");
		}
		System.out.println("---전체 삭제 후---");
		h1.clear();
		if (h1.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("비어있지 않음");
		}
		
		
		
		
	}

}
