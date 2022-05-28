package oo.composição.desafio;

import java.util.ArrayList;

public class Cliente {
	String nome;
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	ArrayList<Compra> listaCompra = new ArrayList<>();

	void adicionarCompra(Compra compra) {
		this.listaCompra.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compra: listaCompra) {
			total += compra.obterValorTotal();
		}
		
		return total;
	}
}



// duas compras - com dois intens diferentes - 