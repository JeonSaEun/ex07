package ex07;

import java.util.List;
import java.util.Vector;

import lombok.extern.log4j.Log4j;


@Log4j
public class VectorExample {

	
	public static void main(String[] args) {
		// Thread-safe(synchronized) 한
		// Vector(내부구조는 ArrayList와 동일) 컬렉션 생성
		List<Board> list = new Vector<>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
	
		list.remove(2);
		list.remove(3);
		
		for(Board board : list) {
//							board = list.get(i++);	// 저장된 인덱스 객체얻기
			log.info(
				board.subject +
				"\t" +
				board.content +
				"\t" +
				board.writer
			);
		} // for
		
	} // main
	
} // end class