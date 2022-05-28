package controle;

import java.util.Scanner;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("informe a sua faixa: ");
		String faixa = entrada.nextLine();
		
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei coisa da faixa roxa");
		case "verde":
			System.out.println("sei coisa da faixa verde");
		case "laranja":
			System.out.println("sei coisa da faixa laranja");
		case "vermelha":
			System.out.println("sei coisa da faixa vermelha");
		case "amarela":
			System.out.println("Sei coisa da faixa amarela");
		case "branca":
			System.out.println("Sei o basico");
		}

		System.out.println("Fim!");
		entrada.close();
		
	}
}
