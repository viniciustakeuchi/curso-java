package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 32, idade = 31, age = 30, code = 5290, gender = 'F';
		double x = 10.35784, renda= 4000.00, price1 = 2100.00, price2 = 650.50, measure = 53.234567;		
		String nome = "Maria", product1 = "Computer", product2 = "Office Desk";
		
		
		System.out.println("Hello World!!");
		System.out.println("Bom Dia!!");
		System.out.println(y);
		System.out.printf("%.2f%n",x);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e recebe $%.2f reais.%n", nome, idade, renda);
		System.out.printf("Product:%n%s, which price is $ %.2f%n %s, which price is $ %.2f%n Record: %d years old, code %d and gender: %c%n Measue with eight decimal places: %.8f%n rouded *three eight decimal places): %.3f%n US decimal point: %.3f",product1, price1, product2, price2, age, code, gender, measure,measure,measure);

	}

}
