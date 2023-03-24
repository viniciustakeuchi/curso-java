package exercicios_while;

import java.util.Scanner;

public class ex1_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		while (x != 2002) {
			System.out.println("Senha Inválida");
			x = sc.nextInt();
		}

		System.out.println("Acesso Permitido");
		sc.close();

	}

}
