package ex07;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.log4j.Log4j;


@Log4j
public class ArrayListExample {

	
	public static void main(String[] args) {
		// List 구현하는 ArrayList 객체를 생성
		// Lvalue: 인터페이스 변수
		// Rvalue: 실제 List를 구현한 구현객체
		List<String> list = new ArrayList<>();
		
		//---------------------------------------//
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		//---------------------------------------//
		
		int size = list.size();
		log.info("총 객체 수: " + size);
		log.info("==================");
		
		//---------------------------------------//
		
		String skill = list.get(2);
		log.info("2: " + skill);
		log.info("==================");
	
//		for(int i=0; i<list.size(); i++) {
//			String str = list.get(i);
//			
//			log.info(i + ":" + str);
//		} // for
		
		int index = 0;
		for(String str:list) {
			
			log.info(index++ + ":" + str);
		} // enhanced for
		
		log.info("==================");

		//---------------------------------------//
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		//---------------------------------------//
		
//		for(int i=0; i<list.size(); i++) {
//			String str = list.get(i);
//			log.info(i + ":" + str);
//		} // for
		
		index = 0;
		for(String str:list) {
			
			log.info(index++ + ":" + str);
		} // enhanced for
		
	} // main
	
} // end class