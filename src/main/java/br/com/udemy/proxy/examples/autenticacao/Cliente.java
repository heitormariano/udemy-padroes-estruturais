package br.com.udemy.proxy.examples.autenticacao;

public class Cliente {

	public static void main(String[] args) {
		ServicoAutenticacao proxy = new ProxyServicoAutenticacao("192.168.1.12");
		proxy.autenticar("usuario123", "senha123");
	}
}
