package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Contador {
	
	private List<Integer> numeros = new ArrayList<Integer>();
	
	public void agregarNumero(Integer unNumero){
		numeros.add(unNumero);
	}
	
	public int cantidadDePares() {
		return (int) numeros.stream()
					  .filter(numero -> this.esPar(numero))
					  .count();
	}
	
	public int cantidadDeImpares(){
		return (int) numeros.stream()
							.filter(numero -> !this.esPar(numero))
							.count();
	}
	
	public int cantidadDeMultiplosDe_(int unNumero) {
		return (int)  numeros.stream()
					         .filter(numero -> this.esNumero_MultiploDe_(numero, unNumero))
					         .count();
	}
	
	
	public boolean esPar(int unNumero) {
		return (unNumero % 2) == 0;
	}
	
	public boolean esNumero_MultiploDe_(int unNumero, int otroNumero) {
		return (unNumero % otroNumero) == 0;
	}
	
	public int numeroConMasDigitosPares() {
		return numeros.stream()
					  .
	}
	
	public int cantVecesQuePuedoDividirPorDosA_(int unNumero) {
		
		int cantVeces=0;
		int numero = unNumero;
		
		while(this.esNumero_MultiploDe_(numero, 2)){
			numero = numero / 2;
			cantVeces += 1;
		}
		
		return cantVeces;
		
	}
	
	
	public int cantVecesQuePuedoDivPorDosA_(int unNumero) {
		if(this.esNumero_MultiploDe_(unNumero, 2)) {
			unNumero = unNumero/2
		}
	}
	
}
