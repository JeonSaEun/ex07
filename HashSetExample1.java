package ex07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import lombok.extern.log4j.Log4j;


@Log4j
public class HashSetExample1 {

	
	public static void main(String[] args) {
		// Set 인터페이스를 구현하는 Set Collection 생성
		Set<String> set = new HashSet<>();
		
		// 객체(엘리먼트, 요소) 추가 (인덱스 개념 X)
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		// Set 컬렉션의 크기(즉, 구슬의 개수) 반환
		int size = set.size();
		log.info("총 객체 수 : " + size);
		
		// 반복자(Iterator) 객체 획득
		// 이유: 구슬주머니(Set 컬렉션)에 들어있는 각각의 구슬을
		// 사용하고자 할 때 필요함(traverse, 순회)
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			
			log.info("\t" + element);
		} // while
		
		// 구슬삭제 (인덱스란 개념이 없으므로, 구슬을 전달하여 삭제)
		set.remove("JDBC");
		set.remove("iBATIS");
		
		log.info("총 객체 수 : " + set.size());
		
		// 향상된 for문을 이용한 traverse(각 구슬 사용)
		for(String element : set) {
			log.info("\t" + element);
		} // enhanced for
		
		// 구슬주머니(Set 컬렉션)을 한번에 비움(Clear)
		set.clear();
		
		// 구슬주머니(Set 컬렉션이 비워졌나요?
		if(set.isEmpty()) {
			log.info("비어 있음");
		} // if	
	} // main
	
} // end class