package com.example.exerciciossb.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nome;
	
	@Column(nullable = false)
	private Double preco;
	
	private Double precoComDesconto;
	
	private Double desconto;

	public Produto() {

	}

	
	public Produto(String nome, Double preco, Double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	public Double getPrecoComDesconto() {
		return precoComDesconto;
	}


	public void setPrecoComDesconto(Double precoComDesconto) {
		this.precoComDesconto = precoComDesconto;
	}


	public Double precoFinal(Double preco, Double desonto) {
		setPrecoComDesconto(preco = preco - (preco*desconto));
		return getPrecoComDesconto();
	}
	
	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public Double getDesconto() {
		return desconto;
	}


	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
