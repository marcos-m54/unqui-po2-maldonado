package ar.edu.unq.ob2.template;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MismaLetraInicialTest {
	
	WikipediaPage pagina;
	WikipediaPage paginaWiki1;
	WikipediaPage paginaWiki2;
	WikipediaPage paginaWiki3;
	MismaLetraInicial filtroMismaLetra;
	List<WikipediaPage> listaWikis;

	@BeforeEach
	void setUp() throws Exception {
		
		//mock que son dummies 
		
		pagina = mock(WikipediaPage.class);
		paginaWiki1 = mock(WikipediaPage.class);
		paginaWiki2 = mock(WikipediaPage.class);
		paginaWiki3 = mock(WikipediaPage.class);

		listaWikis = List.of(paginaWiki1,paginaWiki2,paginaWiki3);
				
		filtroMismaLetra = new MismaLetraInicial();
		
	}

	@Test
	void paginasSimilaresCuandoHayCoincidencia() {
		
		//mocks
		when(pagina.getTitle()).thenReturn("Argentina");
		when(paginaWiki1.getTitle()).thenReturn("Amazonas");
		when(paginaWiki2.getTitle()).thenReturn("Brasil");
		when(paginaWiki3.getTitle()).thenReturn("Albania");		
		
		//Excercise
		assertEquals(filtroMismaLetra.getSimilarPages(pagina, listaWikis), List.of(paginaWiki1, paginaWiki3));
		assertEquals(filtroMismaLetra.getSimilarPages(pagina, listaWikis).size(), 2);
		
		
	}
	
	@Test
	void paginasSimilaresCuandoFalla() {
		
		when(pagina.getTitle()).thenReturn("Argentina");
		when(paginaWiki1.getTitle()).thenReturn("Chile");
		when(paginaWiki2.getTitle()).thenReturn("Brasil");
		when(paginaWiki3.getTitle()).thenReturn("Jujuy");		
		
		assertEquals(filtroMismaLetra.getSimilarPages(pagina, listaWikis), List.of(), "no hay paginas similares");
		assertEquals(filtroMismaLetra.getSimilarPages(pagina, listaWikis).size(), 0);

	}
}
