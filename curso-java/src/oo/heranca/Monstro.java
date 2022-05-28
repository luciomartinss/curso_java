package oo.heranca;

public class Monstro extends Jogador {

	// implementando a posição 0 e 0 fixamente
	// de forma que todo monstro criado começa na posição 0x0
	public Monstro(){
		this(0,0); // o this está puxando o contrutor de baixo e o de baixando usando o super puxa da Super Classe
	}
	public Monstro(int x, int y){
		super(x, y);
	}
}
