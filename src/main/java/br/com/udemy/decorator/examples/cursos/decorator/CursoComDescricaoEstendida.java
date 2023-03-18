package br.com.udemy.decorator.examples.cursos.decorator;

import br.com.udemy.decorator.examples.cursos.model.Curso;

public class CursoComDescricaoEstendida implements Curso {
	private final Curso curso;
	private final String descricaoAdicional;

	public CursoComDescricaoEstendida(Curso curso, String descricaoAdicional) {
		this.curso = curso;
		this.descricaoAdicional = descricaoAdicional;
	}

	@Override
	public String getDescricao() {
		return curso.getDescricao() + " - " + descricaoAdicional;
	}

	@Override
	public double getPreco() {
		return curso.getPreco();
	}

}
