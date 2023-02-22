package ex_secao_4;

import java.util.Locale;

public class ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double area, raio = 2.0;
		area = 3.14159 * Math.pow(raio, 2.0);
		System.out.printf("O resultado da area do círculo é: %.4f%n", area);

		double area2, raio2 = 100.64;
		area2 = 3.14159 * Math.pow(raio2, 2.0);
		System.out.printf("O resultado da área do círculo é: %.4f%n", area2);

		double area3, raio3 = 150.00;
		area3 = 3.14159 * Math.pow(raio3, 2.0);
		System.out.printf("O resultado da área do círculo é: %.4f%n", area3);

	}

}
