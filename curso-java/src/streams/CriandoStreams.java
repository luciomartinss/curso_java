package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<Object> print = System.out::print; //desta forma não precisamos mais passar toda vez o System.out.print
		// passando object como parametro, é uma forma generica, que me permite receber qualquer tipo ex(String, Integer, Double..."Produto")

		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n"); // criando a Stream passando os elementos diretos (poderia ser um objeto tbm)
		langs.forEach(print);

		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" }; // criando um array

		Stream.of(maisLangs).forEach(print); // criando a stream utilizando o Array
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 4).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print); // criando o stream utilizando a lista
		outrasLangs.parallelStream().forEach(print); // processa de forma paralela 
		
//		Stream.generate(() -> "a").forEach(print); - Gerando de forma infinita a letra "a"
//		Stream.iterate(0, n -> n + 1).forEach(print); - soma mais um de forma infinita
//		|-> recebe primeiro o valor da variavel "0", depois a lambda com a variavel e a função
		
	}
}
