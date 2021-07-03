package ExerciciosIFB;

import java.util.Scanner;

public class SeisNumerosImpares {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1 = entrada.nextInt();
		int i = 0;
		while (i < 6) {
			
			if(n1 % 2 == 1) {
				System.out.println(n1);
				i++;
			}
			n1++;
			
		}
	
	}
}
