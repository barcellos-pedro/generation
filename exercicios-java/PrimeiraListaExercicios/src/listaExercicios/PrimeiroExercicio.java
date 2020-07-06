package listaExercicios;

import java.util.Scanner;

public class PrimeiroExercicio {
	public static void main (String args[]) {
		int anos, meses, dias, totalDias;
		System.out.printf("Exercício 1\n");
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.printf("Digite sua idade em anos: ");
		anos = leitura.nextInt();
		
		System.out.printf("Quantos meses: ");
		meses = leitura.nextInt();
		
		System.out.printf("E quantos dias: ");
		dias = leitura.nextInt();
		
		totalDias = (anos*365)+(meses*30)+dias;
		
		System.out.printf("Sua idade em dias %d: ", totalDias);
	}
}
