package ex_secao_4;

import java.util.Locale;

public class ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int codigo_da_peca1 = 12, numero_da_peca1 = 1, codigo_da_peca2 = 16, numero_da_peca2 = 2;
		double valor_peca1 = 5.30, valor_peca2 = 5.10, valor_total;

		valor_total = (numero_da_peca1 * valor_peca1) + (numero_da_peca2 * valor_peca2);
		
		System.out.println("CODIGO DA PEÇA1: " + codigo_da_peca1);
		System.out.println("CODIGO DA PEÇA2: " + codigo_da_peca2);
		System.out.printf("VALOR TOTAL A PAGAR: $%.2f%n", valor_total);

		int codigo_da_peca3 = 13, numero_da_peca3 = 2, codigo_da_peca4 = 161, numero_da_peca4 = 4;
		double valor_peca3 = 15.30, valor_peca4 = 5.20, valor_total2;

		valor_total2 = (numero_da_peca3 * valor_peca3) + (numero_da_peca4 * valor_peca4);
		
		System.out.printf("%nCODIGO DA PEÇA1: " + codigo_da_peca3);
		System.out.printf("%nCODIGO DA PEÇA2: " + codigo_da_peca4);
		System.out.printf("%nVALOR TOTAL A PAGAR: $%.2f%n", valor_total2);
		
		int codigo_da_peca5 = 1, numero_da_peca5 = 1, codigo_da_peca6 = 2, numero_da_peca6 = 1;
		double valor_peca5 = 15.10, valor_peca6 = 15.10, valor_total3;

		valor_total3 = (numero_da_peca5 * valor_peca5) + (numero_da_peca6 * valor_peca6);
		
		System.out.printf("%nCODIGO DA PEÇA1: " + codigo_da_peca5);
		System.out.printf("%nCODIGO DA PEÇA2: " + codigo_da_peca6);
		System.out.printf("%nVALOR TOTAL A PAGAR: $%.2f%n", valor_total3);


	}

}
