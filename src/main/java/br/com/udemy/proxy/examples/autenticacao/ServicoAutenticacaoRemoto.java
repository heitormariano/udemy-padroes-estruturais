package br.com.udemy.proxy.examples.autenticacao;

public class ServicoAutenticacaoRemoto implements ServicoAutenticacao {
	private String enderecoIP;

	public ServicoAutenticacaoRemoto(String enderecoIP) {
		this.enderecoIP = enderecoIP;
		System.out.println("Conectado ao serviço de autenticação remoto no endereço " + enderecoIP);
	}

	@Override
	public void autenticar(String usuario, String senha) {
		// Simula o acesso remoto ao serviço de autenticação
		System.out.println(
				"Autenticando usuário " + usuario + " com senha " + senha + " no serviço de autenticação remoto...");
		System.out.println("Usuário autenticado com sucesso!");

	}

}
