package ex07;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@AllArgsConstructor
public class Member {

	public String name;
	public int age;
	
	@Override
	public boolean equals(Object obj) {
		log.info("equals(obj) invoked.");
		if(obj instanceof Member) {
			Member member = (Member) obj;
			
			boolean isSame = member.name.equals(name) && (member.age==age);
			
			log.info("\t>>> isSame: " + isSame);
			return isSame;
		} else {
			return false;
		} // if-else
	} // equals
	
	@Override
	public int hashCode() {
		log.info("hashCode() invoked.");
		
		int myHashCode = name.hashCode() + age;
		log.info("\t>>> myHashCode: " + myHashCode);
		
		return myHashCode;
	} // hashCode
	
} // end class