package teste_entrada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Para ler uma palavra sem espaço
		
		Scanner sc = new Scanner(System.in);
		
		String x;	
		x = sc.next();
		System.out.println("Você digitou: " + x);
		sc.close();

		
	}

}
