package listaExercicios;

import java.util.Scanner;

public class SextoExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		int num, qtdDig = 0, somaMultiplos = 0;
		double media = 0;
		
		do {
			System.out.println("Digite um n�mero: ");
			num = leitura.nextInt();
			
			if(num % 3 == 0) {
				somaMultiplos += num;
				qtdDig++;
			};
			
		}while(num != 0);
		
		media = somaMultiplos / qtdDig;
		
		System.out.println("M�dia dos n�meros m�ltiplos de 3: " + media);
		System.out.println("N�meros digitados: " + qtdDig);
		System.out.println("Soma dos multiplos: " + somaMultiplos);
	}
}
