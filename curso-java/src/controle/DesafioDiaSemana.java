package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do dia: ");
		String Dia = entrada.next();
		
		if("domingo".equalsIgnoreCase(Dia)) {
			System.out.println(1);
		} else if("segunda".equalsIgnoreCase(Dia)) {
			System.out.println(2);
		} else if("terça".equalsIgnoreCase(Dia) || 
			"terca".equalsIgnoreCase(Dia)) {
			System.out.println(3);
		} else if("quarta".equalsIgnoreCase(Dia)) {
			System.out.println(4);
		} else if("quinta".equalsIgnoreCase(Dia)) {
			System.out.println(5);
		} else if("sexta".equalsIgnoreCase(Dia)) {
			System.out.println(6);
		} else if("sabado".equalsIgnoreCase(Dia) || 
			"sábado".equalsIgnoreCase(Dia)){
			System.out.println(7);
		} else {
			System.out.println("Dia Inválido!");
		}
		
				
		System.out.println("Fim!");
		entrada.close();
	}
}
