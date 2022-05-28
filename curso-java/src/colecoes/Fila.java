package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferen�a � o comportamento quando a fila est� cheia
		// Add vai retornar um erro
		// Offer vai retornar "false"
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element, ambos retornam o proximo da fila(sem remover)
		// diferen�a � quando a fila est� vazia:
		// Peek retorna null e element um erro.
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		// fila.size(); -> tamanho da fila
		//fila.clear(); -> limpa a fila
		//fila.isEmpty(); -> pra saber se a fila est� ou n�o vazia
		//fila.contains(...)
		
		//Poll e Remove -> removem o proximo elementos da fila
		System.out.println(fila.poll()); // retorna o primeiro elemento da fila (ja removendo)
		System.out.println(fila.remove()); // 
	}
	
}
