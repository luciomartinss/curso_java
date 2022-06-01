package com.example.cadastropessoas.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity(name = "Pessoas")

public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank 
	private String nome;
	
	@Min(1)
	private double peso;
	
	@Min(1)
	private int idade;
	
	@NotBlank
	private String email;
	
	@NotBlank
	private String sexo;
	
	public Pessoa() {
		
	}

	
	public Pessoa(@NotBlank String nome, @Min(1) int idade, @Min(1) double peso, @NotBlank String email,@NotBlank String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.email = email;
		this.sexo = sexo;
	}



	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		if(sexo.equalsIgnoreCase("masculino")| sexo.equalsIgnoreCase("feminino"))
		this.sexo = sexo;
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

	
	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
 