package br.edu.unidesc.controller;

import br.edu.unidesc.entidades.Aluno;
import br.edu.unidesc.interfaces.AlunoContract;

import java.util.ArrayList;
import java.util.List;

public class AlunoController implements AlunoContract {

	// repositorio em memoria para alunos
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	@Override
	public Aluno criarAluno(Aluno aluno) {
		
		aluno.setMatricula(toString());
		
		//salvo no repositorio
		salvarEntidade(aluno);
		return aluno;
	}

	@Override
	public Aluno recuperarAluno(String cpf) {
		
		for (Aluno aluno : alunos) {
			if(cpf.equals(aluno.getCpf())) {
				return aluno;
			}
		}
		
		return null;
	}

	@Override
	public void atualizarAluno(Aluno aluno) {
		for (Aluno item : alunos) {
			if(aluno.getCpf().equals(item.getCpf())) {
				item.setNome(aluno.getNome());
				item.setCurso(aluno.getCurso());
			}
		}
	}

	@Override
	public void deletarAluno(String cpf) {
		
		Aluno alunoRecuperado = recuperarAluno(cpf);
		if(alunoRecuperado != null) {
			alunos.remove(alunoRecuperado);
		}
	}
	
	private void salvarEntidade(Aluno aluno) {
		alunos.add(aluno);
		
	}
	


}
