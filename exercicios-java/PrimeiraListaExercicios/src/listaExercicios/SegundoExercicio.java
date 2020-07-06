package listaExercicios;

import java.util.Scanner;

public class SegundoExercicio {
	public static void main(String args[]) {
		int anos, meses, dias, idadeDias;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.printf("Digite sua idade em dias: ");
		idadeDias = leitura.nextInt();
		
		anos = idadeDias / 365;
		meses = (idadeDias % 365) / 30;
		dias = (idadeDias % 365) % 30;
		
		System.out.println("\nVocê tem " + anos + " anos e " + meses + " meses e " + dias + " dias.");
	}
}
