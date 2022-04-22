package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	final List<Curso> curso = new ArrayList<Curso>();

	Aluno(String nome) {
		this.nome = nome;
	}

	void adicionarCurso(Curso curso) {
		this.curso.add(curso);
		curso.alunos.add(this);
	}

	Curso obterCursoPorNome(String nome) {
		for (Curso curso : this.curso) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}

	public String toString() {
		return nome;
	}
}
