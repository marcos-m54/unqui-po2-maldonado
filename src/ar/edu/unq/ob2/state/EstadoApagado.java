package ar.edu.unq.ob2.state;

public class EstadoApagado implements Estado {

	private Videojuego videojuego;
	
	public EstadoApagado(Videojuego videojuego){
		this.videojuego = videojuego;
	}
	
	public Videojuego getVideojuego() {
		return videojuego;
	}
	

	@Override
	public void insertarFicha() {
		// TODO Auto-generated method stub

	}

	@Override
	public String iniciar() {
		
		videojuego.setEstado(new EstadoInicial(videojuego));
		return "prendiendo";
	}

	@Override
	public String terminarJuego() {
		// TODO Auto-generated method stub
		return null;
	}

}
