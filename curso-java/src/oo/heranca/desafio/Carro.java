package oo.heranca.desafio;

public class Carro {

	/* velocidade atual
	 * Metodo acelerar (5 em 5)
	 * metodo freiar (5 em 5)
	 */
	final int VELOCIDADE_MAXIMA; // variaveis "final" em LETRAS MAIUSCULAS
	protected int vA;
	private int delta = 5;
	
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(vA + getDelta() > VELOCIDADE_MAXIMA) {
			vA = VELOCIDADE_MAXIMA;
		} else {
			vA += getDelta();
			
		}
		
	}
	
	public String toString() {
		return "A velocidade atual é " + vA + "km/H";
	}
	
	public void freiar() {
		if(vA >= 5) {
			vA -= 5;
		} else {
			vA = 0;
		}
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
