package listaExercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exemplo {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		int a,b,soma;
		float n1,n2;
		double media, raiz, pot; // Para caber o resultado de raiz quadrada na variável
		
		/*
		System.out.printf("Entre com o valor de A: ");
		a = leitura.nextInt();
		System.out.printf("Entre com o valor de B: ");
		b = leitura.nextInt();
		soma = a+b;
		System.out.printf("Valor da soma: %d", soma);
		*/
		
		JOptionPane.showMessageDialog(null, "Hello wordl!");
		
		System.out.printf("Entre com a primeira nota: ");
		n1 = leitura.nextFloat();
		System.out.printf("Entre com segunda nota: ");
		n2 = leitura.nextFloat();
	
		media = (n1+n2)/2;
		raiz = Math.sqrt(media);
		pot = Math.pow(media, 2);
		
		System.out.printf("\nResultado da média: %2.2f", media);
		System.out.printf("\nResultado da Raiz: %2.2f", raiz);
		System.out.printf("\nResultado da Potenciação: %2.2f", pot);
	}
}
