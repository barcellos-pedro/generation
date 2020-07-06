package listaExercicios;

import java.util.Scanner;

public class OitavoExercicio {
	public static void main(String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		double custoFabrica, custo_consumidor, distribuidor, impostos;

		System.out.println("Digite o custo de fábrica: ");
		custoFabrica = leitura.nextFloat();

		distribuidor = custoFabrica * 0.28;
		impostos = custoFabrica * 0.45;

		custo_consumidor = custoFabrica + distribuidor + impostos;

		System.out.println("Custo ao consumidor: " + custo_consumidor);
	}
}
