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
	
	public int cantidadDeMultiplos(int unNumero) {

		return (int) numbers.stream().filter(otroNumero -> this.isMultiple(unNumero,otroNumero)).count();
	}

	public boolean isMultiple(int unNumero, int otroNumero) {
		return unNumero % otroNumero == 0;
	}
	
	public int cantidadDigitosPares(int unNumero) {
		
		int cantPares=0;
		int numero = unNumero;
		int digito;
		
		while(numero > 0){
			digito = numero % 10;
			
			if (this.isEven(digito)) {
				cantPares += 1;
			}
			
			numero = numero / 10;
		}
		
		return cantPares;
		
	}
	//public Integer desarmadorDeNumeros(unNumero) {
		//unNumero % 10
	//}

}



