package ar.edu.unq.po2.doubles;

//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusTest {
	
	private PokerStatus mano;
	
	private Palo diamante;
	private Palo corazon;
	private Palo pica;
	private Palo trebol;
	
	
	private Naipe unoDeCorazon;
	private Naipe dosDeCorazon;
	private Naipe tresDeCorazon;
	private Naipe cuatroDeCorazon;
	private Naipe cincoDeCorazon;
	private Naipe seisDeCorazon;
	private Naipe sieteDeCorazon;
	private Naipe ochoDeCorazon;
	private Naipe nueveDeCorazon;
	private Naipe diezDeCorazon;
	private Naipe jackDeCorazon;
	private Naipe queenDeCorazon;
	private Naipe kingDeCorazon;
	
	private Naipe unoDePica;
	private Naipe dosDePica;
	private Naipe tresDePica;
	private Naipe cuatroDePica;
	private Naipe cincoDePica;
	private Naipe seisDePica;
	private Naipe sieteDePica;
	private Naipe ochoDePica;
	private Naipe nueveDePica;
	private Naipe diezDePica;
	private Naipe jackDePica;
	private Naipe queenDePica;
	private Naipe kingDePica;
	
	private Naipe unoDeDiamante;
	private Naipe dosDeDiamante;
	private Naipe tresDeDiamante;
	private Naipe cuatroDeDiamante;
	private Naipe cincoDeDiamante;
	private Naipe seisDeDiamante;
	private Naipe sieteDeDiamante;
	private Naipe ochoDeDiamante;
	private Naipe nueveDeDiamante;
	private Naipe diezDeDiamante;
	private Naipe jackDeDiamante;
	private Naipe queenDeDiamante;
	private Naipe kingDeDiamante;
	
	private Naipe unoDeTrebol;
	private Naipe dosDeTrebol;
	private Naipe tresDeTrebol;
	private Naipe cuatroDeTrebol;
	private Naipe cincoDeTrebol;
	private Naipe seisDeTrebol;
	private Naipe sieteDeTrebol;
	private Naipe ochoDeTrebol;
	private Naipe nueveDeTrebol;
	private Naipe diezDeTrebol;
	private Naipe jackDeTrebol;
	private Naipe queenDeTrebol;
	private Naipe kingDeTrebol;
	
	@BeforeEach
	public void setUp() {
		
		mano = new PokerStatus();
		
		diamante = Palo.DIAMANTE;
		corazon  = Palo.CORAZON;
		pica	 = Palo.PICA;
		trebol   = Palo.TREBOL;
 		
		
		unoDeCorazon		= new Naipe(corazon, 1);
		dosDeCorazon		= new Naipe(corazon, 2);
		tresDeCorazon		= new Naipe(corazon, 3);
		cuatroDeCorazon		= new Naipe(corazon, 4);
		cincoDeCorazon		= new Naipe(corazon, 5);
		seisDeCorazon		= new Naipe(corazon, 6);
		sieteDeCorazon		= new Naipe(corazon, 7);
		ochoDeCorazon		= new Naipe(corazon, 8);
		nueveDeCorazon		= new Naipe(corazon, 9);
		diezDeCorazon		= new Naipe(corazon, 10);
		jackDeCorazon		= new Naipe(corazon, 11);
		queenDeCorazon		= new Naipe(corazon, 12);
		kingDeCorazon		= new Naipe(corazon, 13);
		
		unoDePica		= new Naipe(pica, 1);
		dosDePica		= new Naipe(pica, 2);
		tresDePica		= new Naipe(pica, 3);
		cuatroDePica	= new Naipe(pica, 4);
		cincoDePica		= new Naipe(pica, 5);
		seisDePica		= new Naipe(pica, 6);
		sieteDePica		= new Naipe(pica, 7);
		ochoDePica		= new Naipe(pica, 8);
		nueveDePica		= new Naipe(pica, 9);
		diezDePica		= new Naipe(pica, 10);
		jackDePica		= new Naipe(pica, 11);
		queenDePica		= new Naipe(pica, 12);
		kingDePica		= new Naipe(pica, 13);

		unoDeDiamante		= new Naipe(diamante, 1);
		dosDeDiamante		= new Naipe(diamante, 2);
		tresDeDiamante		= new Naipe(diamante, 3);
		cuatroDeDiamante	= new Naipe(diamante, 4);
		cincoDeDiamante		= new Naipe(diamante, 5);
		seisDeDiamante		= new Naipe(diamante, 6);
		sieteDeDiamante		= new Naipe(diamante, 7);
		ochoDeDiamante		= new Naipe(diamante, 8);
		nueveDeDiamante		= new Naipe(diamante, 9);
		diezDeDiamante		= new Naipe(diamante, 10);
		jackDeDiamante		= new Naipe(diamante, 11);
		queenDeDiamante		= new Naipe(diamante, 12);
		kingDeDiamante		= new Naipe(diamante, 13);

		unoDeTrebol			= new Naipe(trebol, 1);
		dosDeTrebol			= new Naipe(trebol, 2);
		tresDeTrebol		= new Naipe(trebol, 3);
		cuatroDeTrebol		= new Naipe(trebol, 4);
		cincoDeTrebol		= new Naipe(trebol, 5);
		seisDeTrebol		= new Naipe(trebol, 6);
		sieteDeTrebol		= new Naipe(trebol, 7);
		ochoDeTrebol		= new Naipe(trebol, 8);
		nueveDeTrebol		= new Naipe(trebol, 9);
		diezDeTrebol		= new Naipe(trebol, 10);
		jackDeTrebol		= new Naipe(trebol, 11);
		queenDeTrebol		= new Naipe(trebol, 12);
		kingDeTrebol		= new Naipe(trebol, 13);

		
		
	}
	
	@Test
	public void losValoresDeLosNaipesSonLosCorrectos() {
		
		assertEquals(1,  unoDeCorazon.getValor());
		assertEquals(2,  dosDeCorazon.getValor());
		assertEquals(3,  tresDeCorazon.getValor());
		assertEquals(4,  cuatroDeCorazon.getValor());
		assertEquals(5,  cincoDeCorazon.getValor());
		assertEquals(6,  seisDeCorazon.getValor());
		assertEquals(7,  sieteDeCorazon.getValor());
		assertEquals(8,  ochoDeCorazon.getValor());
		assertEquals(9,  nueveDeCorazon.getValor());
		assertEquals(10, diezDeCorazon.getValor());
		assertEquals(11, jackDeCorazon.getValor());
		assertEquals(12, queenDeCorazon.getValor());
		assertEquals(13, kingDeCorazon.getValor());

		assertEquals(1,  unoDePica.getValor());
		assertEquals(2,  dosDePica.getValor());
		assertEquals(3,  tresDePica.getValor());
		assertEquals(4,  cuatroDePica.getValor());
		assertEquals(5,  cincoDePica.getValor());
		assertEquals(6,  seisDePica.getValor());
		assertEquals(7,  sieteDePica.getValor());
		assertEquals(8,  ochoDePica.getValor());
		assertEquals(9,  nueveDePica.getValor());
		assertEquals(10, diezDePica.getValor());
		assertEquals(11, jackDePica.getValor());
		assertEquals(12, queenDePica.getValor());
		assertEquals(13, kingDePica.getValor());
		
		assertEquals(1,  unoDeDiamante.getValor());
		assertEquals(2,  dosDeDiamante.getValor());
		assertEquals(3,  tresDeDiamante.getValor());
		assertEquals(4,  cuatroDeDiamante.getValor());
		assertEquals(5,  cincoDeDiamante.getValor());
		assertEquals(6,  seisDeDiamante.getValor());
		assertEquals(7,  sieteDeDiamante.getValor());
		assertEquals(8,  ochoDeDiamante.getValor());
		assertEquals(9,  nueveDeDiamante.getValor());
		assertEquals(10, diezDeDiamante.getValor());
		assertEquals(11, jackDeDiamante.getValor());
		assertEquals(12, queenDeDiamante.getValor());
		assertEquals(13, kingDeDiamante.getValor());
		
		assertEquals(1,  unoDeTrebol.getValor());
		assertEquals(2,  dosDeTrebol.getValor());
		assertEquals(3,  tresDeTrebol.getValor());
		assertEquals(4,  cuatroDeTrebol.getValor());
		assertEquals(5,  cincoDeTrebol.getValor());
		assertEquals(6,  seisDeTrebol.getValor());
		assertEquals(7,  sieteDeTrebol.getValor());
		assertEquals(8,  ochoDeTrebol.getValor());
		assertEquals(9,  nueveDeTrebol.getValor());
		assertEquals(10, diezDeTrebol.getValor());
		assertEquals(11, jackDeTrebol.getValor());
		assertEquals(12, queenDeTrebol.getValor());
		assertEquals(13, kingDeTrebol.getValor());
	}
	
	
	@Test
	public void deberiaDetectarTrio() {
		assertEquals("Trio", mano.verificar(sieteDePica,nueveDeCorazon,nueveDeDiamante,nueveDeTrebol,queenDeTrebol));
		assertEquals("Trio", mano.verificar(unoDePica,queenDeCorazon,queenDeDiamante,nueveDeTrebol,queenDeTrebol));
		assertEquals("Trio", mano.verificar(diezDeCorazon,diezDeTrebol,nueveDeDiamante,nueveDeTrebol,diezDePica));
		assertEquals("Trio", mano.verificar(sieteDePica,seisDeCorazon,seisDeDiamante,nueveDeTrebol,seisDeTrebol));
	}
	
	@Test
	public void DeberiaDetectcarPoker() {
		assertEquals("Poker", mano.verificar(cuatroDePica,cuatroDeCorazon,cuatroDeDiamante,cuatroDeTrebol,cincoDeTrebol));
		assertEquals("Poker", mano.verificar(cuatroDePica,seisDeCorazon,seisDeDiamante,seisDeTrebol,seisDePica));		
		assertEquals("Poker", mano.verificar(diezDePica,diezDeCorazon,diezDeDiamante,cuatroDeTrebol,diezDeTrebol));
		assertEquals("Poker", mano.verificar(cincoDeTrebol,queenDePica, queenDeCorazon, queenDeDiamante, queenDeTrebol));
		assertEquals("Poker", mano.verificar(cincoDeTrebol,jackDePica,jackDeCorazon,jackDeDiamante,jackDeTrebol)); 
																	  
	}
	
		
	@Test
	public void deberiaDetectarColor() {
		assertEquals("Color", mano.verificar(unoDePica,tresDePica,queenDePica,kingDePica,jackDePica));
		assertEquals("Color", mano.verificar(unoDeCorazon,tresDeCorazon,queenDeCorazon,kingDeCorazon,jackDeCorazon));
		assertEquals("Color", mano.verificar(unoDeTrebol,tresDeTrebol,queenDeTrebol,kingDeTrebol,jackDeTrebol));
	}

	
}
