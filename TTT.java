package ex07;

import java.util.HashSet;
import java.util.Set;

import lombok.extern.log4j.Log4j;


@Log4j
public class TTT {

	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(5);
		set.add(5);
		set.add(8);
		set.add(9);
		
		log.info(set);
		
	}
} //end class