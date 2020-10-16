package ex07;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.extern.log4j.Log4j;


@Log4j
public class SynchronizedCollectionExample {

	public static void main(String[] args) {
		// Thread-Unsafe List Collection
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		
		log.info(list);
		log.info(list.getClass().getName()); 	// ArrayList
		
		//--------------------------//
		// Thread-Safe한 List 객체를 얻어낼 수 있음
		List<Integer> syncList = 
			Collections.synchronizedList(list);
		
		log.info(syncList);
		log.info(syncList.getClass().getName()); 	// ArrayList
		
		//--------------------------//
		Set<Integer> set = new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		log.info(set);
		log.info(set.getClass().getName());
		
		//--------------------------//
		// Thread-Safe
		Set<Integer> syncSet =
			Collections.synchronizedSet(set);
		
		log.info(syncSet);
		log.info(syncSet.getClass().getName());
	} // main
	
} // end class
