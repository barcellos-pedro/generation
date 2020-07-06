package listaExercicios;

import java.util.Scanner;

public class TerceiroExercicio {
	public static void main(String args[]) {
		int tempoSegundos, horas, minutos;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("\nDigite o tempo de duração do evento em segundos: ");
		tempoSegundos = leitura.nextInt();
		
		horas = tempoSegundos / 3600;
		minutos = tempoSegundos / 60;
		
		System.out.println("\nTempo do evento em minutos: " + minutos + " | Em horas: " + horas);
	}
}
