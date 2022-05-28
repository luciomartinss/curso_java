package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos alunos � na sala?: ");
			int qtdAlunos = entrada.nextInt();

		System.out.print("Quantas notas ser�o lan�adas para cada alunos?: ");
			int qtdNotas = entrada.nextInt();
			
		//int[] aluno = new int [qtdAlunos];
		
			
		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];
		double totalMedia = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			double total = 0;
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a %d� nota do aluno %d: ", n+1, a+1);
				notasDaTurma[a][n]= entrada.nextDouble();
				total += notasDaTurma[a][n];
				}
			double media = total / qtdNotas;
					System.out.printf("A m�dia do aluno %s �: %s.\n", a+1, media);
			totalMedia += media;
		}			
		
		double mediaTurma = totalMedia / qtdAlunos;
		System.out.println("A m�dia da turma �: " + mediaTurma);
	
		for(double[] notasDoAluno: notasDaTurma) {
	System.out.println(Arrays.toString(notasDoAluno));
		}

		entrada.close();
	}
}
