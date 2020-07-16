package listaExerciciosPolimorfismo;

public class Cavalo extends Animal{
	Cavalo(String nome, int idade){
		super(nome, idade);
	}
	
	public void mostrarNome() {
		System.out.println(super.getNome());
	}

	public void emitirSom(String som) {
		System.out.println(som);
	}
	
	public void correrDuracao(int duracao) {
		System.out.println("Irei correr por " + duracao + " min");
	}
}
