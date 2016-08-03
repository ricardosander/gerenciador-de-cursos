import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso curso = new Curso("Curso de Java", "Ricardo");

		List<Aula> aulas = curso.getAulas();
		System.out.println(aulas);

		curso.adiciona(new Aula("Aula 1", 10));
		curso.adiciona(new Aula("Aula 2", 20));
		curso.adiciona(new Aula("Aula 3", 30));

		System.out.println(aulas);
	}
}
