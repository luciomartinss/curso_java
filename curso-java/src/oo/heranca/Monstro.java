package oo.heranca;

public class Monstro extends Jogador {

	// implementando a posi��o 0 e 0 fixamente
	// de forma que todo monstro criado come�a na posi��o 0x0
	public Monstro(){
		this(0,0); // o this est� puxando o contrutor de baixo e o de baixando usando o super puxa da Super Classe
	}
	public Monstro(int x, int y){
		super(x, y);
	}
}
