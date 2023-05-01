package application;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseFive {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serão digitados?");
		int n = sc.nextInt();
		double avg;
		
		
		String[] nomes = new String[n]; 
		double[] notas1 = new double[n];
		double[] notas2 = new double[n];
		int i;
		for(i=0; i<n; i++)
		{
			System.out.printf("Digite nome, primeira e segunda nota do %do  aluno: ", i+1);
			nomes[i] = sc.next();
			notas1[i] = sc.nextDouble();
			notas2[i] = sc.nextDouble();
			
		}
		
		
		
		System.out.println("Alunos Aprovados: ");
		for(i=0; i<n; i++)
		{
			avg = (notas1[i] + notas2[i]) /2;
			if(avg>=6.0)
			{
				System.out.println(nomes[i]);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
