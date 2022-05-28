package fundamentos.operadores;



public class Ternario {
	public static void main(String[] args) {
		
		double media = 8.6;
		String resultadoParcial = media >= 5.0 ? "em recuperação." : "reprovado.";
		String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;
		
		System.out.println("O aluna esta " + resultadoFinal);
		
		boolean bomComportamento = true;
		boolean passouPorMedia = media >= 7.0;
		boolean alunoPerfeito = bomComportamento && passouPorMedia;
		String resultado = alunoPerfeito ? "Sim." : "Não.";
		
		System.out.printf("Aluno Perfeito? %s", resultado);
				
		
	}
}
