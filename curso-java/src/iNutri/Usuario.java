package iNutri;

public class Usuario {

private	String nome;
private	int idade;
private	double peso;
private	int altura;
private	String sexo;
private	String email;
private	int nivelDeAtividade;
	
	Usuario(){
		
	}
	Usuario(String nome, int idade, double peso, int altura, 
			String sexo, String email, int nivelDeAtividade){
		setNome(nome);
		setIdade(idade);
		setPeso(peso);
		setAltura(altura);
		setSexo(sexo);
		setEmail(email);
		setNivelDeAtividade(nivelDeAtividade);
		
	}
	
	//Taxa Metabolica Basal
	public double TMB() {
		 double calc = 0;
				 if(getSexo().equalsIgnoreCase("M")) {
			 calc = this.peso*10 + (this.altura*6.25) - (this.idade*5) + 5;
		 }else if(getSexo().equalsIgnoreCase("F")) {
			 calc = this.peso*10 + (this.altura*6.25) - (this.idade*5) - 161;
		 } 
		 			
				 return calc ;
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

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getSexo() {
		
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNivelDeAtividade() {
		return nivelDeAtividade;
	}

	public void setNivelDeAtividade(int nivelDeAtividade) {
		this.nivelDeAtividade = nivelDeAtividade;
	}

	
	
}
