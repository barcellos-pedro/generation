package listaExercicios;

import java.util.Scanner;

public class SegundoExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = leitura.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = leitura.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		n3 = leitura.nextInt();
		
		if(n1<n2 && n2<n3) {
			System.out.printf("%d, %d, %d", n1, n2, n3);
		}
		
		else if(n1<n3 && n3<n2) {
			System.out.printf("%d, %d, %d", n1, n3, n2);
		}
		
		else if(n2<n1 && n1<n3) {
			System.out.printf("%d, %d, %d", n2, n1, n3);
		}
		
		else if(n2<n3 && n3<n1) {
			System.out.printf("%d, %d, %d", n2, n3, n1);
		}
		
		else if(n3<n1 && n2<n1) {
			System.out.printf("%d, %d, %d", n3, n1, n2);
		}
		
		else {
			System.out.printf("%d, %d, %d", n3, n2, n1);
		}
	}
}
