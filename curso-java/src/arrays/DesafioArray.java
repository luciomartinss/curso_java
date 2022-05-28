package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantas notas deseja inserir? ");
			int tamanhoArray = entrada.nextInt();
		
		double[] notasAluno = new double [tamanhoArray];
		
		
		
		for(int i = 0; i < notasAluno.length; i++) {
			System.out.printf("Digite a nota %s: ", i+1);
			notasAluno[i] = entrada.nextDouble();
		}
		
		System.out.println(Arrays.toString(notasAluno));
		
		double total = 0;
		for(double nota: notasAluno) {
			total += nota;
		}
		
		System.out.printf("A media do aluno é: %s", total / notasAluno.length);
		
				
		
		/*System.out.println("Digite a primeira nota: ");
			notasAluno[0] = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
			notasAluno[1] = entrada.nextDouble();
			
		System.out.println("Digite a terceira nota: ");
			notasAluno[2] = entrada.nextDouble();
			
		System.out.println("Digite a quarta nota: ");
			notasAluno[3] = entrada.nextDouble();
			
		System.out.println("Digite a quinta nota: ");
			notasAluno[4] = entrada.nextDouble();*/
		

		entrada.close();
	}
}
