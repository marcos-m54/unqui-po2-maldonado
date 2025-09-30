package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoMercadoTest {
	
	private ProductoMercado fideosTerrabusi;
	private ProductoMercado coca;
	
	@BeforeEach
	public void setUp() {
		
		fideosTerrabusi = new ProductoMercado("Fideos Terrabusi", 1200.5, 10);
		coca = new ProductoMercado("Coca-Cola", 3000.75, 100);
	}

	@Test
	public void testProductosDeMercado(){
		
		assertEquals("Fideos Terrabusi", fideosTerrabusi.getNombre());
		assertEquals(1200.5, fideosTerrabusi.getPrecio());
		assertEquals(10, fideosTerrabusi.getStock());
		
		assertEquals("Coca-Cola", coca.getNombre());
		assertEquals(3000.75, coca.getPrecio());
		assertEquals(100, coca.getStock());
	}
	
	@Test
	public void decrementarProductos(){
		
		assertEquals(10, fideosTerrabusi.getStock());
		assertEquals(100, coca.getStock());
		
		fideosTerrabusi.decrementar(5);
		coca.decrementar(75);
		
		assertEquals(5, fideosTerrabusi.getStock());
		assertEquals(25, coca.getStock());
		
	}
	
	
}

	
