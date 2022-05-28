package oo.composição.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Fulano");
		
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		compra1.adicionarItens("Caneta", 1, 100);
		compra1.adicionarItens(new Produto("Notebook", 2000), 1);
		
		compra2.adicionarItens("Caderno", 10, 10);
		compra2.adicionarItens(new Produto("Impressora", 2000), 1);
		
		cliente.adicionarCompra(compra1);
		cliente.listaCompra.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
		
	}
}
