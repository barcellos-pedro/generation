package ambienteTeste;

public class Principal {
	public static void main(String args[]) {
		Roboto robo = new Roboto("Robo 01", "Robô feito para teste de Interface", "0.1", "Pedro Barcellos", "23");
		robo.getDados();
		
		int soma = robo.soma(3, 7);
		
		System.out.println("Resultado da soma: " + soma);
		
		robo.frase1("O que que você quer de mim? hahahaha");
	}
}
