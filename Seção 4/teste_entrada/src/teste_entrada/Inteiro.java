package teste_entrada;

import java.util.Scanner;

public class Inteiro {

	public static void main(String[] args) {
	//Para ler um número inteiro
		
		
		Scanner si = new Scanner(System.in);
		int y;
		y = si.nextInt();
		System.out.println("Você digitou: " + y);
		si.close();
	}

}
