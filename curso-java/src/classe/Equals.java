package classe;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Sampaio";
		u1.email = "Pedro.sampaio@exemail.com.br";
		
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Sampaio";
		u2.email = "Pedro.sampaio@exemail.com.br";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		//System.out.println(u2.equals(new Date()));
	}
}
