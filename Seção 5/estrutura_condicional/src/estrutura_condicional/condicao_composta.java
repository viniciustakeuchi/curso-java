package estrutura_condicional;

import java.util.Scanner;

public class condicao_composta {

	public static void main(String[] args) {
		//Condição Composta
		Scanner sc = new Scanner(System.in);
		int hora;
		System.out.println("Quantas horas??");
		hora = sc.nextInt();
		
		if(hora <12) {
		System.out.println("Bom Dia");	
		}
		else {
			System.out.println("Boa Tarde");
		}
		
		sc.close();
	}
}
