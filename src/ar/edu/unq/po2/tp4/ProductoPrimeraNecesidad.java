package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private double porcentajeDescuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double porcentajeDescuento) {
		super(nombre, precio, esPrecioCuidado);
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, double porcentajeDescuento) {
		super(nombre, precio);
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	public double factorDescuento() {
		return this.getPorcentajeDescuento() * 0.1;
	}
	
	public double precioFinal() {
		return this.getPrecio() * this.factorDescuento();
	}
	

}
