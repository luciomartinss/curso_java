package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		
		//Calculo calc = (x, y) -> {return x + y;};
		Calculo calc = (x, y) -> x + y; //-> forma simplificada
		
		System.out.println(calc.executar(2, 3));
		
	}
}
