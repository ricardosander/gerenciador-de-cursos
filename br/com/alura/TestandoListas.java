package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {

	public static void main(String[] args) {

		String curso1 = "Java 8";
		String curso2 = "Servelets: Fundamentos de Java na Web";
		String curso3 = "Design Patters";

		List<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);

		System.out.println(cursos);
		
		System.out.println("Ordenando lista:");
		Collections.sort(cursos);
		System.out.println(cursos);

		System.out.println("Removendo segundo elemento: ");
		cursos.remove(1);
		System.out.println(cursos);

		System.out.println("Primeiro elemento da lista é: " + cursos.get(0));
	}
}
