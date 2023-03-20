package br.com.udemy.proxy.examples.autenticacao;

public class ProxyServicoAutenticacao implements ServicoAutenticacao {
	private String enderecoIP;
	private ServicoAutenticacao servicoAutenticacaoRemoto;

	public ProxyServicoAutenticacao(String enderecoIP) {
		this.enderecoIP = enderecoIP;
	}

	@Override
	public void autenticar(String usuario, String senha) {
		if (servicoAutenticacaoRemoto == null) {
			servicoAutenticacaoRemoto = new ServicoAutenticacaoRemoto(enderecoIP);
		}

		// Passa a chamada de autenticação para o objeto real
		servicoAutenticacaoRemoto.autenticar(usuario, senha);

	}

}
