package fundamentos.inicio;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("bom");
		System.out.print("dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d \n", // \n � utilizado para quebrar a linha no console
				1, 2, 3, 4, 5, 6);
		
		System.out.printf("Salario: %.1f %n", 
				1234.5678); // %n tbm � utilizado para quebra de linha no console
		
		System.out.printf("Nome: %s%n", "Joao");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("\n\nNome = " + nome + " " + sobrenome);
		System.out.println("Idade = " + idade);		
		System.out.printf("%s %s tem %d anos.",
				nome, sobrenome, idade);
		
		entrada.close();
	

	}

}
