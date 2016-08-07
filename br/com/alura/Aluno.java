package br.com.alura;

public class Aluno {

	private String nome;
	private int matricula;
	
	public Aluno(String nome, int matricula) {
		
		if (nome == null) {
			throw new NullPointerException("Nome do aluno não pode ser nulo.");
		}
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
		final int prime = 31;
		int result = 1;
		result = prime * result + matricula;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (matricula != other.matricula)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[Nome: " + this.nome + ", matrícula: " + this.matricula + "]";
	}
}
