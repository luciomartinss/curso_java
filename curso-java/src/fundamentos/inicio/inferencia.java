package fundamentos.inicio;

public class inferencia {
	public static void main(String[] args) {
		
		double a = 4.5; // variavel declarada e inicializada
		System.out.println(a);
		
		a = 12; /**  podemos atribuir um numero inteiro mesmo 
		             a variavel sendo com casas decimais,
		             porem o contrario não pode ser feito
		             **/
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
				System.out.println(c);
		
		// c = 4.5; - não podemos alterar o tipo da variavel
		
		double d; // varialvel foi declarada
		d = 123.65; // variavel foi inicializada
		System.out.println(d); // variavel foi usada
		
		// var e; variaveis "VAR" não podem ser declaradas e inicializadas separadamente
		// e = 123.45;
		//System.out.println(e);
	}
}

