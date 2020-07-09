package listaExercicios;

import java.util.Scanner;

public class QuartoExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		float [][]m1 = new float [2][2], m2 = new float[2][2];
		float [][]soma = new float [2][2], sub = new float[2][2];
		int opcao;
		
		for(int i = 0; i <2; i++) {
			for(int j = 0; j <2; j++) {
				System.out.println("Digite um número para a 1º e 2º matriz: ");
				m1[i][j] = leitura.nextFloat();
				m2[i][j] = leitura.nextFloat();
			}
		}
		
		System.out.println("\nDigite um número para a operaçãoo desejada: ");
		opcao = leitura.nextInt();
		
		switch(opcao) {
			case 1:
				for(int i = 0; i <2; i++) {
					for(int j = 0; j <2; j++) {
						soma[i][j]= m1[i][j] + m2[i][j];
						System.out.println("\nResultado da soma: " + soma[i][j]);
					}
				}
				break;
			case 2:
				for(int i = 0; i <2; i++) {
					for(int j = 0; j <2; j++) {
						sub[i][j]= m1[i][j] -+ m2[i][j];
						System.out.println("\nResultado da subtração: " + soma[i][j]);
					}
				}
				break;
			case 3:
				for(int i = 0; i <2; i++) {
					for(int j = 0; j <2; j++) {
						System.out.println("Digite um valor para a constante: ");
						final float constante = leitura.nextFloat();
						m1[i][j] += constante;
						m2[i][j] += constante;
					}
				}
				break;
			case 4:
				for(int i = 0; i <2; i++) {
					for(int j = 0; j <2; j++) {
						System.out.println("\n1º Matriz : " + m1[i][j]);
						System.out.println("\n2º Matriz : " + m2[i][j]);
						System.out.println("\nMatriz soma: " + soma[i][j]);
						System.out.println("\nMatriz subtração: " + sub[i][j]);
					}
				}
				break;
			default:
				System.out.println("Opção inválida.");
		}
		
	}
}
