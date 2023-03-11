package ex_secao_5;

import java.util.Scanner;

public class duracao_jogo {
//Cálculo de Hora 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hr_inicio, hr_final, duracao_jogo;
		
		hr_inicio = sc.nextInt();
		hr_final = sc.nextInt();
		
		if(hr_inicio<hr_final)
		{
			duracao_jogo = hr_final - hr_inicio;
		}
		else
		{
			duracao_jogo = 24 - hr_inicio + hr_final;
		}
		System.out.printf("O JOGO DUROU: %d hora(s)" , duracao_jogo);
		sc.close();

	}

}
