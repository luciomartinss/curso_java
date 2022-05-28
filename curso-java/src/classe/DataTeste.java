package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.ano = 2018;
		
		
		Data d2 = new Data(03, 11, 2018);
		
		
		
		System.out.println("As datas são " + d1.obterDataFormatada() + " e " + d2.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
