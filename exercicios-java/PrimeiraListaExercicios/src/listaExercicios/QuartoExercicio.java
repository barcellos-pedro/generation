package listaExercicios;

import java.util.Scanner;

public class QuartoExercicio {
	public static void main(String args[]) {
		int a, b, c;
		double d, r, s;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite um valor para A: ");
		a = leitura.nextInt();
		
		System.out.println("Digite um valor para B: ");
		b = leitura.nextInt();
		
		System.out.println("Digite um valor para C: ");
		c = leitura.nextInt();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);

		d = (r + s) / 2;
		
		System.out.println("\nResultado da expressão: " + d);
	}
}
