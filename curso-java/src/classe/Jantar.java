package classe;

public class Jantar {
	
	public static void main(String[] args) {
		Comida c1 = new Comida("Feijão", 0.223);
		
		Comida c2 = new Comida("Arroz", 0.300);
		
		Pessoa p = new Pessoa("Fulano", 81.200);
		
		System.out.printf("Meu nome é %s e eu tenho %s kg.\n", p.nome, p.peso);
		
		p.comer(c1);
		
		System.out.printf("Depois de comer o %s, fique com %s kg.\n", c1.nome, p.peso);
		
		p.comer(c2);
		
		System.out.printf("E depois de comer o %s tambem, fique com %s kg.\n", c2.nome, p.peso);
		
		System.out.printf("Agora eu estou %s kg mais pesado.", (c1.peso + c2.peso));
		
		
		
		
	}
}
