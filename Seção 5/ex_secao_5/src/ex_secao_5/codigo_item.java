package ex_secao_5;

import java.util.Locale;
import java.util.Scanner;

public class codigo_item {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cd_item, qt_item;
		double conta = 0;
		
		Locale.setDefault(Locale.US);
		
		cd_item = sc.nextInt();
		qt_item = sc.nextInt();
		
		if(cd_item == 1)
		{
			conta = qt_item * 4.00;
		}
		else if(cd_item == 2)
		{
			conta = qt_item * 4.50;
		}
		else if(cd_item == 3)
		{
			conta = qt_item * 5.00;
		}
		else if(cd_item == 4)
		{
			conta = qt_item * 2.00;
		}
		else if(cd_item == 5)
		{
			conta = qt_item * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f " , conta);
		sc.close();
	}

}
