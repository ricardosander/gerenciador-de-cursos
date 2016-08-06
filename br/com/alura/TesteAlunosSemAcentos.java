package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosSemAcentos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();

        alunos.add("Ricardo");
        alunos.add("Igor");
        alunos.add("Caio");
        
        System.out.println(alunos.size());

        alunos.add("Igor");
        
        System.out.println(alunos.size());
	}
}
