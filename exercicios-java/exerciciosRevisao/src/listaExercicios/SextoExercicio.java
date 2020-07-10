package listaExercicios;

import java.util.Scanner;
import java.util.Random;

public class SextoExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		Random randNum = new Random();
		
		int []vetor = new int[3];
		int [][]matriz = new int [3][3];
		int [][]matrizMult = new int[3][3];
		
		//Populando vetor...
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um valor para o vetor");
			vetor[i] = leitura.nextInt();
		}
		
		//Populando matriz...
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Digite um valor para a matriz");
				matriz[i][j] = leitura.nextInt();
			}
		}
		
		//Multiplicação do vetor com as colunas da matriz
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizMult[i][j] = vetor[i] * matriz[j][i];
				System.out.println("\n"+matrizMult[i][j]);
			}
		}
		
		/* ###################################### */
	}
}
