package ar.edu.unq.po2.tp5;

public abstract class Producto implements Stock, Precio{
	
	private String nombre;
	private double precio;
	private int stock;
	
	public Producto(String nombre, double precio, int stock) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setStock(stock);
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public double getPrecio() {
		return this.precio;
	}
	
	@Override
	public void setPrecio(double precio) {
		this.precio = precio;
		}

	@Override
	public int getStock() {
		return this.stock;
	}

	@Override
	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public void decrementar(int unaCantidad) {
		this.setStock(this.getStock() - unaCantidad);
	}
	
}
	
	
		
	
	
	
	
	
	

