package fundamentos.inicio;


import java.util.Scanner;

public class DesafioCalculadora{

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		Double num1 = entrada.nextDouble();
		
		System.out.print("Digite o operador: (+, -, *, /, %): ");
		String operador = entrada.next();
		
		System.out.print("Digite o segundo numero: ");
		Double num2 = entrada.nextDouble();
		
		Double soma = num1 + num2; 
		Double subtracao = num1 - num2 ;
		Double multiplicacao = num1 * num2 ;
		Double divisao = num1 / num2 ;
		Double modulo = num1 % num2 ;
		
		final Double resultado = operador.equals("+")? soma : 
							operador.equals("-")? subtracao :
								operador.equals("*")? multiplicacao:
									operador.equals("/")? divisao:
											operador.equals("%")? modulo :
											0;
		
		System.out.printf("%.1f %s %.1f = %.1f",
				num1, operador, num2, resultado);
			
		
		entrada.close();
		
		
	}
}
