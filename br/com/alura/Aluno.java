package br.com.alura;

public class Aluno {

	private String nome;
	private int matricula;
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	@Override
	public String toString() {
		return "[Nome: " + this.nome + ", matrícula: " + this.matricula + "]";
	}
}
