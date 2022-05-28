package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia
		// Add vai retornar um erro
		// Offer vai retornar "false"
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element, ambos retornam o proximo da fila(sem remover)
		// diferença é quando a fila está vazia:
		// Peek retorna null e element um erro.
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		// fila.size(); -> tamanho da fila
		//fila.clear(); -> limpa a fila
		//fila.isEmpty(); -> pra saber se a fila está ou não vazia
		//fila.contains(...)
		
		//Poll e Remove -> removem o proximo elementos da fila
		System.out.println(fila.poll()); // retorna o primeiro elemento da fila (ja removendo)
		System.out.println(fila.remove()); // 
	}
	
}
