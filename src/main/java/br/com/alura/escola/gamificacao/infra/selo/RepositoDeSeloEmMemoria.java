package br.com.alura.escola.gamificacao.infra.selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;
import br.com.alura.escola.shared.dominio.CPF;

public class RepositoDeSeloEmMemoria implements RepositorioDeSelos {
	private List<Selo> listaSelo = new ArrayList<>();

	@Override
	public void adicionar(Selo selo) {
		this.listaSelo.add(selo);		
	}

	@Override
	public List<Selo> listarSelosDoAlunoPorCPF(CPF cpf) {
		return this.listaSelo.stream()
				.filter(s -> s.getCpfDoALuno().equals(cpf))
				.collect(Collectors.toList());
	}
}
