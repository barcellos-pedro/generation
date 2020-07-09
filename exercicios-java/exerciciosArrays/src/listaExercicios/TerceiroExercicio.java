package listaExercicios;

import java.util.Random;

public class TerceiroExercicio {
	public static void main(String args[]) {
		int [][]matriz = new int [3][3];
		int maiorQueDez = 0;
		
		Random randNum = new Random();
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = (int)randNum.nextInt(20);
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(matriz[i][j] > 10) {
					maiorQueDez++;
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("\nValores: " + matriz[i][j]);
			}
		}
		
		System.out.println("\nValores maior que 10: " + maiorQueDez);
		
	}
}
