package ar.edu.unq.ob2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	private List<Integer> numbers = new ArrayList<Integer>();
	
	public void addNumber(Integer aNumber) {
		numbers.add(aNumber);
	}
	
	public int getEvenOcurrences() {
		return (int) numbers.stream()
					  .filter(number -> this.isEven(number))
					  .count();
	}
	
	public int getOddOcurrences() {
		return (int) numbers.stream()
							.filter(number -> this.isOdd(number))
							.count();
	}
	
	
	public Boolean isOdd(Integer aNumber) {
		return (aNumber % 2) > 0;
	}
	
	public Boolean isEven(Integer aNumber) {
		return !this.isOdd(aNumber);
	}
}
