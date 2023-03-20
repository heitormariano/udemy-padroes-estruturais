package br.com.udemy.proxy.examples.servico;

public class ServicoImpl implements Servico {

	@Override
	public void executar() {
		System.out.println("Executando o serviço...");
	}

}
