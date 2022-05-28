package generics;

public class CaixaObjectTeste {

	
	public static void main(String[] args) {
		
		CaixaObject caixaA = new CaixaObject();
		caixaA.guardar(2.3);
		
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);

		
		CaixaObject caixaB = new CaixaObject();
		caixaB.guardar("Ola");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		
		
		
		 
	}
}
