package br.com.alura.escola.academico.dominio.aluno;

import java.time.LocalDateTime;
import java.util.Map;

import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.evento.Evento;
import br.com.alura.escola.shared.evento.TipoDeEvento;

public class AlunoMatriculado implements Evento {
	
	private final CPF cpfDoAluno;
	private final LocalDateTime momento;
	
	public AlunoMatriculado(CPF cpfDoAluno) {
		super();
		this.cpfDoAluno = cpfDoAluno;
		this.momento = LocalDateTime.now();
	}

	@Override
	public LocalDateTime momento() {
		return this.momento;
	}
	
	public CPF getCpfDoAluno() {
		return cpfDoAluno;
	}

	@Override
	public TipoDeEvento tipo() {
		return TipoDeEvento.ALUNO_MATRICULADO;
	}

	@Override
	public Map<String, Object> informaçoes() {
		return Map.of("cpf", cpfDoAluno);
	}
}
