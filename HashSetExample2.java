package ex07;

import java.util.HashSet;
import java.util.Set;

import lombok.extern.log4j.Log4j;


@Log4j
public class HashSetExample2 {

	
	public static void main(String[] args) {
		// Set 컬렉션 객체 생성
		Set<Member> set = new HashSet<>();
		
		// Member 객체를 구슬주머니에 넣음
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 29));
		
		log.info("총 객체 수 : " + set.size());
	} // main
	
} // end class