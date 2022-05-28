package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("informe o nome:");
		@SuppressWarnings("unused")
		String nome = entrada.next();
		
		@SuppressWarnings("unused")
		String sql = "INSERT INTO pessoas (nome) VALUES (?)"; 
		
		entrada.close();
	}
}
