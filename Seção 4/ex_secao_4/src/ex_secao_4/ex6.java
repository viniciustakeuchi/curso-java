package ex_secao_4;

import java.util.Locale;

public class ex6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//Exemplo1
		
		double A = 3.0, B = 4.0, C = 5.2, triangulo, circulo, trapezio, quadrado, retangulo;

		triangulo = (A * C) / 2.0;
		System.out.printf("TRIANGULO: %.3f%n", triangulo);

		circulo = 3.14159 * Math.pow(C, 2.0);
		System.out.printf("CIRCULO: %.3f%n", circulo);

		trapezio = ((A + B) * C) / 2.0;
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);

		quadrado = Math.pow(B, 2.0);
		System.out.printf("QUADRADO: %.3f%n", quadrado);

		retangulo = A * B;
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		//Exemplo2
		double A2 = 12.7, B2 = 10.4, C2 = 15.2, triangulo2, circulo2, trapezio2, quadrado2, retangulo2;

		triangulo2 = (A2 * C2) / 2.0;
		System.out.printf("%nTRIANGULO: %.3f%n", triangulo2);

		circulo2 = 3.14159 * Math.pow(C2, 2.0);
		System.out.printf("CIRCULO: %.3f%n", circulo2);

		trapezio2 = ((A2 + B2) * C2) / 2.0;
		System.out.printf("TRAPEZIO: %.3f%n", trapezio2);

		quadrado2 = Math.pow(B2, 2.0);
		System.out.printf("QUADRADO: %.3f%n", quadrado2);

		retangulo2 = A2 * B2;
		System.out.printf("RETANGULO: %.3f%n", retangulo2);

	}

}
