package listaExercicios;

import java.util.Scanner;

public class TerceiroExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		int idade, totalJovens = 0, totalIdosos = 0;

		System.out.println("Digite sua idade: ");
		idade = leitura.nextInt();
		
		while(idade != -99) {
			if(idade < 21) { totalJovens++; }
			else if(idade > 50){ totalIdosos++; };
			
			System.out.println("Digite sua idade: ");
			idade = leitura.nextInt();
		}
		
		System.out.println("Total de pessoas com menos de 21 anos: " + totalJovens);
		System.out.println("Total de pessoas com mais de 50 anos: " + totalIdosos);
		
	}
}