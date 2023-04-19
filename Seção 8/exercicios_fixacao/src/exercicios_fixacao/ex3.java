package exercicios_fixacao;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student std = new Student();

		System.out.println("What's your name?");
		std.name = sc.nextLine();

		System.out.println("Write your three grade of the year: ");
		std.grade1 = sc.nextDouble();
		std.grade2 = sc.nextDouble();
		std.grade3 = sc.nextDouble();

		if (std.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", std.missingGrade());
		} else {
			System.out.println("PASS");
			System.out.printf("FINAL GRADE: %.2f", std.finalGrade());
		}

	}

}
