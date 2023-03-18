package br.com.udemy.decorator.examples.cursos.decorator;

import br.com.udemy.decorator.examples.cursos.model.Curso;

public class CursoComDesconto implements Curso {

	private final Curso curso;
	private final double desconto;

	public CursoComDesconto(Curso curso, double desconto) {
		this.curso = curso;
		this.desconto = desconto;
	}

	@Override
	public String getDescricao() {
		String strDescricao = curso.getDescricao();
		strDescricao += " com " + (int) (desconto * 100) + "% de desconto";

		return strDescricao;
	}

	@Override
	public double getPreco() {
		return curso.getPreco() * (1 - desconto);
	}

}
