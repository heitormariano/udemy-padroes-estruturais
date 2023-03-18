package br.com.udemy.decorator.examples.cursos.model;

public class Java implements Curso {
	private final String descricao = "Curso de Java";
	private final double preco = 1_000.00;

	@Override
	public String getDescricao() {
		return descricao;
	}

	@Override
	public double getPreco() {
		return preco;
	}

}
