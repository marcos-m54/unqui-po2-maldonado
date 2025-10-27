package ar.edu.unq.po2.doubles;

import java.util.ArrayList;
import java.util.List;

public class PokerStatus {

	public boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		int i = 0;
		boolean hayPoker = false;
		
		List<Integer> cartas = new ArrayList<Integer>();
		
		cartas.add(this.valorCarta(carta1));
		cartas.add(this.valorCarta(carta2));
		cartas.add(this.valorCarta(carta3));
		cartas.add(this.valorCarta(carta4));
		cartas.add(this.valorCarta(carta5));
		
		
		while(i != 4) {
			
			Integer cartaActual = cartas.get(i);
			
			if (cartas.stream().filter(carta -> carta == cartaActual).count() == 4) {
				return hayPoker = true;
			}
			
			i++;
			
		}
		
		return hayPoker;
	}
	
	
	public Integer valorCarta(String unaCarta) {
		
	    String valor = unaCarta.substring(0, 1);

	    if (unaCarta.length() == 3) return 10;
	    if (valor.equals("J")) return 11;
	    if (valor.equals("Q")) return 12;
	    if (valor.equals("K")) return 13;

	    return Integer.valueOf(valor);
	}

}
