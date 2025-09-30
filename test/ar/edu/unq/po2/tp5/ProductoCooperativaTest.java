package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoCooperativaTest {
	
	private ProductoCooperativa arroz;
	private ProductoCooperativa manaos;
	
	@BeforeEach
	public void setUp() {
		
		arroz = new ProductoCooperativa("Arroz Santamarina", 1500.00, 234);
		manaos = new ProductoCooperativa("Manaos 6 lts", 1000.00, 250);
	}

	@Test
	public void testProductosDeCooperativa() {
		
		assertEquals("Arroz Santamarina", arroz.getNombre());
		assertEquals(1350.00, arroz.getPrecio());
		assertEquals(234, arroz.getStock());
	
		assertEquals("Manaos 6 lts", manaos.getNombre());
		assertEquals(900, manaos.getPrecio());
		assertEquals(250, manaos.getStock());	
	}
	
	@Test
	public void decrementarStockTest() {
	
		assertEquals(234, arroz.getStock());
		assertEquals(250, manaos.getStock());
	
		arroz.decrementar(34);
		manaos.decrementar(150);
		
		assertEquals(200, arroz.getStock());
		assertEquals(100, manaos.getStock());
		
	}
	
	
	
}

	
