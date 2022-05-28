package controle;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String valor = "";
		
		
		while (!valor.equalsIgnoreCase("sair")) {
			System.out.printf("Digite Algo: ");
			valor = entrada.nextLine();
		}
		
		System.out.println("Saiu");

		entrada.close();
	}
}
