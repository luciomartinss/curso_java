package lambdas;

import java.util.function.Function;

public class Desafio {

	public static void main(String[] args) {


		
//		1. A partir do produto calular o preco real (com desconto)
//		2. Imposto Municipal: >= 2500 (8,5%) | <2500 (insento)
//		3. Frete: >= 3000 (100) | < 3000 (50)
//		4. Arrendondar: Deixar duas casas decimais
//		5. Formatar: R$ 1234,56
//		
		Function<Produto, Double> precoComDesconto = 
				(produto) -> produto.preco * (1-produto.desconto);
		//System.out.println(precoComDesconto.apply(p.preco, p.desconto));
				
		Function<Double, Double> icms = 
				preco -> preco >= 2500 ? 
						(preco += (preco * 0.085)): preco;
		//System.out.println(precoComDesconto.andThen(icms).apply(p.preco, p.desconto));
				
		Function<Double, Double> frete = 
				preco -> preco >= 3000?
						(preco + 100) : (preco + 50);
				
		Function<Double, String> formatar = preco -> ("O preço da mercadoria é R$" + (Math.round(preco*100.0)/100.0)).replace(".",",") ;
		
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		String preco =precoComDesconto
				.andThen(icms)
				.andThen(frete)
				.andThen(formatar)
				.apply(p);
				
				System.out.println(preco);
	}

}
