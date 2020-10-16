package ex07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import lombok.extern.log4j.Log4j;


@Log4j
public class HashMapExample1 {

	
	public static void main(String[] args) {
		// 1. Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 2. 객체 지정
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		log.info(">>> map : " + map);
		
//		for( Map.Entry<String, Integer> e : map) {
//		// map = NO!!
//		}
		
		
		// 3. 컬렉션의 크기 획득 및 출력
		log.info("총 Entry 수 : " + map.size());
		
		// 4. 객체 검색(By using "KEY")
		log.info("\t홍길동 : " + map.get("홍길동"));
		
		log.info("\n");
		
		// 5. 모든 객체 순회(traverse) By using Iterator
		Set<String> keySet = map.keySet(); // Key만 추출
		
		// 6. Set 컬렉션에서 반복자(Iterator) 추출하여,
		// 모든 요소를 traverse
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			
			Integer value = map.get(key);
			
			log.info("\t" + key + " : " + value);
		} // while
		
		for(String key : keySet) {
			log.info("- key : " + key);
			log.info("- value : " + map.get(key));
		} // enhanced for
		
		log.info("\n");
		
		// 7. 객체 삭제
		map.remove("홍길동");
		
		log.info("총 Entry 수 : " + map.size());
		
		// 8. 객체를 하나씩 처리
		Set< Map.Entry<String, Integer> > entrySet =
				map.entrySet();		// Map.Entry 객체 모두 추출
		
		// 9. Set 컬렉션에서 반복자(Iterator) 획득
		Iterator< Map.Entry<String, Integer> > entryIterator =
				entrySet.iterator();
		
		// 10. 반복자(Iterator)를 통해, 모든 요소 traverse
//		while(entryIterator.hasNext()) {
//			Map.Entry<String, Integer> entry =
//				entryIterator.next();
//			
//			String key = entry.getKey();
//			Integer value = entry.getValue();
//			
//			log.info("\t" + key + " : " + value);
//		} // while
		
		for(Map.Entry<String, Integer> e : entrySet) {
			log.info("- key : " + e.getClass().getName());
		}
		
		log.info("\n");
		
		// 11. 객체 전체 삭제
		map.clear(); 	
		
		log.info("총 Entry 수 : " + map.size());
	} // main
	
} // end class