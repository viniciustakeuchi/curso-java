package exercicios_fixacao;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();

		System.out.println("What's your name? ");
		emp.name = sc.nextLine();

		System.out.println("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();

		System.out.println("Tax: ");
		emp.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee" + emp);
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);

		System.out.println();
		System.out.println("Update data: " + emp);
		sc.close();

	}

}
