package application;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseThree {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();
		int[] vet = new int[n];
		int somaPares = 0, count = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				somaPares += vet[i];
				count++;
			}
		}
		double avg;
		if (count == 0) {
			System.out.println("Nenhum número par");
		} else {
			avg = (double) somaPares / n;
			System.out.printf("Média dos números pares: %.1f", avg);
		}

	}
}
