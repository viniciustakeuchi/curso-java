package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;



public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.println("Is there na initial deposit(y/n)?: ");
		char asnwer = sc.next().charAt(0);
		
		if (asnwer == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);

		} else {
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(account);
		
		
		System.out.println();
		System.out.println("Enter a deposit value");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a withdraw");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		sc.close();

	}

}
