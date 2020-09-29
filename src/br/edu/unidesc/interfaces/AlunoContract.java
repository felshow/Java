package br.edu.unidesc.interfaces;

import br.edu.unidesc.entidades.Aluno;

public interface AlunoContract {

	Aluno criarAluno(Aluno aluno); //Aluno criarAluno (Aluno aluno);
	Aluno recuperarAluno (String cpf); //Read
	void atualizarAluno (Aluno aluno); //Update
	void deletarAluno (String cpf); //Delete
}
