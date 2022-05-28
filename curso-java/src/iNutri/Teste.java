package iNutri;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		usuario.setNome(entrada.nextLine()); 
		
		System.out.print("Informe sua idade: ");
		usuario.setIdade(entrada.nextInt());

		System.out.print("Informe sua altura em cm: ");
		usuario.setAltura(entrada.nextInt());
		
		System.out.print("Informe seu peso em kg: ");
		usuario.setPeso(entrada.nextDouble());
		
		System.out.print("Informe o sexo (M/F): ");
		usuario.setSexo(entrada.next());
		while(!usuario.getSexo().equalsIgnoreCase("M") && !usuario.getSexo().equalsIgnoreCase("F")) {
			System.out.print("Informação Incorreta, informe novamente (M/F): ");
			usuario.setSexo(entrada.next());
		}
			
		
			
		
		//usuario.email = "lucio.martinss@hitmail.com";
		//usuario.nivelDeAtividade = 1;
		
			
		
		System.out.println(usuario.TMB());
				
		
		entrada.close();
	}
}
