package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private String sobreNome;
	private int idade;
	
	public Pessoa(String nome, String sobreNome, int idade){
		setNome(nome);
		setSobreNome(sobreNome);		
		setIdade(idade);
		
		}

	//Setter = Alterar ou Setar
	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if(idade >= 0 && idade <=120) {
			this.idade = idade;
		}
	}
	//Getter = Ler
	public int getIdade() {
		return idade;
	}


	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}
	
	public String nomeCompleto() {
		return getNome() + " " + getSobreNome(); 
	}
	public String toString(){
		return "Olá, meu nome é " + nomeCompleto()
		+ " e tenho " + getIdade() + " anos.";
		
	}
}