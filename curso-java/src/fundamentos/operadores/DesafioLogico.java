package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogico {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("O trabalho de ter�a-feira deu certo? (true/false)");
		Boolean trabalhoTer�a =  entrada.nextBoolean();
		
		System.out.println("O trabalho de quinta-feira deu certo? (true/false)");
		Boolean trabalhoQuinta = entrada.nextBoolean();
		
		
			boolean comprouTV50 = trabalhoTer�a&&trabalhoQuinta;
			boolean comprouTV32 = trabalhoTer�a ^ trabalhoQuinta;
			boolean tomouSorvete = trabalhoTer�a || trabalhoQuinta;
			
		System.out.println("Comprou TV de 50\"? " + comprouTV50);
		System.out.println("Comprou TV de 32\"? " + comprouTV32);
		System.out.println("Tomou Sorvete? " + tomouSorvete);	
		System.out.println("Mais saudavel?" + !tomouSorvete);
	
	
	entrada.close();
	}
}