package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogico {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("O trabalho de terça-feira deu certo? (true/false)");
		Boolean trabalhoTerça =  entrada.nextBoolean();
		
		System.out.println("O trabalho de quinta-feira deu certo? (true/false)");
		Boolean trabalhoQuinta = entrada.nextBoolean();
		
		
			boolean comprouTV50 = trabalhoTerça&&trabalhoQuinta;
			boolean comprouTV32 = trabalhoTerça ^ trabalhoQuinta;
			boolean tomouSorvete = trabalhoTerça || trabalhoQuinta;
			
		System.out.println("Comprou TV de 50\"? " + comprouTV50);
		System.out.println("Comprou TV de 32\"? " + comprouTV32);
		System.out.println("Tomou Sorvete? " + tomouSorvete);	
		System.out.println("Mais saudavel?" + !tomouSorvete);
	
	
	entrada.close();
	}
}