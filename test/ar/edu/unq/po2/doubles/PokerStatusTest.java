package ar.edu.unq.po2.doubles;

//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusTest {
	
	private PokerStatus mano;	
	
	@BeforeEach
	public void setUp() {
		
		mano = new PokerStatus();
	}
	
	@Test
	public void valoresDeCartaDel1Al10() {
		
		assertEquals(1, mano.valorCarta("1P"));
		assertEquals(2, mano.valorCarta("2P"));
		assertEquals(3, mano.valorCarta("3P"));
		assertEquals(4, mano.valorCarta("4P"));
		assertEquals(5, mano.valorCarta("5P"));
		assertEquals(6, mano.valorCarta("6P"));
		assertEquals(7, mano.valorCarta("7P"));
		assertEquals(8, mano.valorCarta("8P"));
		assertEquals(9, mano.valorCarta("9P"));
		assertEquals(10, mano.valorCarta("10P"));
		
	}
	
	@Test
	public void valoresDeCartasFiguras() {
		
		assertEquals(11, mano.valorCarta("JP"));
		assertEquals(11, mano.valorCarta("JC"));
		assertEquals(11, mano.valorCarta("JD"));
		assertEquals(11, mano.valorCarta("JT"));
		
		assertEquals(12, mano.valorCarta("QP"));
		assertEquals(13, mano.valorCarta("KP"));
		
		}
	
	
	@Test
	public void deberiaDetectarTrio() {
		assertEquals("Trio", mano.verificar("7P","9C","9D","9T","QT"));
		assertEquals("Trio", mano.verificar("1P","QC","QD","9T","QT"));
		assertEquals("Trio", mano.verificar("10C","10T","9D","9T","10Q"));
		assertEquals("Trio", mano.verificar("7P","6C","6D","9T","6T"));
	}
	
	@Test
	public void DeberiaDetectcarPoker() {
		assertEquals("Poker", mano.verificar("4P","4C","4D","4T","5T"));
		assertEquals("Poker", mano.verificar("4P","6C","6D","6T","6T"));		
		assertEquals("Poker", mano.verificar("10P","10C","10D","4T","10T"));
		assertEquals("Poker", mano.verificar("5T","QP", "QC", "QD", "QT"));
		assertEquals("Poker", mano.verificar("5T","JP","JC","JD","JT")); 
																	  
	}
	
		
	@Test
	public void deberiaDetectarColor() {
		assertEquals("Color", mano.verificar("1P","3P","QP","KP","JP"));
		assertEquals("Color", mano.verificar("1C","3C","QC","KC","JC"));
		assertEquals("Color", mano.verificar("1T","3T","QT","KT","JT"));
	}

	
}
