package oo.abstrato;

public class TesteAbstrato {
	
	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		
		System.out.println(c.respirar());
		System.out.println(c.mover());
		System.out.println(c.mamar());
		
		
	}

}
