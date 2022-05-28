package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo calc1 = (x, y) -> {return x + y;};
		System.out.println(calc1.executar(2, 3));
		
		calc1 = (x, y) -> x + y; //-> forma simplificada ou forma de alterar a variavel calc
		System.out.println(calc1.executar(2, 3));
		
		// utilizando uma função ja pré definida do Java, desta forma não a necessidade de criar uma interface
		BinaryOperator<Double> calc2 = (x, y) -> {return x + y;};
		System.out.println(calc2.apply(2.0, 3.0));
		
		calc2 = (x, y) -> x + y; 
		System.out.println(calc2.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calc3 = (x, y) -> {return x + y;};
		System.out.println(calc3.apply(2, 3));
		
		calc3 = (x, y) -> x + y; 
		System.out.println(calc3.apply(2, 3));
	}
}
