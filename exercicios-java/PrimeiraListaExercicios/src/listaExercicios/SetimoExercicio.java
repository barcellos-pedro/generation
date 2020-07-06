package listaExercicios;

import java.util.Scanner;

public class SetimoExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		int a1, b2, c3, d4, ee, f, x, y;

		System.out.println("Digite um valor para a equação: ");
		a1 = leitura.nextInt();
		
		System.out.println("Digite um valor para a equação: ");
		b2 = leitura.nextInt();
		
		System.out.println("Digite um valor para a equação: ");
		c3 = leitura.nextInt();
		
		System.out.println("Digite um valor para a equação: ");
		d4 = leitura.nextInt();
		
		System.out.println("Digite um valor para a equação: ");
		ee = leitura.nextInt();
		
		System.out.println("Digite um valor para a equação: ");
		f = leitura.nextInt();

		x = (c3*ee) - (b2*f) / (a1*ee) - (b2*d4);

		y = (a1*f) - (c3*d4) / (a1*ee) - (b2*d4);

		System.out.printf("Resultado de x: %d", x);
		System.out.printf("\nResultado de y: %d", y);
	}
}
