package br.edu.unidesc.test;

import br.edu.unidesc.controller.AlunoController;
import br.edu.unidesc.entidades.Aluno;

public class test {

	public static void main(String[] args) {
		
		Aluno  aluno = new Aluno();
		aluno.setCurso("SISTEMAS DE INFO");
		aluno.setNome("Joao");
		aluno.setCpf("98897396070");
		
		AlunoController controller = new AlunoController();
		aluno = controller.criarAluno(aluno);
		
		System.out.println("a matricula gerada é" + aluno.getMatricula());
		
		
	}
	
}
