package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		// Set n�o aceita tipo primitivo, 
		//por esse motivo ele converte automaticamente para objeto
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean	
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("O tamanho �: " + conjunto.size()); // size() � o tamanho do conjunto
		
		conjunto.add("Teste"); // O Set n�o aceita repeti��o
		conjunto.add('x');	//ignorando qualquer tentativa de repetir dados.
		
		System.out.println("O tamanho �: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));

		System.out.println("O tamanho �: " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); // uni�o entre dois conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
		
		
	}

}
