package ar.edu.unq.ob2.template;

public class LinkEnComun extends FiltroPaginasSimilares {

	@Override
	public Boolean sonSimilares(WikipediaPage pagina1, WikipediaPage pagina2) {
		return pagina1.getLinks().stream().anyMatch(pagina -> pagina2.getLinks().contains(pagina));
	}

}
