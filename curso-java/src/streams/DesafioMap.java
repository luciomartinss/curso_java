package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		Consumer<Object> print = x-> System.out.print(x + " ");
		
		List<Integer> nums = Arrays.asList(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 );
		
		/*
		 * 1. Número para string binária... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 * 
		 */
		Function<Integer, String> intParaBin = i -> Integer.toBinaryString(i);
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> binarioParaInt = b -> Integer.parseInt(b, 2);
		System.out.println(Integer.parseInt("011", 2));//3
	
	System.out.println("Lista de numeros");
	nums.stream().forEach(print);	
	
	System.out.println("\n\nTransformando Integer para Binario");	
	nums.stream().map(intParaBin).forEach(print);
	
	System.out.println("\n\nInvertendo a sequencia");	
	nums.stream().map(intParaBin).map(inverter).forEach(print);
	
	System.out.println("\n\nTransformando Binario em Integer");	
	nums.stream().map(intParaBin).map(inverter).map(binarioParaInt).forEach(print);
	
	System.out.println("\n\nForma otimizada...");
	nums.stream()
		.map(Integer::toBinaryString) // ao receber e devolver o mesmo tipo podemos passar direto o metodo com referencia "Integer::"
		.map(inverter)
		.map(binarioParaInt)
		.forEach(print);

		
	
	
	}
	
	
}
