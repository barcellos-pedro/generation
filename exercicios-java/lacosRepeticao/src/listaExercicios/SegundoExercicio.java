package listaExercicios;

import java.util.Scanner;

public class SegundoExercicio {
	public static void main(String args[]) {
		int num, qtdPar = 0, qtdImpar = 0;
		
		Scanner leitura = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite um n�mero: ");
			num = leitura.nextInt();
			
			if(num % 2 == 0) { qtdPar++; }
			else { qtdImpar++; };
		}
		System.out.println("Quantidade de n�meros pares: " + qtdPar);
		System.out.println("Quantidade de n�meros �mpares: " + qtdImpar);
		
	}
}
