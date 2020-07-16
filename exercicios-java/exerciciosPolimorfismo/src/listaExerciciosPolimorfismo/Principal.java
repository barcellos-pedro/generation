package listaExerciciosPolimorfismo;

public class Principal {
	public static void main(String args[]) {
		Cachorro dog = new Cachorro("Freud", 5);
		dog.mostrarNome();
		dog.correrDuracao(5);
		dog.emitirSom("Au au!");
		
		System.out.println("\n####################\n");
		
		Cavalo cavalo = new Cavalo("Spirit", 23);
		cavalo.mostrarNome();
		cavalo.correrDuracao(35);
		cavalo.emitirSom("IIIIHHH Rรรรรรร!");
		
		System.out.println("\n####################\n");
		
		Preguica preguica = new Preguica("Preguicinha", 2);
		preguica.mostrarNome();
		preguica.correrDuracao(1);
		preguica.emitirSom("Zzzzz...");
		preguica.subirArvore();
	}
}
