package exercicios_while;

import java.util.Scanner;

public class ex2_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 || y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante");

			}
			if (x < 0 && y > 0) {
				System.out.println("Segundo Quadrante");

			}
			if (x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");

			}
			if (x > 0 && y < 0) {
				System.out.println("Quarto Quadrante");

			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
	}

}
