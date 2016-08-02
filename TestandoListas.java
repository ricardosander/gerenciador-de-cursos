import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		System.out.println("Ordenando lista:");
		Collections.sort(aulas);
		aulas.forEach(aula -> {
			System.out.println("Aula:");
			System.out.println(aula);
		});
		
		System.out.println("Removendo primeiro elemento:");
		aulas.remove(0);

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula " + i + ": " + aulas.get(i));
		}

	}
}
