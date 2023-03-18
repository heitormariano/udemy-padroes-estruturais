package br.com.udemy.decorator.examples.cursos.model;

public class Python implements Curso {

	private final String descricao = "Curso de Python";
	private final double preco = 950.00;

	@Override
	public String getDescricao() {
		return descricao;
	}

	@Override
	public double getPreco() {
		return preco;
	}
}
