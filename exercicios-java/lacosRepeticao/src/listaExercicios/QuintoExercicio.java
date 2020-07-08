package listaExercicios;

import java.util.Scanner;

public class QuintoExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		int num, soma = 0;
		
		do{
			System.out.println("Digite um número: ");
			num = leitura.nextInt();
			
			soma += num;
		}while(num != 0);
		
		System.out.println("Resultado da soma: " + soma);
		
	}
}
