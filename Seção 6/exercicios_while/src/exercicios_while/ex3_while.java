package exercicios_while;

import java.util.Scanner;

public class ex3_while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int alcool = 0, diesel = 0, gasolina = 0;
		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			if (tipo == 3) {
				diesel = diesel + 1;
			}

			tipo = sc.nextInt();
		}

		System.out.println("Fim");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}

}
