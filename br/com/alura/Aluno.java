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
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Aluno outroAluno = (Aluno) obj;
		return this.nome.equals(outroAluno.getNome());
	}
	
	@Override
	public String toString() {
		return "[Nome: " + this.nome + ", matrícula: " + this.matricula + "]";
	}
}
