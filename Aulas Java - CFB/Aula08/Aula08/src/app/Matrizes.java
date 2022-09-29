package app;

import java.security.SecureRandom;

public class Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int linha =3;
		final int coluna =5;
		
		int[][] numero = new int[linha][coluna];
		
		for (int i = 0; i < linha; i++) {
			
			for (int j = 0; j < coluna; j++) {
				
				numero[i][j]= new SecureRandom().nextInt(500);
			}
		}
		
		for (int i = 0; i < linha; i++) {
			
			for (int j = 0; j < coluna; j++) {
				
				System.out.printf("%3d | ", numero[i][j]);
			}
			System.out.println("\n");
		}
		
		System.out.println("\n\n****************  |  *******************  |  ****************\n");
		
		for(int[] n : numero) {
			for(int v:n) {
				System.out.printf("%3d | ", v);
			}
			System.out.println("\n");
		}
	}
}
