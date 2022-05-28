package oo.composição.desafio;

import java.util.ArrayList;

public class Compra {

	ArrayList<Item> itens = new ArrayList<>();
	
	void adicionarItens(String nome, double preco, int qtde) {
		Produto produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}
	
	/* utilizando esse metodo estamos chamando o contrutor da classe Produto
	dessa forma teremos que criar um "new Produto" no momento em que chamar o metodo abaixo */
	void adicionarItens(Produto produto, int qtde) {
		this.itens.add(new Item(produto, qtde));
	}
	
	double obterValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
