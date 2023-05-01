package application;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseSix {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas irá digitar?");
		int n = sc.nextInt();
		double avg;

		double[] alturas = new double[n];
		char[] genero = new char[n];
		int i;

		for (i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa?", i + 1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa?", i + 1);
			genero[i] = sc.next().charAt(0);
		}

		double menor = alturas[0];
		double maior = alturas[0];

		for (i = 0; i < n; i++) {
			if (menor > alturas[i]) {
				menor = alturas[i];
			}
			if (maior < alturas[i]) {
				maior = alturas[i];
			}
		}

		double somaAltura = 0.0;
		int count = 0;
		for (i = 0; i < n; i++) {
			if (genero[i] == 'F') {
				somaAltura += alturas[i];
				count++;
			}
		}
		avg = somaAltura / count;
		int countMen = 0;
		for (i = 0; i < n; i++) {
			if (genero[i] == 'M') {

				countMen++;
			}

		}
		System.out.println();
		System.out.printf("Menor altura: %.2f\n", menor);
		System.out.printf("Maior altura: %.2f\n", maior);
		System.out.printf("Média das alturas das mulheres: %.2f\n", avg);
		System.out.printf("Número de homens: %d", countMen);
	}

}