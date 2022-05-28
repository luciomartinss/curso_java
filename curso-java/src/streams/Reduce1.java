package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		//Por não passarmos um valor inicial somos obrigados a utilizar o "get()"
		//Entretanto podemos executar de forma paralela que o resultado será o mesmo
		Integer total1 = nums.parallelStream().reduce(soma).get();
		System.out.println(total1);
		
		//Por passarmos o valor inicial 100 não precisamos chamar o get
		//Porem não podemos utilizar o parallelstream pois ele adcionaria o valor inicial para cada elemento, distorcendo o valor correto
		Integer total2 = nums.stream().reduce(100, soma);
		System.out.println(total2);
		
		// Resultado foi um Opcional<Integer>...
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);// verifica se o valor esta presente retornam uma ação.
	}

}
