package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IngresoTest {
	
	private Ingreso mesDeMarzo;
	private Ingreso mesDeAbril;
	

	@BeforeEach
	public void setup() {
		mesDeMarzo = new Ingreso(3,"Ingresos Marzo", 150000.50);
		mesDeAbril = new Ingreso(4,"Ingresos Abril", 150000.50);
	}
	
	@Test
	public void testMesDeMarzo() {
		assertEquals(3, mesDeMarzo.getMes());
		assertEquals("Ingresos Marzo", mesDeMarzo.getConcepto());
		assertEquals(150000.50, mesDeMarzo.getMontoPercibido());
	}
	
	@Test
	public void testMesDeAbril() {
		assertEquals(4, mesDeAbril.getMes());
		assertEquals("Ingresos Abril", mesDeAbril.getConcepto());
		assertEquals(150000.50, mesDeAbril.getMontoPercibido());
	}
}
