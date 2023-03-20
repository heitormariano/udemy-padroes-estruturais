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
			throw new RuntimeException("Permissão Negada!");
		}

	}

	private boolean verificarPermissoes() {
		// Lógica de verificação de permissões
		return true;
	}

}
