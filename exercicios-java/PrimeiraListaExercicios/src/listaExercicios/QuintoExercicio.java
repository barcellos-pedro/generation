package listaExercicios;

import java.util.Scanner;

public class QuintoExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		float n1,n2,n3;
		double media;
		
		System.out.println("Digite sua primeira nota: ");
		n1 = leitura.nextFloat();
		
		System.out.println("Digite sua segunda nota: ");
		n2 = leitura.nextFloat();
		
		System.out.println("Digite sua terceira nota: ");
		n3 = leitura.nextFloat();
		
		media = (2*n1) + (3*n2) + (5*n3) / (2 + 3 + 5);
		
		System.out.println("Sua média: " + media);
		
	}
}
