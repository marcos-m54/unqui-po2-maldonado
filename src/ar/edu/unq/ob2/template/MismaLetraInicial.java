package ar.edu.unq.ob2.template;

public class MismaLetraInicial extends FiltroPaginasSimilares {

	@Override
	public Boolean sonSimilares(WikipediaPage pagina1, WikipediaPage pagina2) {
		return pagina1.getTitle().charAt(0) == pagina2.getTitle().charAt(0);
	}

}
