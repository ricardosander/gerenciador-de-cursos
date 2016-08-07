package br.com.alura;

public class TestaCurso3 {

	public static void main(String[] args) {
		
		Curso curso = new Curso("Java Collections", "Ricardo");
		
		curso.adiciona(new Aula("Iniciando com Collection", 20));
		curso.adiciona(new Aula("Usando ArrayList", 22));
		curso.adiciona(new Aula("Usando Sets", 18));
		
		Aluno a1 = new Aluno("Caio", 1);
		Aluno a2 = new Aluno("Igor", 2);
		Aluno a3 = new Aluno("Matheus", 3);
		
		curso.matricula(a1);
		curso.matricula(a2);
		curso.matricula(a3);
		
		curso.getAlunos().forEach(System.out::println);
	}
}