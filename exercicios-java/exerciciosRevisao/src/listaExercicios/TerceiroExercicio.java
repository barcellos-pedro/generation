package listaExercicios;

import java.util.Scanner;

public class TerceiroExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		int num, faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0;
		
		System.out.println("Digite um número");
		num = leitura.nextInt();
		
		while(num != 0) {
			System.out.println("\nDigite um número");
			num = leitura.nextInt();
			
			if(num >= 0 && num <= 25) { faixa1++; }
			else if(num >= 26 && num <= 50) { faixa2++; }
			else if(num >= 51 && num <= 75) { faixa3++; }
			else if(num >= 76 && num <= 100) { faixa4++; };
		}
		
		System.out.println("\nFim.");
		System.out.println("\n Números entre 0 - 25: " + faixa1);
		System.out.println("\n Números entre 26 - 50: " + faixa2);
		System.out.println("\n Números entre 51 - 75: " + faixa3);
		System.out.println("\n Números entre 76 - 100: " + faixa4);
		
	}
}
