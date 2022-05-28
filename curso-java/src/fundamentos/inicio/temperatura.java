package fundamentos.inicio;

public class temperatura {

	public static void main(String[] args) {
		final double ajuste = 32;
		final double fator = 5.0/9;
		double fahrenheit = 0;
		double celsius = (fahrenheit - ajuste) * fator;
		
		System.out.println("O resultado é " + celsius +"ºC");
	}
}
