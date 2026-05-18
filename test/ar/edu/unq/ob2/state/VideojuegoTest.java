package ar.edu.unq.ob2.state;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VideojuegoTest {

	private Videojuego videojuego;
	
	@BeforeEach
	void setUp() {
		videojuego = new Videojuego();
	}
	
	@Test
	void testCambiosDeEstado() {
		
		assertEquals("prendiendo", videojuego.iniciar());
		assertEquals("ingresa una o mas fichas", videojuego.iniciar());
		videojuego.insertarFicha();
		assertEquals(1,videojuego.getFichas());
		assertEquals("comenzando juego en 3 2 1", videojuego.iniciar());
		assertEquals("Game Over", videojuego.terminarJuego());

	}

}
