package listaExercicios;

import java.util.Scanner;

public class QuartoExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		int n1;
		
		System.out.println("Digite um n�mero: ");
		n1 = leitura.nextInt();
		
		if(n1 % 2 == 0) {
			System.out.println("O n�mero � par: " + n1);
			System.out.println("Raiz quadrada de " + n1 + ": " + Math.sqrt(n1));
		}else {
			System.out.println("O n�mero � �mpar: " + n1);
			System.out.println(n1 + " elevado ao quadrado " + n1 + ": " + Math.pow(n1,2));
		}
		
	}
}
