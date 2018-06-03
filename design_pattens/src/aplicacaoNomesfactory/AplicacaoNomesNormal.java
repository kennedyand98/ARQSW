package nomesfactory;


public class AplicacaoNomesNormal extends AplicacaoNomes {

	public Nome construirNome(String nome) {
		String sobrenome = "";

		int pos = nome.indexOf(" ");
		if (pos != -1) {
			sobrenome = nome.substring(pos + 1, nome.length()).trim();
			nome = nome.substring(0, pos).trim();
		}

		return new Nome(nome, sobrenome);
	}
}
