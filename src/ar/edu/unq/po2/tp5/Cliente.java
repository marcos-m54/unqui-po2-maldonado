package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nombre;
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Cliente(String nombre) {
		this.nombre = nombre;
	}
	
	public double montoTotalAPagar() {
		return productos.stream()
						.mapToDouble(producto -> producto.getPrecio())
						.sum();
	}
	
	
}
