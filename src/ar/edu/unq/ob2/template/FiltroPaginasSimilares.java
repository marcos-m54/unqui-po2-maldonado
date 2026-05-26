package ar.edu.unq.ob2.template;

import java.util.List;

public abstract class FiltroPaginasSimilares {

	
	public List<WikipediaPage> getSimilarPages(WikipediaPage pagina, List<WikipediaPage> paginas){
		return paginas.stream()
					  .filter(pagina1 -> this.sonSimilares(pagina1, pagina))
					  .toList();
	}
	
	public abstract Boolean sonSimilares(WikipediaPage pagina1, WikipediaPage pagina2);
	
	
}
