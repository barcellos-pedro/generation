package listaExercicios;

import java.util.Scanner;

public class QuartoExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		int idade, sexo, opcao, entrevistados = 0;
		int totalCalmas = 0, mNervosas = 0, hAgressivos = 0, nervosasMaisQuarenta = 0, calmasMenosDezoito = 0;
		
		
		while(entrevistados <= 1) {
			System.out.println("Digite sua idade: ");
			idade = leitura.nextInt();
			
			System.out.println("\nDigite seu sexo | 1) Masculino ou 2) Feminino");
			sexo = leitura.nextInt();
			
			System.out.println("\nDigite a opção que você se identifica: ");
			System.out.println("\n1) Calma \t 2) Nervosa \t 3) Agressiva");
			opcao = leitura.nextInt();
			
			if(opcao == 1) { //Pessoas calmas
				totalCalmas++;
				if(idade < 18) { calmasMenosDezoito++; } //Calmas < 18
			}
			
			else if(opcao == 2) {
				if(idade > 40) { nervosasMaisQuarenta++; } //Nervosas > 40
				else if(sexo == 2) { mNervosas++; }; //Mulheres nervosas
			}
			
			else if(opcao == 3) {
				if(sexo == 1) { hAgressivos++; }; //Homens agressivos
			}
			
			entrevistados++;
		}
		
		System.out.println("\n\nNúmero de pessoas calmas: " + totalCalmas);
		System.out.println("\nNúmero de mulheres nervosas: " + mNervosas);
		System.out.println("\nNúmero de homens agressivos: " + hAgressivos);
		System.out.println("\nNúmero de pessoas nervosas com +40: " + nervosasMaisQuarenta);
		System.out.println("\nNúmero de pessoas calmas -18: " + calmasMenosDezoito);
		
	}
}
