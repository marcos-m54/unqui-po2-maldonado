package ar.edu.unq.po2.doubles;

import java.util.ArrayList;
import java.util.List;

public class PokerStatus {

	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		int i = 0;
		//boolean hayPoker = false;
		
		List<Integer> cartas = new ArrayList<Integer>();
		List<String>  paloDeCartas = new ArrayList<String>();
		
		cartas.add(this.valorCarta(carta1));
		cartas.add(this.valorCarta(carta2));
		cartas.add(this.valorCarta(carta3));
		cartas.add(this.valorCarta(carta4));
		cartas.add(this.valorCarta(carta5));
		
		paloDeCartas.add(this.paloDeCarta(carta1));
		paloDeCartas.add(this.paloDeCarta(carta2));
		paloDeCartas.add(this.paloDeCarta(carta3));
		paloDeCartas.add(this.paloDeCarta(carta4));
		paloDeCartas.add(this.paloDeCarta(carta5));
		

		
		
		while(i != 4) {
			
			Integer cartaActual = cartas.get(i);
			
			if (cartas.stream().filter(carta -> carta == cartaActual).count() == 4) {
				return "Poker";
			}
			
			if (cartas.stream().filter(carta -> carta == cartaActual).count() == 3) {
				return "Trio";
			}
			
			i++;
			
		}
		
		if(paloDeCartas.stream().allMatch(carta -> carta.equals("C")) || paloDeCartas.stream().allMatch(carta -> carta.equals("D")) ||
		   paloDeCartas.stream().allMatch(carta -> carta.equals("T")) || paloDeCartas.stream().allMatch(carta -> carta.equals("P"))){
			return "Color";
		}
		
		return "";
	}
	
	
	public Integer valorCarta(String unaCarta) {
		
	    String valor = unaCarta.substring(0, 1);

	    if (unaCarta.length() == 3) return 10;
	    if (valor.equals("J")) return 11;
	    if (valor.equals("Q")) return 12;
	    if (valor.equals("K")) return 13;

	    return Integer.valueOf(valor);
	}
	
	public String paloDeCarta(String unaCarta) {
		
		if (unaCarta.length() == 3) return unaCarta.substring(2,3);
		
		return unaCarta.substring(1,2);
		
	}

}
