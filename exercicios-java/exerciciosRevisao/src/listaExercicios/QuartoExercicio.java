package listaExercicios;

public class QuartoExercicio {
	public static void main(String args[]) {
		int soma = 0, n = 1, d =1;
		
		while(d <= 50) {
			soma += (n/d);
			
			System.out.println("\nFração: " + n + " / " + d);
			
			n+=2;
			d++;
		}
		
		System.out.println("\nResultado da soma das frações: " + soma);
		
	}
}
