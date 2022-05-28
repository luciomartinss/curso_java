package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		// o metodo "Put" Adiciona e altera se for necessario
		
		usuarios.put(1, "Roberto"); // adicionou Roberto a chave 1
		usuarios.put(1, "Robbson"); // alterou para Robson a chave 1
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size()); // tamanho
		System.out.println(usuarios.isEmpty()); // se esta ou não vazia
		
		System.out.println(usuarios.keySet()); // retorna as chaves
		System.out.println(usuarios.values()); // retorna os valores
		System.out.println(usuarios.entrySet()); // retorna chave e valor juntos
		
		System.out.println(usuarios.containsKey(2)); // verifica se ontem a chave "x'
		System.out.println(usuarios.containsValue("Rebeca")); // verifica se contem o valor correspondente
		
		System.out.println(usuarios.get(4)); // acessando atraves da chave
		System.out.println(usuarios.remove(1)); // remove atraves da chave
		System.out.println(usuarios.remove(2, "Gui")); // neste ele só removera se os dados estiverem coretos (neste caso Falso)
		// formar de percorrer o Map
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + "--> ");
			System.out.println(registro.getValue());
			
		}
	}
}
