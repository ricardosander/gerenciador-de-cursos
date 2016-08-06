package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class TestaPerformance {

	public static void main(String[] args) {

		Collection<Integer> numeros;
		
		numeros = new ArrayList<Integer>();
		System.out.println("\n\nTestando ArrayList:");
		TestaPerformance.testaPerformance(numeros);
		
		numeros = new HashSet<Integer>();
		System.out.println("\n\nTestando HashSet:");
		TestaPerformance.testaPerformance(numeros);
	}
	
	public static void testaPerformance(Collection<Integer> numeros) {
		
		long inicio, fim, tempoInsercao, tempoBusca;
		
		inicio = System.currentTimeMillis();
		for (int i = 1; i <= 100000; i++) {
			numeros.add(i);
		}
		fim = System.currentTimeMillis();
		
		tempoInsercao = fim = inicio;
		
		inicio = System.currentTimeMillis();
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		fim = System.currentTimeMillis();

		tempoBusca = fim - inicio;

		System.out.println("Tempo gasto na inserção: " + tempoInsercao);
		System.out.println("Tempo gasto na busca: " + tempoBusca);
		System.out.println("Tempo gasto total: " + (tempoInsercao + tempoBusca));
	}
}
