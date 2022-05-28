package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
	
		Alimentos a1 = new Alimentos("Bata-Doce", 200, "Carboidrato", true);
		Alimentos a2 = new Alimentos("Frango", 150, "Proteina", true);
		Alimentos a3 = new Alimentos("Patinho", 120, "Proteina", false);
		Alimentos a4 = new Alimentos("Arroz", 100, "Carboidrato", false);
		
		List<Alimentos> pratoFeito = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Alimentos> carboidratos = c -> c.tipo.equalsIgnoreCase("Carboidrato");
		Predicate<Alimentos> proteinas = p -> p.tipo.equalsIgnoreCase("Proteina");
		Predicate<Alimentos> altoValorBiologico = AVB -> AVB.altoValorBiologico;
		Function<Alimentos, String> composicaoPrato = 
				pf -> "\nO seu prato contem " + pf.peso + "g de " + pf.nome + " que é um(a) " + pf.tipo + " de alto valor biologico";
				
		pratoFeito.stream()
				.filter(carboidratos)
				.filter(altoValorBiologico)
				.map(composicaoPrato)
				.forEach(System.out::print);
		
		pratoFeito.stream()
		.filter(proteinas)
		.filter(altoValorBiologico)
		.map(composicaoPrato)
		.forEach(System.out::print);
		
	}

}
