package listaExercicios;

public class Administrador extends Pessoa{
	private double ajudaDeCusto;
	
	public Administrador(String nome, String endereco, String telefone, String dtNascimento, String escolaridade, double ajudaDeCusto) {
		super(nome, endereco, telefone, dtNascimento, escolaridade);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

}
