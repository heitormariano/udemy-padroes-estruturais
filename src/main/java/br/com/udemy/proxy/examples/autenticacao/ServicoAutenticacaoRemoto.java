package br.com.udemy.proxy.examples.autenticacao;

public class ServicoAutenticacaoRemoto implements ServicoAutenticacao {
	private String enderecoIP;

	public ServicoAutenticacaoRemoto(String enderecoIP) {
		this.enderecoIP = enderecoIP;
		System.out.println("Conectado ao servi�o de autentica��o remoto no endere�o " + enderecoIP);
	}

	@Override
	public void autenticar(String usuario, String senha) {
		// Simula o acesso remoto ao servi�o de autentica��o
		System.out.println(
				"Autenticando usu�rio " + usuario + " com senha " + senha + " no servi�o de autentica��o remoto...");
		System.out.println("Usu�rio autenticado com sucesso!");

	}

}
