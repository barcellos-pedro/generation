package listaExercicios;

import java.util.Scanner;

public class SegundoExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		double imc, peso, altura;
		
		System.out.println("Digite seu peso: ");
		peso = leitura.nextDouble();
		
		System.out.println("\nDigite sua altura: ");
		altura = leitura.nextDouble();
		
		imc = peso / (altura * 2);
		
		if(imc < 18.50) {
			System.out.println("\nAbaixo do peso.");	
		}else if(imc >= 18.50 && imc < 25) {
			System.out.println("\nPeso normal.");
		}else if(imc >= 25 && imc <= 30) {
			System.out.println("\nAcima do peso.");
		}else if(imc > 30) {
			System.out.println("\nObeso");
		}else {
			System.out.println("\nNenhuma das categorias.");
		}
		
	}
}
