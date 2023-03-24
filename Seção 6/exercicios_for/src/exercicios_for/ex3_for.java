package exercicios_for;

import java.util.Locale;
import java.util.Scanner;

public class ex3_for {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();

			double media_ponderada = (x * 2 + y * 3 + z * 5) / 10;
			System.out.println(media_ponderada);
		}

		sc.close();

	}

}
