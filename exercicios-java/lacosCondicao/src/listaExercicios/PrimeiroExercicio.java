package listaExercicios;

import java.util.Scanner;

public class PrimeiroExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		int n1, n2, n3, maiorNumero;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leitura.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = leitura.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = leitura.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("Maior número: " + n1);
		}else if(n2>n1 && n2>n3) {
			System.out.println("Maior número: " + n2);
		}else {
			System.out.println("Maior número: " + n3);
		}
		
	}
}
