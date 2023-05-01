package application;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseTwo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números você irá digitar?: ");
		int n = sc.nextInt();

		double[] vet = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += vet[i];
		}

		double avg = sum / n;

		System.out.print("Valores = ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", vet[i]);
		}

		System.out.printf("\nSoma = %.2f\n", sum);
		System.out.printf("Média = %.2f", avg);
		sc.close();
	}

}
