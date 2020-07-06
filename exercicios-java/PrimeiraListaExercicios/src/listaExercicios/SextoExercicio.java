package listaExercicios;

import java.util.Scanner;

public class SextoExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		int px1, py1, px2, py2;
		double d;

		System.out.println("Digite o valor de X do ponto 1: ");
		px1 = leitura.nextInt();
		
		System.out.println("\nDigite o valor de y do ponto 1: ");
		py1 = leitura.nextInt();
		
		System.out.println("\nDigite o valor de X do ponto 2: ");
		px2 = leitura.nextInt();
		
		System.out.println("\nDigite o valor de y do ponto 2: ");
		py2 = leitura.nextInt();
		
		d = Math.sqrt(Math.pow(px2 - px1, 2) + Math.pow(py2 - py1, 2));
		
		System.out.printf("Resultado: %2.2f", d);
	}
}
