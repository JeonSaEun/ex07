package ex07;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentCollectionExample {

	public static void main(String[] args) {
		
		//-- 1. ConcurrentHashMap 객체의 생성
		Map<String, Integer> conMap =
			new ConcurrentHashMap<>();
		
		//-- 2. ConcurrentLinkedQueue 객체의 생성
		Queue<Integer> conQ =
			new ConcurrentLinkedQueue<>();
		
	} // main
	
} // end class
