package Array;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.5;
		notasAlunoA[1] = 5.6;
		notasAlunoA[2] = 8.1;
		
		System.out.println(Arrays.toString(notasAlunoA));

		double total = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println(total / notasAlunoA.length );
	}
}
