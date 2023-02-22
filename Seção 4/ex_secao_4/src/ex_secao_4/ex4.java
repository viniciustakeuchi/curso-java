package ex_secao_4;

import java.util.Locale;

public class ex4 {

	public static void main(String[] args) {
		//Importando Locale para deixar no formato com "." nos valores double.
		Locale.setDefault(Locale.US);
		
		int numero_funcionario1 = 25, horas_trabalhadas1 = 100;
		double valor_por_hora1 = 5.50,salario_funcionario1;
		salario_funcionario1 = horas_trabalhadas1 * valor_por_hora1;
		System.out.printf("NUMBER = %d%nSALARY: U$ %.2f%n",numero_funcionario1, salario_funcionario1);
		
		
		int numero_funcionario2 = 1, horas_trabalhadas2 = 200;
		double valor_por_hora2 = 20.50,salario_funcionario2;
		salario_funcionario2 = horas_trabalhadas2 * valor_por_hora2;
		System.out.printf("%nNUMBER = %d%nSALARY: U$ %.2f%n",numero_funcionario2, salario_funcionario2);
		
		
		int numero_funcionario3 = 6, horas_trabalhadas3 = 145;
		double valor_por_hora3 = 15.55,salario_funcionario3;
		salario_funcionario3 = horas_trabalhadas3 * valor_por_hora3;
		System.out.printf("%nNUMBER = %d%nSALARY: U$ %.2f%n",numero_funcionario3, salario_funcionario3);

	}

}
