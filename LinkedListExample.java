package ex07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import lombok.extern.log4j.Log4j;


@Log4j
public class LinkedListExample {

	
	public static void main(String[] args) {
		// ArrayList 컬렉션과 LinkedList 컬렉션의 성능비교
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		// 성능 측정을 위한 지역변수 선언
		long startTime;
		long endTime;
		
		//---------------------------------//
		startTime = System.nanoTime();
		//---------------------------------//
			
			for(int i=0; i<1000000; i++) {
				list1.add(0, String.valueOf(i));
			} // for
		
		//---------------------------------//
		endTime = System.nanoTime();
		//---------------------------------//
		
		log.info("ArrayList Elapsed: " +
				(endTime-startTime) + " ns");
		
		
		
		
		//---------------------------------//
		startTime = System.nanoTime();
		//---------------------------------//
		
			for(int i=0; i<1000000; i++) {
				list2.add(0, String.valueOf(i));
			} // for
			
		//---------------------------------//
		endTime = System.nanoTime();
		//---------------------------------//

		log.info("LinkedList Elapsed: " +
				(endTime-startTime) + " ns");
		
	} // main
	
} // end class