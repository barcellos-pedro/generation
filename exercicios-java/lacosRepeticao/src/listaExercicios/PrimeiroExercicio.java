package listaExercicios;

import java.util.Scanner;

public class PrimeiroExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		int n1, n2, n3, maiorNumero;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = leitura.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = leitura.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		n3 = leitura.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("Maior n�mero: " + n1);
		}else if(n2>n1 && n2>n3) {
			System.out.println("Maior n�mero: " + n2);
		}else {
			System.out.println("Maior n�mero: " + n3);
		}
		
	}
}
