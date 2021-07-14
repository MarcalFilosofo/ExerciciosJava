package exercucios;

import java.util.Iterator;

public class MultiplicacaoDeMatrizes {
	public static void main(String[] args) {
		
		int A[][] = new int[][] { { 2, 3 }, { 1, 0 }, { 4, 5 } };
		int B[][] = { { 3, 1 }, { 2, 4 } };
		int[][] matrizC = new int[A.length][B[0].length];
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				for (int k = 0; k < B.length; k++) {
					matrizC[i][j] += A[i][k] * B[k][j]; 
				}
		    }
		}
		System.out.print("matrizC = { ");
		for (int i = 0; i < matrizC.length; i++) {
			System.out.print("{");
			for (int j = 0; j < matrizC[0].length; j++) {
				System.out.print(" " + matrizC[i][j] + ","); 
			}
			System.out.print("}, "); 
		}
		System.out.println("}");

		
//		AxB[0][0] = A[0][0] * B[0][0] + A[0][1] * B[1][0];
//		AxB[0][1] = A[0][0] * B[0][1] + A[0][1] * B[1][1];
//		AxB[1][0] = A[1][0] * B[0][0] + A[1][1] * B[1][0];
//		AxB[1][1] = A[1][0] * B[0][1] + A[1][1] * B[1][1];
//		AxB[2][0] = A[2][0] * B[0][0] + A[2][1] * B[1][0];
//		AxB[2][1] = A[2][0] * B[0][1] + A[2][1] * B[1][1];

		
		
	}
}
