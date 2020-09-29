package br.edu.unidesc.entidades;

import java.util.Random;

public class Aluno {
	// - criar entidade (classe) Aluno que tenha os seguintes campos: CPF,NOME,MATRICULA e CURSO
	
	private String cpf;
	private String nome;
	private String matricula;
	private String curso;
	
	public String getCpf() {
		return cpf;
	}
	
	public String setCpf (String cpf) {
		return this.cpf = cpf;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public String setCurso(String curso) {
		return this.curso;
	}
	
	public String getMatricula () {
		return matricula;
	}
	
	public void setMatricula (String matricula) {
		Random random = new Random();
		Integer aleatorio = random.nextInt();
		this.matricula = aleatorio.toString();
	}
	
	public String getNome() {
		return nome;
	}
	
	public String setNome(String nome) {
		return this.nome;
	}
	
	
	
	
	
}
