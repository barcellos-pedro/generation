package listaExercicios;

public class PrimeiroExercicio {
	public static void main(String args[]) {
		int [] a = {1, 0, 5, -2, -5, 7};
		int soma = a[0] + a[1] + a[5];
		
		System.out.println("Valor da soma: " + soma + "\n");
		
		a[4] = 100;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Na " + (i+1) + "º posição o valor é: " + a[i]);
		}
		
	}
}
