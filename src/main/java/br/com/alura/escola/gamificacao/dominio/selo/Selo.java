package br.com.alura.escola.gamificacao.dominio.selo;

import br.com.alura.escola.shared.dominio.CPF;

public class Selo {
	private CPF cpfDoALuno;
	private String Nome;
	
	public Selo(CPF cpfDoALuno, String nome) {
		this.cpfDoALuno = cpfDoALuno;
		Nome = nome;
	}
	
	public CPF getCpfDoALuno() {
		return cpfDoALuno;
	}
	
	public String getNome() {
		return Nome;
	}
}
