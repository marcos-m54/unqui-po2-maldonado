package ar.edu.unq.ob2.state;

public class Jugando implements Estado {

	private Videojuego videojuego;
	
	public Jugando(Videojuego videojuego) {
		this.videojuego = videojuego;
	}
	
	@Override
	public void insertarFicha() {
		// TODO Auto-generated method stub

	}

	@Override
	public String iniciar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String terminarJuego() {
		
		videojuego.setEstado(new EstadoInicial(videojuego));
		return "Game Over";
	}


}
