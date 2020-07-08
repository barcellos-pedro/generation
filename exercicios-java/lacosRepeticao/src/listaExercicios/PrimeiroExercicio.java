package listaExercicios;

public class PrimeiroExercicio {
	public static void main(String args[]) {
		int qtd = 0;
		for(int i = 1000; i <= 1999; i++) {
			if(i % 11 == 5) {
				qtd++;
				System.out.println("\n" + i + " dividido por 11 tem resto igual a 5");
			}
		}
		System.out.println("\nQuantidade de números divididos por 11 que o resto é 5: " + qtd);
	}
}
