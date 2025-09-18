package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	
	private Contador contador;
	
	/**
	 * Crea un escenario de test basico, que consiste en un contador con 10 enteros
	 * @throws Exception
	 */
	
	@BeforeEach
	public void setUp() throws Exception {
		
		//Se crea el contador
		
		contador = new Contador();
		
		//se agregan los nmeros, un solo par y nueve impares
		
		contador.agregarNumero(1);
		contador.agregarNumero(3);
		contador.agregarNumero(5);
		contador.agregarNumero(7);
		contador.agregarNumero(9);
		contador.agregarNumero(1);
		contador.agregarNumero(1);
		contador.agregarNumero(1);
		contador.agregarNumero(1);
		contador.agregarNumero(4);
	}
	
	/**
	 * Verifica la cantidad de pares
	 */
	
	@Test
	public void testDeNumerosPares() {
		
		int cantidadDePares = contador.cantidadDePares();
			
		assertEquals(1, cantidadDePares);
	}
	
	@Test
	public void testDeNumerosImpares() {
		
		int cantidadDeImpares = contador.cantidadDeImpares();
			
		assertEquals(9, cantidadDeImpares);
	}
	
	@Test
	public void multiplosDeCinco() {
		
		int cantMultiplosDeCinco = contador.cantidadDeMultiplosDe_(5);
			
		assertEquals(1, cantMultiplosDeCinco);
	}
	
	@Test
	public void multiplosDeTres() {
		
		int cantMultiplosDeTres = contador.cantidadDeMultiplosDe_(3);
			
		assertEquals(2, cantMultiplosDeTres);
	}
	
	@Test
	public void multiplosDeUno() {
		
		int cantMultiplosDeUno = contador.cantidadDeMultiplosDe_(1);
			
		assertEquals(10, cantMultiplosDeUno);
	}


}
