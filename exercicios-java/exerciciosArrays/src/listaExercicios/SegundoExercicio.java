package listaExercicios;

import java.util.Scanner;
import java.util.ArrayList;

public class SegundoExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		int num, somaPar = 0, qtdImpar = 0;
		
		ArrayList<Integer> imparDigi = new ArrayList<Integer>();
		ArrayList<Integer> parDigi = new ArrayList<Integer>();
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite um n�mero: ");
			num = leitura.nextInt();
			
			if (num % 2 == 0) {
				somaPar += num;
				parDigi.add(num);
			}
			else{
				imparDigi.add(num);
				qtdImpar++;
			}
		}
		
		for(int a : parDigi) System.out.println("\nN�mero par digitado:" + a);
		
		System.out.println("\nSoma total de n�meros pares: " + somaPar + "\n");
		
		for(int a : imparDigi) System.out.println("N�mero �mpar digitado:" + a);
		
		System.out.println("\nQuantidade de n�meros �mpares digitados:" + imparDigi.size());
		
	}
}
