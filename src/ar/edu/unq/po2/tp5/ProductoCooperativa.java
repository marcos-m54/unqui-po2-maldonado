package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends ProductoMercado {

	public ProductoCooperativa(String nombre, double precio, int stock) {
		super(nombre, precio, stock);
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() - (super.getPrecio() * this.montoDescuento());
	}
	
	public double montoDescuento() {
		return 0.1;
	}

}
