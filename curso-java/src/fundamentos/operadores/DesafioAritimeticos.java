package fundamentos.operadores;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a,3);
		
		System.out.println(b);
		
		double x1 = (6*(3+2));
		double x2 = Math.pow(x1,2);
		double xResult = x2 / (3*2);
		
		double y1 = ((1-5)*(2-7)) / 2;
		double yResult = Math.pow(y1, 2);
		
		double Final1 = xResult - yResult;
		double Final2 = Math.pow(Final1, 3);
		
		double ResultFinal = Final2 / (Math.pow(10, 3));
		
		System.out.println(ResultFinal);
		
		
	}

}
