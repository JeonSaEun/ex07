package ex07;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Student {

	public int sno;			// 학번
	public String name;		// 이름
	
	
	// 1차 중복여부 판단기준
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	} // hashCode
	
	// 2차 중복여부 판단기준
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			
			Student student = (Student) obj;
			
			return (sno==student.sno) && (name.equals(student.name));
			
		} else {
			return false;
		} // if-else
	} // main
	
} // end class