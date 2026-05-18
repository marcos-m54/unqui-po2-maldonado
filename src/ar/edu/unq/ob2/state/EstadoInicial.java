package ar.edu.unq.ob2.state;

public class EstadoInicial implements Estado {
	
	private Videojuego videojuego;
	
	public EstadoInicial(Videojuego videojuego){
		this.videojuego = videojuego;
	}

	@Override
	public void insertarFicha() {
		videojuego.setFichas(videojuego.getFichas() + 1);
	}

	@Override
	public String iniciar() {
		
		if (videojuego.getFichas() == 0) {
			return "ingresa una o mas fichas";
			
		}
		
		else 
		
		{
			
			videojuego.setEstado(new Jugando(videojuego));
			
			videojuego.setFichas(0);

			return "comenzando juego en 3 2 1";
		}
		
	}

	@Override
	public String terminarJuego() {
		// TODO Auto-generated method stub
		return null;
	}


}
