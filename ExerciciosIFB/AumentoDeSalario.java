package ExerciciosIFB;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;


public class AumentoDeSalario {
	public static void main(String[] args) {
		Locale usLocale = new Locale("en", "US");
		Locale.setDefault(usLocale);
		
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		DecimalFormat df = new DecimalFormat("0.00");

		double salario = entrada.nextDouble();
		if(salario <= 400) {
			System.out.println("Novo salario: " + df.format(salario * 1.15));
			System.out.println("Reajuste ganho: " + df.format(salario * 0.15));
			System.out.println("Em percentual: 15 %");
		}else if(salario > 400 && salario <= 800) {
			System.out.println("Novo salario: " + df.format(salario * 1.12));
			System.out.println("Reajuste ganho: " + df.format(salario * 0.12));
			System.out.println("Em percentual: 12 %");
		}else if(salario > 800 && salario <= 1200) {
			System.out.println("Novo salario: " + df.format(salario * 1.10));
			System.out.println("Reajuste ganho: " + df.format(salario * 0.10));
			System.out.println("Em percentual: 10 %");
		}else if(salario > 1200 && salario <= 2000) {
			System.out.println("Novo salario: " + df.format(salario * 1.07));
			System.out.println("Reajuste ganho: " + df.format(salario * 0.07));
			System.out.println("Em percentual: 7 %");
		}else {
			System.out.println("Novo salario: " + df.format(salario * 1.04));
			System.out.println("Reajuste ganho: " + df.format(salario * 0.04));
			System.out.println("Em percentual: 4 %");
		}
	}
}
