package ex07;

import java.util.Arrays;
import java.util.List;

import lombok.extern.log4j.Log4j;

@Log4j
public class ArrayAsListExample {

	
	public static void main(String[] args) {
		// List<String> 타입의 List 컬렉션을 생성할 때,
		// 값의 목록을 가지고 있다면 이 값의 목록으로 간단하게
		// List 컬렉션을 만들 수 있다
		// Arrays.asList(T...)
		List<String> list1 = 
			Arrays.asList("홍길동", "신용권", "김자바");
		
		log.info(">>> list1: " + list1.getClass().getName());
		
		//----------------------//
		
		for(String name: list1) {
			log.info(name);
		} // enhanced for
		
		//----------------------//
		
		List<Integer> list2 =
			Arrays.asList(1, 2, 3);
		
		for(int value : list2) {
			log.info(value);
		} // enhanced for
	} // main
	
} // end class