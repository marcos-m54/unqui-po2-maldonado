package ar.edu.unq.ob2.state;


public class Videojuego {

	private int fichas;
	private Estado estado;
	
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Videojuego() {
		super();
		this.fichas = 0;
		this.estado = new EstadoApagado(this);
	}

	public int getFichas() {
		return fichas;
	}

	public void setFichas(int fichas) {
		this.fichas = fichas;
	}

	public String iniciar() {
		return estado.iniciar();
	}
	
	public void insertarFicha() {
		estado.insertarFicha();
	}
	
	public String terminarJuego() {
		return estado.terminarJuego();
	}
	
}
