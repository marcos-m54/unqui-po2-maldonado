package ar.edu.unq.po2.doubles;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
	public void DeberiaDetectcarPoker() {
		assertTrue(mano.verificar("4P","4C","4D","4T","5T"));
		assertTrue(mano.verificar("4P","6C","6D","6T","6T"));		
		assertTrue(mano.verificar("10P","10C","10D","4T","10T"));
		assertTrue(mano.verificar("5T","QP", "QC", "QD", "QT"));
		assertTrue(mano.verificar("5T","JP","JC","JD","JT")); 
																	  
	}
	
	@Test
	public void DeberiaDetectarQueNOesPoker() {
		assertFalse(mano.verificar("2P","4C","JD","JT","5T"));
		assertFalse(mano.verificar("QP","KC","2D","6T","5T"));
	}
 
}
