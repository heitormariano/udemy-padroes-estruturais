package br.com.udemy.proxy.examples.servico;

public class Cliente {

	public static void main(String[] args) {
		Servico servico = new ServicoImpl();
		Servico proxy = new ProxyServico(servico);
		proxy.executar();
	}
}
