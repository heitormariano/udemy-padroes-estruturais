package br.com.udemy.decorator.examples.cursos.client;

import br.com.udemy.decorator.examples.cursos.decorator.CursoComDesconto;
import br.com.udemy.decorator.examples.cursos.decorator.CursoComDescricaoEstendida;
import br.com.udemy.decorator.examples.cursos.model.Curso;
import br.com.udemy.decorator.examples.cursos.model.Java;
import br.com.udemy.decorator.examples.cursos.model.Python;

public class Estudante {

	public static void main(String[] args) {
		Curso java = new Java();
		System.out.println(java.getDescricao() + " - R$: " + java.getPreco());
		imprimirDadosCurso(java);

		Curso python = new Python();
		imprimirDadosCurso(python);

		CursoComDesconto javaComDesconto = new CursoComDesconto(java, 0.3);
		imprimirDadosCurso(javaComDesconto);

		CursoComDescricaoEstendida pythonComDescricaoEstendida = new CursoComDescricaoEstendida(python,
				"com Certificação");
		imprimirDadosCurso(pythonComDescricaoEstendida);
	}

	public static void imprimirDadosCurso(Curso curso) {
		System.out.println(curso.getDescricao() + " - R$: " + curso.getPreco());
	}
}
