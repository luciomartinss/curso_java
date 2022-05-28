package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe uma nota v�lida (ou -1 para sair): ");
			nota = entrada.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				quantidadeDeNotas++;
				total += nota;
			} else if (nota != -1) {
				System.out.println("Nota inv�lida!");
			}
		}
		
			
		double media = total / quantidadeDeNotas;
		
		System.out.println("M�dia == " + media);
		
		entrada.close();
	}
}
