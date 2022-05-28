package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
	Pessoa convidada = new Pessoa(99.5);
	
	System.out.println(convidada.getPeso());
	
	Comida arroz = new Arroz(0.200);
	Comida feijao = new Feijao(0.180);
	Comida sorvete = new Sorvete(0.400);
	
	convidada.Comer(arroz);
	convidada.Comer(feijao);
	convidada.Comer(sorvete);
	System.out.println(convidada.getPeso());
	
	}
}
