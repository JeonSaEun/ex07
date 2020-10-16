package ex07;

import java.util.Stack;

import lombok.extern.log4j.Log4j;


@Log4j
public class StackExample {

	
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
//		Stack<String> coinBox = new Stack<>();
		
		//--------------------------//
		
//		Coin coin100 = new Coin(100);
//		Coin coin50 = new Coin(50);
//		Coin coin500 = new Coin(500);
//		Coin coin10 = new Coin(10);
		
		//--------------------------//
		
		Coin coin10 = new Coin(10);
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(coin10);
		
		//--------------------------//
//		coinBox.push("100");
//		coinBox.push("50");
//		coinBox.push("500");
//		coinBox.push("10");
		
		//--------------------------//
		
//		while(!coinBox.isEmpty()) {
//			String coin = coinBox.peek();
////			coin = coinBox.pop();
//		
//			log.info(
//				"꺼내온 동전 : " +
//					coin + "원");
//			
//			coinBox.pop();
//		} // while
		
		//--------------------------//
		
		int index = coinBox.search(coin10);
		log.info(index);
		
	} // main

} // end class