package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;


public class CarroTeste {

	public static void main(String[] args) {
		
		Carro civic = new Civic();
		Ferrari ferrari = new Ferrari();
		
		civic.toString();
		ferrari.toString();
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		civic.toString();
		ferrari.toString();
		
		
		civic.freiar();
		ferrari.freiar();
		civic.freiar();
		ferrari.freiar();
		civic.freiar();
		ferrari.freiar();
		
		civic.toString();
		ferrari.toString();
		
	}

}
