package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio);
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * this.porcentajeDescuento();
	}
	
	public double porcentajeDescuento() {
		return 0.9;
	}
}
