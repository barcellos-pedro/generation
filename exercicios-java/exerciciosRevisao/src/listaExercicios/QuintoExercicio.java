package listaExercicios;

import java.util.Scanner;

public class QuintoExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		float []matrizReal = new float[5];
		int codigo;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite um número para matriz: ");
			matrizReal[i] = leitura.nextFloat();	
		}
		
		System.out.println("\nDigite o código desejado: \n0) Encerrar programa. \n1) Mostrar vetor na ordem direta. \n2) Mostrar vetor na ordem inversa.");
		codigo = leitura.nextInt();
		
		switch(codigo) {
			case 0:
				System.out.println("Finalizando programa...");
				System.out.println("Encerrado.");
				break;
			case 1:
				for(float i : matrizReal) System.out.println(i);
				break;
			case 2:
				for(int i = matrizReal.length - 1 ; i >= 0; i--) {
					System.out.println(matrizReal[i]);
				}
				break;
			default:
				System.out.println("Código inválido");
				break;
		}
		
	}
}
