package teste_entrada;

import java.util.Locale;
import java.util.Scanner;

public class Varios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String x;
		int y;
		double z;
		
		Scanner sc = new Scanner(System.in);
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		sc.close();

	}

}
