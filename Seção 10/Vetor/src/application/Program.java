package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter with the size of the vector: ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		int i;
		for (i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();

		}

		double soma = 0;
		for (i = 0; i < n; i++) {
			soma += vect[i];
		}

		double med = soma / n;

		System.out.printf("AVERAGE HEIGHT: %.2f", med);

		sc.close();

	}

}
