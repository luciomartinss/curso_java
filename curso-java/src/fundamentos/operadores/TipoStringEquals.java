package fundamentos.operadores;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2"); // como as String s�o exatamente igual, vai dar true
		
		String s1 = new String("2");
		System.out.println("2" == s1); // vai dar false, por ser formas diferentes
		System.out.println("2".equals(s1)); // forma correta de se comparar Strings - True
	}
}
