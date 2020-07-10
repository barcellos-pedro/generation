package listaExercicios;

import java.util.Scanner;

public class PrimeiroExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		double desconto, juros, precoEtiqueta, precoFinal;
		int opcaoPagamento;
		
		System.out.println("Digite o valor do produto: ");
		precoEtiqueta = leitura.nextFloat();
		
		System.out.println("\nDigite a op��o de pagamento: ");
		System.out.println("\n 1) � vista em dinheiro ou cheque. \t 2) � vista no cart�o de cr�dito.");
		System.out.println("\n 3) Em 2x no cart�o. \t\t\t 4) Em 3x no cart�o. ");
		opcaoPagamento = leitura.nextInt();
		
		switch(opcaoPagamento) {
			case 1:
				desconto = precoEtiqueta * 0.20;
				precoFinal = precoEtiqueta - desconto;
				System.out.printf("\nTotal a pagar: R$%2.2f", precoFinal);
				System.out.printf("\nCom desconto de: R$%2.2f", desconto);
				break;
			case 2:
				desconto = precoEtiqueta * 0.15;
				precoFinal = precoEtiqueta - desconto;
				System.out.printf("\nTotal a pagar: R$%2.2f", precoFinal);
				System.out.printf("\nCom desconto de: R$%2.2f", desconto);
				break;
			case 3:
				precoFinal = precoEtiqueta;
				System.out.printf("\nTotal a pagar: R$%2.2f", precoFinal);
				break;
			case 4:
				juros = precoEtiqueta * 0.10;
				precoFinal = precoEtiqueta + juros;
				System.out.printf("\nTotal a pagar: R$%2.2f", precoFinal);
				break;
			default:
				System.out.println("Op��o inv�lida, digite novamente.");
				break;
		}
		
		/* ################################################### */
	}
}
