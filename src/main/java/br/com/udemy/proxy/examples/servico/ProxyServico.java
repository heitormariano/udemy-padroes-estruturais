package br.com.udemy.proxy.examples.servico;

public class ProxyServico implements Servico {
	private Servico servico;

	public ProxyServico(Servico servico) {
		this.servico = servico;
	}

	@Override
	public void executar() {
		if (verificarPermissoes()) {
			servico.executar();
		} else {
			throw new RuntimeException("Permiss�o Negada!");
		}

	}

	private boolean verificarPermissoes() {
		// L�gica de verifica��o de permiss�es
		return true;
	}

}
