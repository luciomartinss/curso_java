package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Principe");
		livros.push("Dom Quixote");
		livros.push("O Hobbit");
		
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		//podemos percorrer a pilha e a fila utilizando ForEach
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.pop());
		System.out.println(livros.remove());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		
		// Os metodos utilizados na fila também funcionam na Pilha
		// Diferença é que na Pilha sempre retornara o ultimo item a entrar na lista
	}
}
