package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.PublicadorDeEvento;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoMatriculado;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
	
	private final RepositorioDeAlunos repositorio;
	private final PublicadorDeEvento publicador;

	public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEvento publicador) {
		this.repositorio = repositorio;
		this.publicador = publicador;
	}
	
	// COMMAND
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
		
		AlunoMatriculado evento = new AlunoMatriculado(new CPF(novo.getCpf()));
		this.publicador.publicar(evento);
	}

}
