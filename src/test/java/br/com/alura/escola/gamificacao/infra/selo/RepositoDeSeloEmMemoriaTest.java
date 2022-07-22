package br.com.alura.escola.gamificacao.infra.selo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;
import br.com.alura.escola.shared.dominio.CPF;

class RepositoDeSeloEmMemoriaTest {
	private CPF cpfAluno;;
	private Selo selo;
	private RepositorioDeSelos repositorio;
	
	@BeforeEach
	public void beforeEach() {
		this.cpfAluno = new CPF("123.456.789-00");
		this.selo = new Selo(this.cpfAluno, "Selo de Parabéns");
		this.repositorio = new RepositoDeSeloEmMemoria();
		repositorio.adicionar(this.selo);
	}
	
	@Test
	void deveriaListarSeloPorCPF() {
		assertEquals(1, repositorio.listarSelosDoAlunoPorCPF(this.cpfAluno).size());
	}

}
