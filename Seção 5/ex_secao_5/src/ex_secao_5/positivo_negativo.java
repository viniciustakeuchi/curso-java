package ex_secao_5;

import java.util.Scanner;

public class positivo_negativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		if(num<0)
		{
			System.out.println("Negativo");
		}
		else {
			System.out.println("Não Negativo");
		}
		sc.close();

	}

}
