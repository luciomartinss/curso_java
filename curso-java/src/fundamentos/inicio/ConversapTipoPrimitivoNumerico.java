package fundamentos.inicio;

public class ConversapTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // conversao implicita
		System.out.println(a);
		
		float b = (float) 1.123456788888; // explícita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // explícita (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e; // explícita (CAST) 
		System.out.println(f);

	}

}
