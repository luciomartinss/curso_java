package br.com.financas_pessoais.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idusuario;
	
	@Column(nullable = false)
	String nome;
	
	@Column(nullable = false, unique = true)
	String email;
	
	@Column(nullable = false, unique = true)
	String telefone;
	
	@Column(nullable = false)
	String cidade;
	
	@Column(nullable = false)
	String uf;
	
	@Column(nullable = false)
	String genero;
	
	public Usuario() {
		
	}

	public Usuario(Long idusuario, String nome, String email, String telefone, String cidade, String uf,
			String genero) {
		
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cidade = cidade;
		this.uf = uf;
		this.genero = genero;
	}

	public Long getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	

}
