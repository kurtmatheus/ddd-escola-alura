package br.com.alura.escola.gamificacao.aplicacao;

import br.com.alura.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.evento.Evento;
import br.com.alura.escola.shared.evento.Ouvinte;
import br.com.alura.escola.shared.evento.TipoDeEvento;

public class GeraSeloParaAlunoNovato extends Ouvinte {
	
	private final RepositorioDeSelos repositorioDeSelos;

	public GeraSeloParaAlunoNovato(RepositorioDeSelos repositorioDeSelos) {
		this.repositorioDeSelos = repositorioDeSelos;
	}

	@Override
	protected void reageAo(Evento evento) {
		CPF cpfDoAluno = (CPF) evento.informaçoes().get("cpf");
		Selo novato = new Selo(cpfDoAluno, "Novato");
		repositorioDeSelos.adicionar(novato);
		
	}

	@Override
	protected boolean deveProcessar(Evento evento) {
		return evento.tipo().equals(TipoDeEvento.ALUNO_MATRICULADO);
	}

}
