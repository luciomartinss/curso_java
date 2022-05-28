package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
				
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.29;		
				
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.println(p1.nome + " = " + precoFinal1);
		System.out.println(p2.nome + " = " + precoFinal2);
		System.out.printf("M�dia do carrinho = R$ %.2f.", mediaCarrinho);
	}
}
