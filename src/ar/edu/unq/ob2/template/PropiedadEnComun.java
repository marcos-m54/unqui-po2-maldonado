package ar.edu.unq.ob2.template;

public class PropiedadEnComun extends FiltroPaginasSimilares {

	@Override
	public Boolean sonSimilares(WikipediaPage pagina1, WikipediaPage pagina2) {
		return pagina1.getInfobox().keySet().stream().anyMatch(key -> pagina2.getInfobox().keySet().contains(key));
	}

}
