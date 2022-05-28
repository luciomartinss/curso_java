package oo.abstrato;

public abstract class Mamifero extends Animal {
	
	public abstract String mamar();
	
	@Override
	public final String mover() { // metodo final n�o pode ser sobescrito em outras classes
		return "saindo do lugar";
	}
	
	
}
